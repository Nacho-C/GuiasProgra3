package modelo;

import java.io.Serializable;

public class Limpieza implements IState
{
	private Arena arena;
	private String mensaje;

	public Limpieza(Arena arena)
	{
		this.arena = arena;
	}

	@Override
	public void correr()
	{
		mensaje = "Arena en estado de limpieza: \n";
		if (this.arena.getPokemonGanador().getVitalidad() <= 0)
		{
			this.arena.getGanador().removePokemon(this.arena.getPokemonGanador());
			mensaje += "El " + this.arena.getPokemonGanador().getNombre() + " de " + this.arena.getGanador().getNombre() + " muere en batalla.\n";
		}
		else
		{
			this.arena.getPokemonGanador().curar();
			mensaje += "El " + this.arena.getPokemonGanador().getNombre() + " de " + this.arena.getGanador().getNombre() + " ha sido curado.\n";
		}
		Torneo.getInstance().addEntrenador(this.arena.getGanador());
		Torneo.getInstance().restaurarPeleando();
		mensaje += "La arena quedó limpia.\n";
		this.arena.setDisponible(true);
		this.arena.setEstado(new Preliminar(this.arena));
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
}
