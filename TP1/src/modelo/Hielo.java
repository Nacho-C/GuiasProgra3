package modelo;

public class Hielo extends Pokemon
{
	private boolean granRecarga;
	
	public Hielo(String nombre, boolean granRecarga)
	{
		super(nombre,500,100,120);
		this.granRecarga = granRecarga;
	}

	@Override
	public void recarga()
	{
		if (granRecarga)
			this.fuerza = 400;
		else
		{
			this.fuerza *= 1.1;
			this.vitalidad *= 1.1;
		}
	}
	
	@Override
	public void golpeFinal(Pokemon otro)
	{
		otro.recibeDaño(this.fuerza * 0.9);
	}

	@Override
	public void recibeDaño(double daño)
	{
		if (this.escudo >= daño * 0.75)
		{
			this.vitalidad -= daño * 0.25;
			this.escudo -= daño * 0.75;
		}
		else
		{
			this.vitalidad -= daño - this.escudo;
			this.escudo = 0;
		}
	}
}
