package ej3;

public class DatoCargaInvalida
{
	private double cantidadDisponible, cantidadRequerida;
	private String combustible;
	
	public DatoCargaInvalida(String combustible, double cantidadRequerida, double cantidadDisponible)
	{
		this.combustible = combustible;
		this.cantidadRequerida = cantidadRequerida;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public double getCantidadDisponible()
	{
		return this.cantidadDisponible;
	}
	public double getCantidadRequerida()
	{
		return this.cantidadRequerida;
	}
	public String getCombustible()
	{
		return this.combustible;
	}
	
}
