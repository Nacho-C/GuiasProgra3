package ej6;

public class CuentaCorriente extends CuentaBancaria
{
	private double topeDescubierto;
	
	public CuentaCorriente(String nombre, double topeDescubierto)
	{
		super(nombre);
		this.topeDescubierto = topeDescubierto;
	}
	

	public boolean esValido(double monto) //hook
	{
		boolean retorno=false;
		double saldoConDescubierto = this.saldo + topeDescubierto;
		if (monto < saldoConDescubierto)
			retorno = true;
		return retorno;
	}
}
