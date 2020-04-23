package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador implements IClasificable
{
	private String nombre;
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
	private int rondasGanadas, rondasPerdidas, rondasEmpatadas, creditos;
	public Entrenador(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void addPokemon(Pokemon pokemon)
	{
		pokemones.add(pokemon);
	}
	
	public void removePokemon(Pokemon pokemon)
	{
		pokemones.remove(pokemon);
	}
	
	public Iterator<Pokemon> getItPokemones()
	{
		return pokemones.iterator();
	}
	
	public void mostrarPokemones()
	{
		int i = 0;
		Iterator<Pokemon> itPokemones = pokemones.iterator();
		while (itPokemones.hasNext())
			System.out.println(i++ + "\t" + itPokemones.next().getNombre());
	}
	
	public Pokemon getPokemonRandom()
	{
		double random = Math.random() * (this.pokemones.size() - 1);
		return this.pokemones.get((int) random);
	}
	
	public void addGanada()
	{
		this.rondasGanadas++;
	}
	
	public void addEmpatada()
	{
		this.rondasEmpatadas++;
	}
	
	public void addPerdida()
	{
		this.rondasPerdidas++;
	}
	
	public int getCategoria()
	{
		int retorno = 0;
		Iterator<Pokemon> itPokemones = pokemones.iterator();
		while (itPokemones.hasNext())
			retorno += itPokemones.next().getCategoria();
		return retorno;
	}
}
