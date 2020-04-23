package modelo;

public class Electrico extends Pokemon
{
	public Electrico(String nombre)
	{
		super(nombre, 600, 80, 50);
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		double probCritico = Math.random();
		if (probCritico > 0.75)
		{
			otro.recibeDaño(this.fuerza * 2);
			System.out.println(this.getNombre() + " realizó un ataque crítico.");
		}
		else
			otro.recibeDaño(this.fuerza);
	}

	@Override
	public void recibeDaño(double daño)
	{
		if (this.escudo >= daño * 0.1)
		{
			this.vitalidad -= daño * 0.9;
			this.escudo -= daño * 0.1;
		}
		else
		{
			this.vitalidad -= daño - this.escudo;
			this.escudo = 0;
		}
	}
}
