package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador
{
	private String nombre;
	private ArrayList<IDecorator> pokemones = new ArrayList<IDecorator>();
	public Entrenador(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void addPokemon(IDecorator pokemon)
	{
		pokemones.add(pokemon);
	}
	
	public void removePokemon(IDecorator pokemon)
	{
		pokemones.remove(pokemon);
	}
	
	public Iterator<IDecorator> getItPokemones()
	{
		return pokemones.iterator();
	}
}
