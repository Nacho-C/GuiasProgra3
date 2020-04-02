package ej5;

abstract class Vehiculo
{
	private String modelo;
	private int numInterno;
	
	public Vehiculo(String modelo, int numInterno)
	{
		this.modelo = modelo;
		this.numInterno = numInterno;
	}	
	
	
	
	abstract boolean aceptoChofer(Chofer chofer);
}
