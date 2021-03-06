package ej6;

import java.util.ArrayList;
import java.util.Iterator;

public class Directorio extends Archivo
{
	private ArrayList<Directorio> subDirectorios = new ArrayList<Directorio>();
	private ArrayList<Archivo> archivos = new ArrayList<Archivo>();

	public Directorio(String nombre)
	{
		super(nombre);
	}

	public void agregarArchivo(Archivo archivo)
	{
		archivos.add(archivo);
	}

	public void eliminarArchivo(Archivo archivo)
	{
		archivos.remove(archivo);
	}

	public void agregarDirectorio(Directorio directorio)
	{
		subDirectorios.add(directorio);
	}

	public void eliminarDirectorio(Directorio directorio)
	{
		subDirectorios.remove(directorio);
	}

	public ArrayList<Directorio> getSubDirectorios()
	{
		return subDirectorios;
	}

	public ArrayList<Archivo> getArchivos()
	{
		return archivos;
	}

	@Override
	public double getTamaño()
	{
		double retorno = 0;
		Iterator<Archivo> itArchivo = archivos.iterator();
		while (itArchivo.hasNext())
			retorno += itArchivo.next().getTamaño();
		Iterator<Directorio> itDirectorio = subDirectorios.iterator();
		while (itDirectorio.hasNext())
			retorno += itDirectorio.next().getTamaño();
		return retorno;
	}

	public Archivo buscaArchivo(String nombre)
	{
		Archivo auxArchivo = null, retorno = null, retornoRecursivo = null;
		boolean encontro = false;
		Directorio auxDirectorio;
		Iterator<Archivo> itArchivo = archivos.iterator();
		Iterator<Directorio> itDirectorio = subDirectorios.iterator();
		while (itArchivo.hasNext() && !encontro)
		{
			auxArchivo = itArchivo.next();
			encontro = auxArchivo.getNombre().equals(nombre);
		}
		if (encontro)
			retorno = auxArchivo;
		else
			while (itDirectorio.hasNext() && !encontro)
			{
				auxDirectorio = itDirectorio.next();
				if (auxDirectorio.getNombre().equals(nombre))
				{
					encontro = true;
					retorno = auxDirectorio;
				}
				else
				{
					retornoRecursivo = auxDirectorio.buscaArchivo(nombre);
					if (retornoRecursivo != null)
					{
						encontro = true;
						retorno = retornoRecursivo;
					}
				}
			}
		return retorno;
	}
}
