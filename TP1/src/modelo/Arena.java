package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Arena.
 * <br>
 * Descripcion: Clase que simula una ronda del Torneo, la cual pelean dos Entrenadores con sus respectivos Pokemones.<br>
 */

public class Arena
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
	private Entrenador entrenador1, entrenador2, ganador, perdedor;
	private Pokemon pokemon1, pokemon2, pokemonGanador, pokemonPerdedor;

	public Arena(Entrenador entrenador1, Entrenador entrenador2)
	{
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}
	
	/**
	 * Descripcion: Metodo donde combaten pokemon1 y pokemon2 de sus respectivos Entrenadores.
	 * <br>
	 * @param hechizo1 boolean que determina si el Entrenador1 utiliza carta hechizo.
	 * <br>
	 * @param hechizo2 boolean que determina si el Entrenador2 utiliza carta hechizo.
	 * <br>
	 * <b>Pre:</b> Ambos Entrenadores tienen Pokemones disponibles para combatir.
	 * <br>
	 * <b>Post:</b> Resulta ganador el Entrenador con el Pokemon que obtenga el mayor puntaje.<br>
	 */
	public void pelear(boolean hechizo1, boolean hechizo2)
	{
		ICartaHechizo carta1 = null, carta2 = null;
		double random = Math.random(), puntaje1, puntaje2;
		pokemon1 = entrenador1.getPokemonRandom();
		pokemon2 = entrenador2.getPokemonRandom();
		System.out.println("Pelean " + entrenador1.getNombre() + " con su " + pokemon1.getNombre() + " contra "
				+ entrenador2.getNombre() + " con su " + pokemon2.getNombre() + ".");
		if (hechizo1)
		{
			try
			{
				carta1 = entrenador1.sacarCartaRandom();
				System.out.println(entrenador1.getNombre() + " usó su carta " + carta1 + " en el "
						+ pokemon2.getNombre() + " enemigo.");
				carta1.hechizar(pokemon2);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		if (hechizo2)
		{
			try
			{
				carta2 = entrenador2.sacarCartaRandom();
				System.out.println(entrenador2.getNombre() + " usó su carta " + carta2 + " en el "
						+ pokemon1.getNombre() + " enemigo.");
				carta2.hechizar(pokemon1);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		if (random > 0.5)
		{
			System.out.println(pokemon2.getNombre() + " ataca a " + pokemon1.getNombre());
			pokemon2.ataque(pokemon1);
			System.out.println(pokemon1.getNombre() + " contraataca a " + pokemon2.getNombre());
			pokemon1.ataque(pokemon2);	
		}
		else
		{
			System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre());
			pokemon1.ataque(pokemon2);
			System.out.println(pokemon2.getNombre() + " contraataca a " + pokemon1.getNombre());
			pokemon2.ataque(pokemon1);	
		}
		puntaje1 = pokemon1.getVitalidad() + 2 * pokemon1.getFuerza() + 0.5 * pokemon1.getEscudo();
		puntaje2 = pokemon2.getVitalidad() + 2 * pokemon2.getFuerza() + 0.5 * pokemon2.getEscudo();
		if (puntaje1 > puntaje2)
			this.finalPelea(entrenador1,pokemon1,entrenador2,pokemon2,carta2);
		else
			if (puntaje2 > puntaje1)
				this.finalPelea(entrenador2,pokemon2,entrenador1,pokemon1,carta1);
			else
				if (entrenador1.getCategoria() <= entrenador2.getCategoria())
					this.finalPelea(entrenador1,pokemon1,entrenador2,pokemon2,carta2);
				else
					this.finalPelea(entrenador2,pokemon2,entrenador1,pokemon1,carta1);
	}
	
	/**
	 * Descripcion: Metodo que actualiza las estadisticas del ganador y del perdedor. El perdedor queda eliminado del torneo, y el ganador sigue. El pokemon ganador, si no murio en batalla, es curado a sus estadisticas base.
	 * <br>
	 * @param carta Si el perdedor utilizo una carta, el ganador la obtiene como premio.
	 */
	private void finalPelea(Entrenador ganador, Pokemon pokemonGanador, Entrenador perdedor, Pokemon pokemonPerdedor, ICartaHechizo carta)
	{
		ganador.addGanada();
		this.ganador = ganador;
		this.perdedor = perdedor;
		this.pokemonGanador = pokemonGanador;
		this.pokemonPerdedor = pokemonPerdedor;
		System.out.println(ganador.getNombre() + " gana.");
		System.out.println(perdedor.getNombre() + " queda eliminado del torneo con " + perdedor.getGanadas() + " rondas ganadas.");
		pokemonGanador.addXP(3);
		pokemonPerdedor.addXP(1);
		ganador.ganarCreditos(perdedor.getCategoria() * 0.4);
		System.out.println(ganador.getNombre() + " tiene " + ganador.getCreditos() + " créditos.");
		if (carta != null)
		{
			System.out.println(ganador.getNombre() + " recibe la carta " + carta + " usada por " + perdedor.getNombre() + ".");
			ganador.addCarta(carta);
		}
		Torneo.getInstance().removeEntrenador(perdedor);
		if (pokemonGanador.getVitalidad() <= 0)
		{
			ganador.removePokemon(pokemonGanador);
			System.out.println("El " + pokemonGanador.getNombre() + " de " + ganador.getNombre() + " muere en batalla.");
		}
		else
			pokemonGanador.curar();
		System.out.println("\n******\n");
	}
	
	@Override
	public String toString()
	{
		return "Ganador: " + this.ganador.getNombre() + " con su " + this.pokemonGanador.getNombre() + "\nPerdedor: " + this.perdedor.getNombre() + " con su " + this.pokemonPerdedor.getNombre();
	}
}