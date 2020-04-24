package modelo;

public class Tierra extends Pokemon
{
	public Tierra(String nombre)
	{
		super(nombre,700,20,150);
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		otro.recibeDaño(this.fuerza * 3);
	}

	@Override
	public void recibeDaño(double daño)
	{
		if (this.escudo >= daño * 0.8)
		{
			this.vitalidad -= daño * 0.2;
			this.escudo -= daño * 0.8;
		}
		else
		{
			this.vitalidad -= daño - this.escudo;
			this.escudo = 0;
		}
	}

	@Override
	public void recibeNiebla()
	{
		System.out.println("El hechizo Niebla no afecta a los Pokemon de tipo Tierra.");
	}

	@Override
	public void recibeViento()
	{
		this.escudo *= 0.66;
	}

	@Override
	public void recibeTormenta()
	{
		this.vitalidad *= 0.85;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("Los pokemon de tipo Tierra no pueden ser clonados.");
	}

	@Override
	public void curar()
	{
		this.vitalidad = 700;
	}
}
