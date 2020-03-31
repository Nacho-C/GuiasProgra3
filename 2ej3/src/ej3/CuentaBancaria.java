package ej3;

public class CuentaBancaria
{
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular)
	{
		this.titular = titular;
	}
	
	public void depositar(double monto)
	{
		if (monto > 0)
			this.saldo += monto;
	}
	
	public boolean extraer(double monto)
	{
		boolean retorno = (monto <= this.saldo) && monto > 0;
		if (retorno)
			this.saldo -= monto;
		return retorno;
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
