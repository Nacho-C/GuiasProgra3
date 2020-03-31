package ej4;

public class CamionetaDeCarga extends VehiculoCarga
{
	public CamionetaDeCarga(String patente, double capacidad)
	{
		super(patente,capacidad);
	}
	
	public double getPrecio(int cantDias)
	{
		return super.getPrecio(cantDias);
	}
}
