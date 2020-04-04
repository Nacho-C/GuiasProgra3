package ej7;

import java.util.ArrayList;

public class Mazo
{
	private static Mazo instance = null;

	private Mazo()
	{
	}

	public static Mazo getInstance()
	{
		if (Mazo.instance == null)
			Mazo.instance = new Mazo();
		return Mazo.instance;
	}

	private ArrayList<Interfaz> personajes = new ArrayList<Interfaz>();

	public void addPersonaje(Interfaz personaje)
	{
		this.personajes.add(personaje);
	}

	public void removePersonaje(Interfaz personaje)
	{
		this.personajes.remove(personaje);
	}

	public Interfaz getRandom()
	{
		int random = (int) (Math.random() * personajes.size());
		return personajes.get(random);
	}
}
