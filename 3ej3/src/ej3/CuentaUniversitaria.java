package ej3;

import java.time.LocalDate;

public class CuentaUniversitaria extends CuentaBancaria
{
	LocalDate fechaAnterior = LocalDate.now();
	double montoDiario = 1000;
	
	public CuentaUniversitaria(String nombre)
	{
		super(nombre);
	}
	
	@Override
	public void extraer(double monto)
	{
		LocalDate fechaActual = LocalDate.now();
		if (!this.fechaAnterior.equals(fechaActual))
		{
			montoDiario = 1000;
			this.fechaAnterior = fechaActual;
		}
		if ((monto <= montoDiario) && (monto <= this.saldo))
		{
			this.saldo -= monto;
			montoDiario -= monto;
		}
	}
}
