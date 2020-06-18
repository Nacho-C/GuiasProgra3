package modelo;

public class Preliminar implements IState
{
	private Arena arena;
	private String mensaje;

	public Preliminar(Arena arena)
	{
		this.arena = arena;
	}

	@Override
	public void correr()
	{
		String nombre1 = this.arena.getEntrenador1().getNombre(), nombre2 = this.arena.getEntrenador2().getNombre(), pok1 = this.arena.getPokemon1().getNombre(), pok2 = this.arena.getPokemon2().getNombre();
		mensaje = "Arena en estado preliminar: \n";
		boolean hechizo1 = Math.random() > 0.5 ? true : false;
		boolean hechizo2 = Math.random() > 0.5 ? true : false;
		this.arena.setPokemon1(this.arena.getEntrenador1().getPokemonRandom());
		mensaje += "El entrenador "+ nombre1 + " elige a su " + pok1 + ".\n";
		this.arena.setPokemon2(this.arena.getEntrenador2().getPokemonRandom());
		mensaje += "El entrenador "+ nombre2 + " elige a su " + pok2 + ".\n";
		mensaje += "Pelean " + nombre1 + " con su " + this.arena.getPokemon1().getNombre() + " contra "
		+ nombre2 + " con su " + this.arena.getPokemon2().getNombre() + ".\n";
		if (hechizo1)
		{
			mensaje += "El entrenador " + nombre1 + " intenta elegir una carta.\n";
			try
			{
				this.arena.setCarta1(this.arena.getEntrenador1().sacarCartaRandom()); 
				mensaje += "Saca la carta " + this.arena.getCarta1() + ".\n";
			}
			catch (Exception e)
			{
				mensaje += e.getMessage() + "\n";
			}
		}
		if (hechizo2)
		{
			mensaje += "El entrenador " + nombre2 + " intenta elegir una carta.\n";
			try
			{
				this.arena.setCarta2(this.arena.getEntrenador2().sacarCartaRandom()); 
				mensaje += "Saca la carta " + this.arena.getCarta2() + ".\n";
			}
			catch (Exception e)
			{
				mensaje += e.getMessage() + "\n";
			}
		}
		this.arena.setEstado(new Batalla(this.arena));
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
}
