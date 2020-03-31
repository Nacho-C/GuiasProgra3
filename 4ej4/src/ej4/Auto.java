package ej4;

public class Auto extends VehiculoPersonas
{
	public Auto(String patente, int plazas)
	{
		super(patente,plazas);
	}
	
	public double getPrecio(int cantDias)
	{
		return this.getPrecioBase() * (1 + 0.015 * this.plazas) * cantDias;
	}
}
