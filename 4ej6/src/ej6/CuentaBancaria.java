package ej6;

abstract public class CuentaBancaria //Patrón Template
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
	
	abstract protected boolean esValido(double monto);
	
	public void extraer(double monto) {
		if(esValido(monto))
			this.saldo-=monto;
		else
			System.out.println("No se pudo realizar la extraccion");
	}
	
	public void depositar(double monto)
	{
		this.saldo += monto;
	}
}
