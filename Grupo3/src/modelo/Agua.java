package modelo;

public class Agua extends Pokemon
{
	public Agua(String nombre)
	{
		super(nombre,500,120,100);
	}

	@Override
	public void recarga()
	{
		this.fuerza *= 1.1;
		this.vitalidad *= 1.1;
		System.out.println(this.nombre + " recargó 10% de fuerza y 10% de vitalidad.");
	}
	
	@Override
	public void golpeFinal(Pokemon otro)
	{
		otro.recibeDano(this.fuerza);
		this.fuerza /= 2;
	}

	@Override
	public void recibeDano(double dano)
	{
		if (this.escudo >= dano)
			this.escudo -= dano;
		else
		{
			this.vitalidad -= dano - this.escudo;
			this.escudo = 0;
		}
	}

	@Override
	public void recibeNiebla()
	{
		this.fuerza *= 0.8;
	}

	@Override
	public void recibeViento()
	{
		this.escudo *= 0.85;
	}

	@Override
	public void recibeTormenta()
	{
		System.out.println("El hechizo Tormenta no afecta a los Pokemon de tipo Agua.");
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	@Override
	public void curar()
	{
		this.vitalidad = 500;
	}
}
