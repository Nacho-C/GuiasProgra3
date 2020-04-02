package ej5;

public class Acoplado
{
	private int tara, cargaMaxima, numeroAcoplado;
	private boolean refrigerado, enUso;

	public Acoplado(int tara, int cargaMaxima, int numeroAcoplado, boolean refrigerado)
	{
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
		this.numeroAcoplado = numeroAcoplado;
		this.refrigerado = refrigerado;
	}

	public boolean isEnUso()
	{
		return enUso;
	}

	public void setEnUso(boolean enUso)
	{
		this.enUso = enUso;
	}

	public int getTara()
	{
		return tara;
	}

	public int getCargaMaxima()
	{
		return cargaMaxima;
	}

	public int getNumeroAcoplado()
	{
		return numeroAcoplado;
	}

	public boolean isRefrigerado()
	{
		return refrigerado;
	}

	public String toString()
	{
		return "Número de acoplado: " + this.numeroAcoplado + "\nTara: " + this.tara + "\nCarga máxima: "
				+ this.cargaMaxima + "\nRefrigerado: " + this.refrigerado;
	}
}
