package modelo;

public class Electrico extends Pokemon
{
	private double probCritico = 0.25;

	public Electrico(String nombre)
	{
		super(nombre, 600, 80, 50);
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		double critico = Math.random();
		if (critico < probCritico)
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

	@Override
	public void recibeNiebla()
	{
		this.probCritico *= 0.4;
	}

	@Override
	public void recibeViento()
	{
		this.vitalidad *= 0.85;
	}

	@Override
	public void recibeTormenta()
	{
		System.out.println("El hechizo Tormenta no afecta a los Pokemon de tipo Eléctrico.");
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	@Override
	public void curar()
	{
		this.vitalidad = 600;
	}
}
