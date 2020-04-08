package ej1;

public class ContrasenaInvalidaException extends Exception
{
	protected ContrasenaInvalidaException(String causa)
	{
		super("Contraseña invalida: " + causa);
	}
}
