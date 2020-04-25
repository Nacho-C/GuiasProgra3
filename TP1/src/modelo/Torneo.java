package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Torneo
{
	private static Torneo instance = null;

	public final static int numeroEntrenadores = 16, maxHechizos = 1;

	private ArrayList<Arena> arenas = new ArrayList<Arena>();
	
	private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();

	private Torneo()
	{
	}

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

	public void comenzarTorneo()
	{
		double random = 0;
		Arena arenaActual = null;
		boolean bool1 = false, bool2 = false;
		Entrenador entrenador1 = null, entrenador2 = null;
		if (entrenadores.size() != Torneo.numeroEntrenadores)
			System.out.println("No se puede comenzar el torneo porque debe haber exactamente " + Torneo.numeroEntrenadores + " entrenadores.");
		else
		{
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
					bool1 = Math.random() > 0.5 ? true : false;
					bool2 = Math.random() > 0.5 ? true : false;
					arenaActual = new Arena(entrenador1, entrenador2);
					arenaActual.pelear(bool1, bool2);
					arenas.add(arenaActual);
					entrenador1 = entrenador2 = null;
				}
			}
			System.out.println("El ganador del torneo es " + entrenadores.get(0).getNombre() + ", con " +  entrenadores.get(0).getGanadas() + " rondas ganadas.");
		}
	}
	
	public void reporteGeneral()
	{
		int i = 1;
		Iterator<Arena> itArenas = arenas.iterator();
		System.out.println("\n*****\nReporte general:\n");
		while (itArenas.hasNext())
			System.out.println("Ronda " + i++ +":\n" + itArenas.next() + "\n\n*****\n");
	}
}
