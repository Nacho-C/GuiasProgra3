package ej1;

public class CuentaBancaria
{
	private double saldo;
	private String titular;
	
	public void depositar(double cantidad)
	{
		this.saldo += cantidad;
	}
	public void extraer(double cantidad)
	{
		this.saldo -= cantidad;
	}
	public double getSaldo()
	{
		return this.saldo;
	}
	public String getTitular()
	{
		return titular;
	}
	public void setTitular(String titular)
	{
		this.titular = titular;
	}
}
