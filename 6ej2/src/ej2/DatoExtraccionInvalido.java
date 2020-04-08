package ej2;

public class DatoExtraccionInvalido
{
	private double extraccionSolicitada, saldo;

	public DatoExtraccionInvalido(double saldo, double extraccionSolicitada)
	{
		this.saldo = saldo;
		this.extraccionSolicitada = extraccionSolicitada;
	}

	public double getExtraccionSolicitada()
	{
		return this.extraccionSolicitada;
	}

	public double getSaldo()
	{
		return this.saldo;
	}

}
