package modelo;

public class Aire extends Pokemon
{
	private double probFallar = 0.1;

	public Aire(String nombre)
	{
		super(nombre, 500, 40, 40);
	}

	@Override
	public void recarga()
	{
		this.fuerza *= 2.25;
		this.escudo *= 2;
		System.out.println(this.nombre + " recargó 125% de fuerza y 100% de vitalidad.");
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		double fallar = Math.random();
		if (fallar > probFallar)
			otro.recibeDano(this.fuerza);
		else
			System.out.println(this.getNombre() + " falló.");
	}

	@Override
	public void recibeDano(double dano)
	{
		double esquivar = Math.random();
		if (esquivar > 0.8)
			if (this.escudo >= dano)
				this.escudo -= dano;
			else
			{
				this.vitalidad -= dano - this.escudo;
				this.escudo = 0;
			}
		else
			System.out.println(this.getNombre() + " esquivó el ataque.");
	}

	@Override
	public void recibeNiebla()
	{
		this.probFallar *= 2;
	}

	@Override
	public void recibeViento()
	{
		System.out.println("El hechizo Viento no afecta a los Pokemon de tipo Aire.");
	}

	@Override
	public void recibeTormenta()
	{
		this.vitalidad *= 0.8;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("Los pokemon de tipo Aire no pueden ser clonados.");
	}

	@Override
	public void curar()
	{
		this.vitalidad = 500;
	}
}