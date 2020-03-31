package ej3;

public class Categoria
{
	private String nombreCategoria;
	private double sueldoPorHora;
	
	public Categoria(String nombreCategoria, double sueldoPorHora)
	{
		this.nombreCategoria = nombreCategoria;
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public String getNombreCategoria()
	{
		return this.nombreCategoria;
	}
	
	public double getSueldoPorHora()
	{
		return this.sueldoPorHora;
	}
}
