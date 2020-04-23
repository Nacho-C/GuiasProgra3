package modelo;

public class Aire extends Pokemon
{
	public Aire(String nombre)
	{
		super(nombre, 1000, 40, 40);
	}

	@Override
	public void recarga()
	{
		this.fuerza *= 2.25;
		this.escudo *= 2;
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		double probFallar = Math.random();
		if (probFallar > 0.9)
			otro.recibeDaño(this.fuerza);
		else
			System.out.println(this.getNombre() + " falló.");
	}

	@Override
	public void recibeDaño(double daño)
	{
		double probEsquivar = Math.random();
		if (probEsquivar < 0.8)
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
}
