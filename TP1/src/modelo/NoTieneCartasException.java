package modelo;

public class NoTieneCartasException extends Exception
{
	public NoTieneCartasException(String mensaje)
	{
		super(mensaje);
	}
}
