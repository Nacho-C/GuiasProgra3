package modelo;

import java.io.Serializable;
import java.util.Iterator;

/**
 * @author Grupo 3.
 * <br>
 * Clase Arena.
 * <br>
 * Descripcion: Clase que simula una ronda del Torneo, la cual pelean dos Entrenadores con sus respectivos Pokemones.<br>
 */

public class Enfrentamiento extends Thread implements Serializable
{
	/**
	 * entrenador1 entrenador2 Entrenadores que presentaran un Pokemon en la arena.
	 * <br>
	 * pokemon1 pokemon2 Pokemones que se enfrentaran en la arena.
	 * <br>
	 * pokemonGanador Pokemon que resulto victorioso.
	 * <br>
	 * pokemonPerdedor Pokemon que resulto derrotado.
	 * <br>
	 * ganador Entrenador que gano con su respectivo pokemonGanador.
	 * <br>
	 * perdedor Entrenador que perdio con su respectivo pokemonPerdedor.<br>
	 */
	private Entrenador entrenador1, entrenador2;

	public Enfrentamiento(Entrenador entrenador1, Entrenador entrenador2)
	{
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}
	
	@Override
	public void run()
	{
		Arena arena = null;
		Iterator<Arena> it = Torneo.getInstance().getItArenas();
		arena = it.next();
		while (it.hasNext() && arena != null && !arena.isDisponible())
		{
			arena = it.next();
		}
		if (!it.hasNext() && !arena.isDisponible())
		{
			int r = (int) (0.99 * Math.random() * Torneo.getInstance().getCantArenas());
			arena = Torneo.getInstance().getArena(r);
		}
		arena.iniciar(this.entrenador1, this.entrenador2);
	}
	
	/*@Override
	public String toString()
	{
		return "Ganador: " + this.ganador.getNombre() + " con su " + this.pokemonGanador.getNombre() + "\nPerdedor: " + this.perdedor.getNombre() + " con su " + this.pokemonPerdedor.getNombre();
	}*/
}