package ej5;

abstract class Colectivo extends Vehiculo
{
	protected int cantPasajeros;
	private static int numeroInterno = 1;

	public Colectivo(String modelo, int cantPasajeros)
	{
		super(modelo, Colectivo.numeroInterno);
		Colectivo.numeroInterno++;
		this.cantPasajeros = cantPasajeros;
	}

	public int getCantPasajeros()
	{
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros)
	{
		this.cantPasajeros = cantPasajeros;
	}

	public String toString()
	{
		return super.toString() + "\nCantidad de pasajeros: " + this.cantPasajeros;
	}

}
