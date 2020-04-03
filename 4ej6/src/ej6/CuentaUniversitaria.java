package ej6;

import java.time.LocalDate;

public class CuentaUniversitaria extends CuentaBancaria
{
	LocalDate fechaAnterior = LocalDate.now();
	double montoDiario = 1000;
	
	public CuentaUniversitaria(String nombre)
	{
		super(nombre);
	}

	public boolean esValido(double monto) //hook
	{
		boolean retorno = false;
		LocalDate fechaActual = LocalDate.now();
		if (!this.fechaAnterior.equals(fechaActual))
		{
			montoDiario = 1000;
			this.fechaAnterior = fechaActual;
		}
		if ((monto <= montoDiario) && (monto <= this.saldo))
		{
			retorno = true;
			montoDiario -= monto;
		}
		return retorno;
	}
}
