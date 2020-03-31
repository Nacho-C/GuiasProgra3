package ej5;

public abstract class Automovil
{
	protected String patente;
	protected double velocidad, velocidadMaxima;
	protected int marcha;

	public Automovil(String patente, double velocidadMaxima)
	{
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}

	public Automovil(String patente)
	{
		this(patente, 160);
	}

	public int getMarcha()
	{
		return marcha;
	}

	protected void setMarcha(int marcha)
	{
		if ((marcha >= -1) && (marcha <= 5))
			this.marcha = marcha;
	}

	public String getPatente()
	{
		return patente;
	}

	public double getVelocidad()
	{
		return velocidad;
	}
	
	abstract void acelerar(double velocidad);

	abstract void frenar(double velocidad);
}
