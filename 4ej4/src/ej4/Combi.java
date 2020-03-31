package ej4;

public class Combi extends VehiculoPersonas
{
	public Combi(String patente, int plazas)
	{
		super(patente,plazas);
	}
	
	public double getPrecio(int cantDias)
	{
		return this.getPrecioBase() * cantDias + this.getPrecioBase() * (0.02 * this.plazas);
	}
}
