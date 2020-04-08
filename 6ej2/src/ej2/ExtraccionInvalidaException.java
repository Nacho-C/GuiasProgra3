package ej2;

public class ExtraccionInvalidaException extends Exception
{
	private DatoExtraccionInvalido dato;
	
	public ExtraccionInvalidaException(DatoExtraccionInvalido dato)
	{
		super("No se pudo realizar la extracción");
		this.dato = dato;
	}
	
	public DatoExtraccionInvalido getDato()
	{
		return this.dato;
	}
}
