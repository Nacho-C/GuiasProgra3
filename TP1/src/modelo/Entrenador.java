package modelo;

import java.util.ArrayList;
import java.util.Iterator;
/**	
 * @author Grupo 3.
 * <br>
 * Clase Entrenador
 * <br>
 * Descripcion: Clase que implementa la interfaz clasificable, y que contiene diferentes conjuntos de Pokemones y cartas.<br>
 */

public class Entrenador implements IClasificable
{
	/**
	 * cartas ArrayList que almacena todas las cartas del Entrenador.
	 * <br>
	 * pokemones Arraylist que almacena todos los Pokemones del Entrenador.
	 * <br>
	 * rondasGandas Contador progresivo de rondas ganadas por el entrenador.
	 * <br>
	 * hechizosDisponibles Contador regresivo de hechizos disponibles para utilizar en batalla.
	 * <br>
	 * creditos Ganancia del Entrenador por cada victoria en la arena.
	 * <br>
	 */
	private String nombre;
	private ArrayList<ICartaHechizo> cartas = new ArrayList<ICartaHechizo>();
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
	private int rondasGanadas, hechizosDisponibles;
	private double creditos;

	public Entrenador(String nombre)
	{
		this.nombre = nombre;
		this.creditos = this.rondasGanadas = 0;
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
	
	public Iterator<ICartaHechizo> getItCartas()
	{
		return cartas.iterator();
	}
	
	/**
	 * Descripcion: Metodo que itera en el ArrayList pokemones y genera un listado de estos.<br>
	 */
	public void mostrarPokemones()
	{
		int i = 0;
		Iterator<Pokemon> itPokemones = pokemones.iterator();
		while (itPokemones.hasNext())
			System.out.println(i++ + "\t" + itPokemones.next().getNombre());
	}
	
	/**
	 * Descripcion: Metodo que itera en el ArrayList cartas y genera un listado de estas.<br>
	 */
	public void mostrarCartas()
	{
		int i = 0;
		Iterator<ICartaHechizo> itCartas = cartas.iterator();
		while (itCartas.hasNext())
			System.out.println(i++ + "\t" + itCartas.next());
	}
	
	/**
	 * Descripcion: Metodo que obtiene un Pokemon de manera aleatoria entre los disponibles del ArrayList pokemones.
	 * <br>
	 * <b>Pre: El entrenador tiene que tener Pokemones en su ArrayList.
	 * <br>
	 * <b>Post: Se devuelve un Pokemon del arrayList.
	 * <br>
	 * @return Objeto Pokemon.<br>
	 */
	public Pokemon getPokemonRandom()
	{
		double random = Math.random() * (this.pokemones.size() - 1);
		return this.pokemones.get((int) random);
	}
	
	/**
	 * Descripcion: Metodo que obtiene una carta de manera aleatoria entre las disponibles del ArrayList cartas. 
	 * <br>
	 * <b>Post: Se devuelve una carta del arrayList
	 * @return Interfaz ICartaHechizo.
	 * <br>
	 * @throws Exception Se lanzan dos tipos de excepciones, cuando ya alcanzó el limite de hechizos por torneo (LimiteHechizosException) o cuando no tiene cartas en el ArrayList cartas (NoTieneCartasException).<br>
	 */
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

	public int getGanadas()
	{
		return this.rondasGanadas;
	}
	
	public void addGanada()
	{
		this.rondasGanadas++;
	}
	
	/**
	 * Descripcion: Este metodo itera en el ArrayList pokemones y obtiene la categoria de un entrenador, siendo esta la suma de la experiencia de sus Pokemones.
	 */
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
	
	/**
	 * Descripcion: Metodo que clona una instancia de Entrenador, mediante una clonacion profunda, tanto para pokemones como para cartas.
	 * <br>
	 * @throws CloneNotSupportedException excepcion que se lanza cuando no es posible realizar la clonacion de un Pokemon del ArrayList pokemones.
	 * <br>
	 * @return Objeto Object.
	 */
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
	/**
	 * Descripcion: Metodo que chequea si el ArrayList pokemones está vacio o no.
	 * <br>
	 * @return boolean.
	 */
	public boolean tienePokemones()
	{
		return !this.pokemones.isEmpty();
	}
}
