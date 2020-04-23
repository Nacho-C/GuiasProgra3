package modelo;

public class Tierra extends Pokemon
{
	public Tierra(String nombre)
	{
		super(nombre,700,20,300);
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
}
