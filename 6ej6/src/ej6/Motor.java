package ej6;

public class Motor
{
	private String fabricante, nSerie;
	private double potencia;

	public Motor(String fabricante, String nSerie, double potencia)
	{
		this.fabricante = fabricante;
		this.nSerie = nSerie;
		this.potencia = potencia;
	}

	public String getFabricante()
	{
		return this.fabricante;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public String getnSerie()
	{
		return this.nSerie;
	}

	public void setnSerie(String nSerie)
	{
		this.nSerie = nSerie;
	}

	public double getPotencia()
	{
		return this.potencia;
	}

	public void setPotencia(double potencia)
	{
		this.potencia = potencia;
	}

}
