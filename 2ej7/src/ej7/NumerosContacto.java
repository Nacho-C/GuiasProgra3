package ej7;

import java.util.ArrayList;
import java.util.Iterator;

public class NumerosContacto
{
	private long fijo;
	private ArrayList<Long> celulares = new ArrayList<Long>();
	
	public NumerosContacto(long fijo)
	{
		this.fijo = fijo;
	}

	public long getFijo()
	{
		return this.fijo;
	}

	public void setFijo(long fijo)
	{
		this.fijo = fijo;
	}

	public void addCelular(long celular)
	{
		this.celulares.add(celular);
	}
	
	public void removeCelular(long celular)
	{
		this.celulares.remove(celular);
	}
	
	public String toString()
	{
		String retorno = "Fijo: " + this.fijo + "\nCelulares:\n";
		Iterator<Long> itCelulares = this.celulares.iterator();
		while (itCelulares.hasNext())
			retorno += itCelulares.next();
		return retorno;
	}
}
