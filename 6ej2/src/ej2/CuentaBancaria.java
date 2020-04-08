package ej2;

public class CuentaBancaria
{
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular)
	{
		this.titular = titular;
	}
	
	public void depositar(double cantidad) throws DepositoInvalidoException
	{
		if (cantidad > 0)
			this.saldo += cantidad;
		else
			throw new DepositoInvalidoException(cantidad);
	}
	
	public void extraer(double cantidad) throws ExtraccionInvalidaException
	{
		if (cantidad <= this.saldo)
			this.saldo -= cantidad;
		else
			throw new ExtraccionInvalidaException(new DatoExtraccionInvalido(this.saldo,cantidad));
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public String getTitular()
	{
		return this.titular;
	}
}
