package ej5;

public abstract class Vehiculo
{
	private String modelo;
	private int numInterno;

	public Vehiculo(String modelo, int numInterno)
	{
		this.modelo = modelo;
		this.numInterno = numInterno;
	}

	abstract boolean aceptoChofer(Chofer chofer);

	public String getModelo()
	{
		return modelo;
	}

	public int getNumInterno()
	{
		return numInterno;
	}

	@Override
	public String toString()
	{
		return "Número Interno: " + this.numInterno + "\nModelo: " + this.modelo;
	}
}
