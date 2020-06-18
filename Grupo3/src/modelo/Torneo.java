package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Grupo 3.
 * <br>
 * Clase Torneo.
 * <br>
 * Descripcion: Clase que emplea Patron Singleton y encargada de gestionar los Entrenadores y las rondas.
 */
public class Torneo implements Serializable
{
	/**
	 * numeroEntrenadores Numero de Entrenadores que representa la cantidad de participantes del Torneo.
	 * <br>
	 * maxHechizos Numero que representa la cantidad maxima de hechizos utilizables por los Entrenadores en el Torneo.
	 * <br>
	 * arenas ArrayList que contiene todas las rondas, para un posterior informe general.
	 * <br>
	 * entrenadores ArrayList que contiene todos los entrenadores participantes del Torneo.<br>
	 */
	private static Torneo instance = null;

	public final static int numeroEntrenadores = 16, maxHechizos = 1, cantArenasInicial = 4;

	private ArrayList<Arena> arenas = new ArrayList<Arena>();
	
	private ArrayList<Enfrentamiento> enfrentamientos = new ArrayList<Enfrentamiento>();
	
	private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>(), entrenadoresClon;

	private Torneo()
	{
	}
	
	/**
	 * Descripcion: Metodo para obtener la instance del Torneo. Necesario para operar con sus atributos.
	 * <br>
	 * @return Clase Torneo.<br>
	 */
	public static Torneo getInstance()
	{
		if (Torneo.instance == null)
			Torneo.instance = new Torneo();
		return Torneo.instance;
	}

	public void addEntrenador(Entrenador entrenador)
	{
		this.entrenadores.add(entrenador);
	}

	public void removeEntrenador(Entrenador entrenador)
	{
		this.entrenadores.remove(entrenador);
	}
	/**
	 * Descripcion: Metodo que comienza con el Torneo. Si la cantidad de Entrenadores en el ArrayList de entrenadores no es igual al numeroEntrenadores, no habrá rondas.
	 * <br>
	 * <b>Post:</b> Un entrenador gana el Torneo.<br>
	 */
	public void comenzarTorneo()
	{
		double random = 0;
		Enfrentamiento arenaActual = null;
		boolean bool1 = false, bool2 = false;
		Entrenador entrenador1 = null, entrenador2 = null;
		for (int i = 0; i < Torneo.cantArenasInicial; i++)
			this.arenas.add(new Arena());
		if (entrenadores.size() != Torneo.numeroEntrenadores)
			System.out.println("No se puede comenzar el torneo porque debe haber exactamente " + Torneo.numeroEntrenadores + " entrenadores.");
		else
		{
			entrenadoresClon = (ArrayList<Entrenador>) entrenadores.clone(); //Se hace una clonacion no profunda del arreglo de entrenadores para no perder la referencia a ellos
			while (entrenadores.size() > 1)
			{
				while (entrenadores.size() > 1 && entrenador1 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador1 = this.entrenadores.get((int) random);
					if (!entrenador1.tienePokemones())
					{
						System.out.println(entrenador1.getNombre() + " queda eliminado del torneo por no tener pokemones, con " + entrenador1.getGanadas() + " rondas ganadas.\n");
						entrenadores.remove(entrenador1);
						entrenador1 = null;
					}
				}
				while (entrenadores.size() > 1 && entrenador2 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador2 = this.entrenadores.get((int) random);
					if (entrenador2 != entrenador1)
					{
						if (!entrenador2.tienePokemones())
						{
							System.out.println(entrenador2.getNombre() + " queda eliminado del torneo por no tener pokemones, con " + entrenador2.getGanadas() + " rondas ganadas.\n");
							entrenadores.remove(entrenador2);
							entrenador2 = null;
						}
					}
					else
						entrenador2 = null;
				}
				if (entrenadores.size() > 1)
				{
					arenaActual = new Enfrentamiento(entrenador1, entrenador2);
					arenaActual.pelear();
					enfrentamientos.add(arenaActual);
					entrenador1 = entrenador2 = null;
				}
			}
			System.out.println("El ganador del torneo es " + entrenadores.get(0).getNombre() + ", con " +  entrenadores.get(0).getGanadas() + " rondas ganadas.");
		}
	}
	/**
	 * Descripcion: Metodo que realiza un listado final de todas las arenas al finalizar el Torneo.
	 */
	
	public void reporteGeneral()
	{
		int i = 1;
		Iterator<Enfrentamiento> itArenas = enfrentamientos.iterator();
		System.out.println("\n*****\nReporte general:\n");
		while (itArenas.hasNext())
			System.out.println("Ronda " + i++ +":\n" + itArenas.next() + "\n\n*****\n");
	}
	
	public void clasificaciones()
	{
		Iterator<Entrenador> itEntrenadoresClon = entrenadoresClon.iterator();
		System.out.println("Clasificación de los entrenadores:\n");
		Entrenador aux = null;
		while (itEntrenadoresClon.hasNext())
		{
			aux = itEntrenadoresClon.next();
			System.out.println(aux.getNombre() + ": " + aux.getCategoria() + "\n");
		}
	}
	
	public boolean sobraArena()
	{
		return arenas.size() > entrenadores.size() / 2;
	}
	
	public void removeArena(Arena arena)
	{
		arenas.remove(arena);
	}
}
