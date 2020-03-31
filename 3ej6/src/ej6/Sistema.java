package ej6;

import java.util.ArrayList;

public class Sistema
{
	private ArrayList<Archivo> archivos = new ArrayList<Archivo>();
	private static Sistema instance = null;
	
	private Sistema()
	{
	}
	
	public static Sistema getInstance()
	{
		if (Sistema.instance == null)
			Sistema.instance = new Sistema();
		return instance;
	}
	
	public void añadir(Archivo archivo)
	{
		this.archivos.add(archivo);
	}
	
	public void eliminar(Archivo archivo)
	{
		this.archivos.remove(archivo);
	}
}
