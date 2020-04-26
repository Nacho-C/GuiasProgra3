package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase NotieneCartasException
 * <br>
 * Descripcion: Excepcion que se lanza cuando un Entrenador quiere lanzar un hechizo y no tiene cartas.<br>
 */

public class NoTieneCartasException extends Exception
{
	public NoTieneCartasException(String mensaje)
	{
		super(mensaje);
	}
}
