package ej4;

public class Camion extends VehiculoCarga
{
	public Camion(String patente, double capacidad)
	{
		super(patente,capacidad);
	}
	
	public double getPrecio(int cantDias)
	{
		return super.getPrecio(cantDias) + this.getPrecioBase() * 1.4;
	}
}
