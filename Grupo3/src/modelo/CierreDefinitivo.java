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
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
	
}
