package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Mapa
{
	private String nombre;
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

	private static Mapa instance = null;

	private Mapa()
	{
	}

	public static Mapa getInstance()
	{
		if (Mapa.instance == null)
			Mapa.instance = new Mapa();
		return instance;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void agregarPersonaje(Personaje personaje)
	{
		this.personajes.add(personaje);
	}

	public void borrarPersonaje(Personaje personaje)
	{
		this.personajes.remove(personaje);
	}

	public Iterator<Personaje> iterator()
	{
		return this.personajes.iterator();
	}

}
