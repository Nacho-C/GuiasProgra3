package modelo;

public class Aire extends Pokemon
{
	private double probFallar = 0.1;

	public Aire(String nombre)
	{
		super(nombre, 700, 40, 40);
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
			otro.recibeDaño(this.fuerza);
		else
			System.out.println(this.getNombre() + " falló.");
	}

	@Override
	public void recibeDaño(double daño)
	{
		double esquivar = Math.random();
		if (esquivar > 0.8)
			if (this.escudo >= daño)
				this.escudo -= daño;
			else
			{
				this.vitalidad -= daño - this.escudo;
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
		this.vitalidad = 700;
	}
}
