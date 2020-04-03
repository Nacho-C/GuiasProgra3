package ej3;

import java.time.LocalDate;

public class CajaDeAhorro extends CuentaBancaria
{
	LocalDate fechaAnterior = LocalDate.now();
	private static int extraccionesMensuales = 30;
	private int extraccionesActuales;
	
	public CajaDeAhorro(String nombre)
	{
		super(nombre);
	}
	
	@Override
	public void extraer(double monto)
	{
		LocalDate fechaActual = LocalDate.now();
		if (!(this.fechaAnterior.getMonth().equals(fechaActual.getMonth()) && this.fechaAnterior.getYear() == fechaActual.getYear()))
		{
			extraccionesActuales = 0;
			this.fechaAnterior = fechaActual;
		}
		if ((extraccionesActuales <= extraccionesMensuales) && (monto <= this.saldo))
		{
			extraccionesActuales++;
			this.saldo -= monto;
		}
	}
}
