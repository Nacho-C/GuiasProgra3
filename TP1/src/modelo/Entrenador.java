package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador implements IClasificable
{
	private String nombre;
	private ArrayList<ICartaHechizo> cartas = new ArrayList<ICartaHechizo>();
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
	private int rondasGanadas, rondasPerdidas, rondasEmpatadas, hechizosDisponibles;
	private double creditos;

	public Entrenador(String nombre)
	{
		this.nombre = nombre;
		this.creditos = this.rondasGanadas = this.rondasEmpatadas = this.rondasPerdidas = 0;
		this.hechizosDisponibles = Torneo.maxHechizos;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void addPokemon(Pokemon pokemon)
	{
		pokemones.add(pokemon);
	}

	public void removePokemon(Pokemon pokemon)
	{
		pokemones.remove(pokemon);
	}

	public void addCarta(ICartaHechizo carta)
	{
		cartas.add(carta);
	}

	public void removeCarta(ICartaHechizo carta)
	{
		cartas.remove(carta);
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

	public Iterator<ICartaHechizo> getItCartas()
	{
		return cartas.iterator();
	}

	public void mostrarCartas()
	{
		int i = 0;
		Iterator<ICartaHechizo> itCartas = cartas.iterator();
		while (itCartas.hasNext())
			System.out.println(i++ + "\t" + itCartas.next());
	}

	public ICartaHechizo sacarCartaRandom() throws Exception
	{
		ICartaHechizo retorno = null;
		if (!this.cartas.isEmpty())
		{
			if (this.hechizosDisponibles > 0)
			{
				retorno = this.cartas.get((int) (Math.random() * 0.99 * this.cartas.size()));
				this.hechizosDisponibles--;
				this.cartas.remove(retorno);
			}
			else
				throw new LimiteHechizosException("Ya se alcanzó el límite de hechizos para " + this.nombre + ".");
		}
		else
			throw new NoTieneCartasException(this.nombre + " no tiene cartas de hechizo.");
		return retorno;
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

	public double getCreditos()
	{
		return this.creditos;
	}

	public void ganarCreditos(double creditos)
	{
		this.creditos += creditos;
	}

	public void perderCreditos(double creditos)
	{
		this.creditos -= creditos;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Entrenador clon = (Entrenador) super.clone();
		Iterator<Pokemon> itPokemones = pokemones.iterator();
		clon.pokemones = new ArrayList<Pokemon>();
		while (itPokemones.hasNext())
			clon.pokemones.add((Pokemon) itPokemones.next().clone());
		Iterator<ICartaHechizo> itCartas = cartas.iterator();
		clon.cartas = new ArrayList<ICartaHechizo>();
		while (itCartas.hasNext())
			clon.cartas.add((ICartaHechizo) itCartas.next().clone());
		return clon;
	}
	
	public boolean tienePokemones()
	{
		return !this.pokemones.isEmpty();
	}
}
