package ej3;

public class CuentaCorriente extends CuentaBancaria
{
	private double topeDescubierto;
	
	public CuentaCorriente(String nombre, double topeDescubierto)
	{
		super(nombre);
		this.topeDescubierto = topeDescubierto;
	}
	
	@Override
	public void extraer(double monto)
	{
		double saldoConDescubierto = this.saldo + topeDescubierto;
		if (monto < saldoConDescubierto)
			this.saldo -= monto;
		else
			System.out.println("No cuenta con saldo suficiente para la extracción.");		
	}
}
