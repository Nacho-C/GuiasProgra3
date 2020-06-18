package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import Persistencia.IPersistencia;
import Persistencia.PersistenciaBIN;

/**
 * @author Grupo 3. <br>
 *         Clase Torneo. <br>
 *         Descripcion: Clase que emplea Patron Singleton y encargada de
 *         gestionar los Entrenadores y las rondas.
 */
public class Torneo implements Serializable
{
	/**
	 * numeroEntrenadores Numero de Entrenadores que representa la cantidad de
	 * participantes del Torneo. <br>
	 * maxHechizos Numero que representa la cantidad maxima de hechizos utilizables
	 * por los Entrenadores en el Torneo. <br>
	 * arenas ArrayList que contiene todas las rondas, para un posterior informe
	 * general. <br>
	 * entrenadores ArrayList que contiene todos los entrenadores participantes del
	 * Torneo.<br>
	 */
	private static Torneo instance = null;

	public final static int numeroEntrenadores = 16, maxHechizos = 1, cantArenasInicial = 4;

	private ArrayList<Arena> arenas = new ArrayList<Arena>();

	private ArrayList<Enfrentamiento> enfrentamientos = new ArrayList<Enfrentamiento>();

	private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>(), entrenadoresClon;
	
	private int cantPeleando, etapa = 0;

	private Torneo()
	{
	}

	/**
	 * Descripcion: Metodo para obtener la instance del Torneo. Necesario para
	 * operar con sus atributos. <br>
	 * 
	 * @return Clase Torneo.<br>
	 */
	public static Torneo getInstance()
	{
		IPersistencia persistencia = new PersistenciaBIN();
		if (Torneo.instance == null)
		{
			try
			{
				persistencia.abrirInput("Torneo.bin");
				System.out.println("Se abrió el archivo correctamente");
				Torneo.instance = (Torneo) persistencia.leer();
				System.out.println("Etapa leida: " + Torneo.getInstance().etapa);
				persistencia.cerrarInput();
			}
			catch (IOException | ClassNotFoundException e)
			{
				System.out.println("No se abrió el archivo torneo.bin");
				System.out.println("Se genera un torneo nuevo.");
				Torneo.instance = new Torneo();
			}
		}
		return Torneo.instance;
	}

	public synchronized void addEntrenador(Entrenador entrenador)
	{
		this.entrenadores.add(entrenador);
	}

	public synchronized void removeEntrenador(Entrenador entrenador)
	{
		this.entrenadores.remove(entrenador);
	}

	/**
	 * Descripcion: Metodo que comienza con el Torneo. Si la cantidad de
	 * Entrenadores en el ArrayList de entrenadores no es igual al
	 * numeroEntrenadores, no habrá rondas. <br>
	 * <b>Post:</b> Un entrenador gana el Torneo.<br>
	 */
	public void comenzarTorneo()
	{
		IPersistencia persistencia = new PersistenciaBIN();
		Iterator<Enfrentamiento> itEnfrentamientos;
		double random;
		Entrenador entrenador1 = null, entrenador2 = null;
		try
		{
			persistencia.abrirOutput("Torneo.bin");
		}
		catch (IOException e1)
		{
			//Nunca va a entrar
			System.out.println("No se puede persistir.");
		}
		if (this.etapa == 0)
			if (entrenadores.size() != Torneo.numeroEntrenadores)
			{
				//FALTA MENSAJE DE ERROR
			}
			else
			{
				for (int i = 0; i < Torneo.cantArenasInicial; i++)
					this.arenas.add(new Arena());
				entrenadoresClon = (ArrayList<Entrenador>) entrenadores.clone();
				this.etapa = 1;
				try
				{
					persistencia.escribir(this);
				}
				catch (IOException e)
				{
					System.out.println("No se puede persistir.");
				}
			}
		if (this.etapa == 1)
		{
			//Alta de entrenadores
			this.etapa = 2;
			try
			{
				persistencia.escribir(this);
			}
			catch (IOException e)
			{
				System.out.println("No se puede persistir.");
			}
		}
		if (this.etapa == 2)
		{
			//Alta de pokemones
			this.etapa = 3;
			try
			{
				persistencia.escribir(this);
			}
			catch (IOException e)
			{
				System.out.println("No se puede persistir.");
			}
		}
		
		
		
		try
		{
			persistencia.cerrarOutput();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e1)
		{
			e1.printStackTrace();
		}
		
		
		
		
		while ((this.etapa >= 3) && (this.entrenadores.size() >= 2))
		{
			System.out.println("\n\n\n\nEtapa número " + this.etapa);
			while (this.entrenadores.size() >= 2)
			{
				//Seleccion de entrenadores y creacion de enfrentamientos
				while (this.entrenadores.size() >= 2 && entrenador1 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador1 = this.entrenadores.get((int) random);
					this.entrenadores.remove(entrenador1);
					if (!entrenador1.tienePokemones())
					{
						//TIRAR EXCEPCION
						entrenador1 = null;
					}
				}
				while (this.entrenadores.size() >= 1 && entrenador2 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador2 = this.entrenadores.get((int) random);
					this.entrenadores.remove(entrenador2);
					if (!entrenador2.tienePokemones())
					{
						//TIRAR EXCEPCION
						this.entrenadores.remove(entrenador1);
						entrenador2 = null;
					}
				}
				if (entrenador1 != null && entrenador2 != null)
				{
					this.enfrentamientos.add(new Enfrentamiento(entrenador1,entrenador2));
					entrenador1 = entrenador2 = null;
				}
			}
			this.cantPeleando = this.enfrentamientos.size() * 2;
			//entrenadores - cantPeleando para saber si alguno paso de suerte
			itEnfrentamientos = this.enfrentamientos.iterator();
			while (itEnfrentamientos.hasNext())
				itEnfrentamientos.next().start();
			while (this.cantPeleando > 0)
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			this.enfrentamientos.clear();
			if (this.sobraArena())
			{
				//MENSAJE CIERRE ARENA
				System.out.println("Se eliminó la ultima arena porque sobra");
				this.arenas.remove(this.arenas.size() - 1);
			}
			this.etapa++;
			try
			{
				persistencia.escribir(this);
			}
			catch (IOException e)
			{
				System.out.println("No se puede persistir.");
			}
		}
		try
		{
			persistencia.cerrarOutput();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Descripcion: Metodo que realiza un listado final de todas las arenas al
	 * finalizar el Torneo.
	 */

	public void reporteGeneral()
	{
		int i = 1;
		Iterator<Enfrentamiento> itArenas = enfrentamientos.iterator();
		System.out.println("\n*****\nReporte general:\n");
		while (itArenas.hasNext())
			System.out.println("Ronda " + i++ + ":\n" + itArenas.next() + "\n\n*****\n");
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

	public Iterator<Arena> getItArenas()
	{
		return this.arenas.iterator();
	}

	public int getCantArenas()
	{
		return this.arenas.size();
	}

	public boolean sobraArena()
	{
		return arenas.size() > (this.entrenadores.size() + this.cantPeleando) / 2;
	}

	public synchronized void removeArena(Arena arena)
	{
		arenas.remove(arena);
	}

	public Arena getArena(int indice)
	{
		return this.arenas.get(indice);
	}

	public synchronized void restaurarPeleando()
	{
		this.cantPeleando -= 2;
	}
	
	public int getCantEntrenadores()
	{
		return (this.entrenadores.size() + this.cantPeleando);
	}
	
	public int getEtapa()
	{
		return this.etapa;
	}
}
