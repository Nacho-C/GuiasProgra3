package ej4;

abstract class Vehiculo
{
	protected String patente;
	protected static double precioBase = 500;
	
	public Vehiculo(String patente)
	{
		this.patente = patente;
	}
	
	abstract double getPrecio(int cantDias);
	
	public double getPrecioBase()
	{
		return Vehiculo.precioBase;
	}
}
