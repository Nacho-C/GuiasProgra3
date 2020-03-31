package ej5;

public class Colectivo
{
	private static int siguienteNumero = 0;
	private String modelo;
	private int numeroInterno;

	public Colectivo(String modelo)
	{
		Colectivo.siguienteNumero++;
		this.numeroInterno = Colectivo.siguienteNumero;
		this.modelo = modelo;
	}

	public String getModelo()
	{
		return this.modelo;
	}

	public int getNumeroInterno()
	{
		return this.numeroInterno;
	}

	@Override
	public String toString()
	{
		return "modelo " + this.modelo + ", número interno " + this.numeroInterno;
	}
	
}
