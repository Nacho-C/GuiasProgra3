package modelo;

public class Fuego extends Pokemon
{
	public Fuego(String nombre)
	{
		super(nombre, 530, 80, 200);
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
		otro.recibeDaño(this.fuerza * 1.25);
		this.fuerza = 0;
	}

	@Override
	public void recibeDaño(double daño)
	{
		if (this.escudo >= daño / 2)
		{
			this.vitalidad -= daño / 2;
			this.escudo -= daño / 2;
		}
		else
		{
			this.vitalidad -= daño - this.escudo;
			this.escudo = 0;
		}
	}
}
