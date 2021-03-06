package ej3;

public abstract class CuentaBancaria
{
	protected String nombre;
	protected double saldo = 0;
	
	public CuentaBancaria(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	abstract void extraer(double monto);
	
	public void depositar(double monto)
	{
		this.saldo += monto;
	}
}
