package ej4;

abstract class VehiculoCarga extends Vehiculo
{
	protected double capacidad;
	
	public VehiculoCarga(String patente, double capacidad)
	{
		super(patente);
		this.capacidad = capacidad;
	}
	
	protected double getPrecio(int cantDias)
	{
		return this.getPrecioBase() * 1.2 * cantDias;
	}
}
