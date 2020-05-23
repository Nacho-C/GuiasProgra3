package modelo;

public class OperacionConjuntoInvalidaException extends Exception
{
	private Object elemento;
	
	public OperacionConjuntoInvalidaException(String string, Object elemento)
	{
		super(string);
		this.elemento = elemento;
	}
	
	public Object getElemento()
	{
		return this.elemento;
	}
}
