package ej4;

public class Combi extends VehiculoPersonas
{
	public Combi(String patente, int plazas)
	{
		super(patente,plazas);
	}
	/**
	 * Author: Los Robert
	 * <br>
	 * *Esto hace esto xd
	 *  
	 */
	public double getPrecio(int cantDias)
	{
		return this.getPrecioBase() * cantDias + this.getPrecioBase() * (0.02 * this.plazas);
	}
}
