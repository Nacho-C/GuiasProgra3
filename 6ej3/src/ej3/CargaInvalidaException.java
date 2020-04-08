package ej3;

public class CargaInvalidaException extends Exception
{
	private DatoCargaInvalida dato;
	
	public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible)
	{
		super(mensaje);
		dato = new DatoCargaInvalida(combustible,cantidadRequerida,cantidadDisponible);
	}

	public DatoCargaInvalida getDato()
	{
		return this.dato;
	}
	
}
