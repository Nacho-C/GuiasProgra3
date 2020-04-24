package modelo;

public class Hielo extends Pokemon
{
	private boolean granRecarga;

	public Hielo(String nombre, boolean granRecarga)
	{
		super(nombre, 500, 100, 120);
		this.granRecarga = granRecarga;
	}

	@Override
	public void recarga()
	{
		if (granRecarga)
		{
			this.fuerza = 400;
			System.out.println(this.nombre + " recargó su fuerza a 400.");
		}
		else
		{
			this.fuerza *= 1.1;
			this.vitalidad *= 1.1;
			System.out.println(this.nombre + " recargó 10% de fuerza y 10% de vitalidad.");
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

	@Override
	public void recibeNiebla()
	{
		this.fuerza *= 0.7;
	}

	@Override
	public void recibeViento()
	{
		System.out.println("El hechizo Viento no afecta a los Pokemon de tipo Hielo.");
	}

	@Override
	public void recibeTormenta()
	{
		this.escudo *= 0.75;
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
