package modelo;

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
		if (Torneo.getInstance().sobraArena())
		{
			mensaje = "Arena en estado de cierre definitivo: \n";
			this.arena.setEstado(new CierreDefinitivo(this.arena));
			Torneo.getInstance().removeArena(this.arena);
			this.arena.setDisponible(false);
		}
		else
		{
			/*this.arena.setGanador(null);
			this.arena.setPerdedor(null);
			this.arena.setCarta1(null);
			this.arena.setCarta2(null);
			this.arena.setCartaGanada(null);
			this.arena.setErrorHechizo1(null);
			this.arena.setErrorHechizo2(null);
			this.arena.setPokemon1(null);
			this.arena.setPokemon2(null);
			this.arena.setPokemonGanador(null);
			this.arena.setPokemonPerdedor(null);*/
			this.arena.setDisponible(true);
			this.arena.setEstado(new Preliminar(this.arena));
		}
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
}
