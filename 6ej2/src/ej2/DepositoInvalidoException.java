package ej2;

public class DepositoInvalidoException extends Exception
{
	private double cantidadInvalida;
	
	public DepositoInvalidoException(double cantidadInvalida)
	{
		super("No se pudo realizar el depósito");
		this.cantidadInvalida = cantidadInvalida;
	}
	
	public double getCantidadInvalida()
	{
		return this.cantidadInvalida;
	}
}
