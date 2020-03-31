package ej4;

public abstract class Empleado
{
	protected String nombre, domicilio;
	protected long numeroLegajo;

	public Empleado(String nombre, String domicilio, long numeroLegajo)
	{
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.numeroLegajo = numeroLegajo;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getNombre()
	{
		return nombre;
	}

	public long getNumeroLegajo()
	{
		return numeroLegajo;
	}

	abstract double getSueldoNeto();
}
