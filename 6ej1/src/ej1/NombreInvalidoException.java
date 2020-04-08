package ej1;

public class NombreInvalidoException extends Exception
{
	protected NombreInvalidoException(String causa)
	{
		super("Nombre invalido: " + causa);
	}
}
