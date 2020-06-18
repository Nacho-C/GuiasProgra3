package modelo;

public class CierreDefinitivo implements IState
{
	private Arena arena;
	private String mensaje;

	public CierreDefinitivo(Arena arena)
	{
		this.arena = arena;
	}

	@Override
	public void correr()
	{
		mensaje = "Arena en estado de cierre definitivo: \n";
		//ESTO SE VA A ROMPER
		
		Torneo.getInstance().removeArena(this.arena);
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
	
}
