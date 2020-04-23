package modelo;

public abstract class Pokemon implements IClasificable
{
	private String nombre;
	private int puntosXP;
	protected double escudo, vitalidad, fuerza;

	public Pokemon(String nombre, double vitalidad, double fuerza, double escudo)
	{
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.escudo = escudo;
		this.puntosXP = 0;
	}

	public double getEscudo()
	{
		return this.escudo;
	}

	public double getVitalidad()
	{
		return this.vitalidad;
	}

	public double getFuerza()
	{
		return this.fuerza;
	}

	public String getNombre()
	{
		return this.nombre;
	}
	
	public void addXP(long XP)
	{
		this.puntosXP += XP;
	}

	public void ataque(Pokemon otro)
	{
		this.golpeInicial(otro);
		this.recarga();
		this.golpeFinal(otro);
	}

	public void golpeInicial(Pokemon otro)
	{
		otro.recibeDaño(this.fuerza);
		this.fuerza /= 2;
	}

	public void recarga()
	{
		System.out.println(this.nombre + " no recarga.");
	}

	public abstract void golpeFinal(Pokemon otro);

	public abstract void recibeDaño(double daño);
	
	public int getCategoria()
	{
		return this.puntosXP;
	}
}
