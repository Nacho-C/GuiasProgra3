package modelo;

public class Arena
{
	private Entrenador entrenador1, entrenador2;
	private Pokemon pokemon1, pokemon2;
	
	public Arena(Entrenador entrenador1, Entrenador entrenador2)
	{
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}
	
	public void ronda()
	{
		double random = Math.random(), puntaje1, puntaje2;
		pokemon1 = entrenador1.getPokemonRandom();
		pokemon2 = entrenador2.getPokemonRandom();
		if (random > 0.5)
		{
			pokemon2.ataque(pokemon1);
			pokemon1.ataque(pokemon2);
		}
		else
		{
			pokemon1.ataque(pokemon2);
			pokemon2.ataque(pokemon1);
		}
		puntaje1 = pokemon1.getVitalidad() + 2 * pokemon1.getFuerza() + 0.5 * pokemon1.getEscudo();
		puntaje2 = pokemon2.getVitalidad() + 2 * pokemon2.getFuerza() + 0.5 * pokemon2.getEscudo();
		if (puntaje1 > puntaje2)
		{
			pokemon1.addXP(3);
			pokemon2.addXP(1);
			entrenador1.addGanada();
			entrenador2.addPerdida();
		}
		else
			if (puntaje2 > puntaje1)
			{
				pokemon1.addXP(1);
				pokemon2.addXP(3);
				entrenador2.addGanada();
				entrenador1.addPerdida();
			}
			else
			{
				pokemon1.addXP(2);
				pokemon2.addXP(2);
				entrenador1.addEmpatada();
				entrenador2.addEmpatada();
			}
	}
}
