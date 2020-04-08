package ej4;

import java.util.Arrays;

public class ConjuntoNumeros implements Cloneable
{
	private Numero[] celda = new Numero[100];
	private int largo;
	private String nombre;
	
	public ConjuntoNumeros(String nombre, int largo)
	{
		int i;
		this.nombre = nombre;
		this.largo = largo;
		for (i=0;i<largo;i++)
			this.celda[i] = new Numero(40);
	}

	public Numero[] getCelda()
	{
		return this.celda;
	}

	public int getLargo()
	{
		return this.largo;
	}

	public String getNombre()
	{
		return this.nombre;
	}
	
	public void cambiarNumero(int numero, int indice)
	{
		this.celda[indice].setDato(numero);
	}
	
	@Override
	public String toString()
	{
		String retorno = "Nombre: " + this.nombre + "\nLargo: " + this.largo + "\nCelda: ";
		int i;
		for (i=0;i<this.largo;i++)
			retorno += " " + this.celda[i].getDato();
		return retorno;
	}
	
	@Override
	public Object clone()
	{
		int i;
		ConjuntoNumeros clonable;
		try
		{
			clonable = (ConjuntoNumeros) super.clone();
			clonable.celda = new Numero[100];
			for (i=0;i<largo;i++)
				clonable.celda[i] = new Numero(this.celda[i].getDato());
			return clonable;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}
}
