package ej4;

public class Numero
{
	private int dato;
	
	public Numero(int dato)
	{
		this.dato = dato;
	}

	public int getDato()
	{
		return this.dato;
	}

	public void setDato(int dato)
	{
		this.dato = dato;
	}
	
	public String toString()
	{
		return "" + this.dato;
	}
}
