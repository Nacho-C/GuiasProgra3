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
	}
	
	@Override
	public void golpeFinal(Pokemon otro)
	{
		otro.recibeDaño(this.fuerza);
		this.fuerza /= 2;
	}

	@Override
	public void recibeDaño(double daño)
	{
		if (this.escudo >= daño)
			this.escudo -= daño;
		else
		{
			this.vitalidad -= daño - this.escudo;
			this.escudo = 0;
		}
	}
}
