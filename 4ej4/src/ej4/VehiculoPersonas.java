package ej4;

abstract class VehiculoPersonas extends Vehiculo
{
	protected int plazas;
	
	public VehiculoPersonas(String patente, int plazas)
	{
		super(patente);
		this.plazas = plazas;
	}
}
