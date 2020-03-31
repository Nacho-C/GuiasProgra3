package ej5;

public class Categoria
{
	private String nombreCategoria;
	private double sueldo;

	public Categoria(String nombreCategoria, double sueldo)
	{
		this.nombreCategoria = nombreCategoria;
		this.sueldo = sueldo;
	}

	public double getSueldo()
	{
		return this.sueldo;
	}

	public void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}

	public String getNombreCategoria()
	{
		return this.nombreCategoria;
	}

	@Override
	public String toString()
	{
		return "Categoría: " + this.nombreCategoria + ", sueldo: " + this.sueldo;
	}
	
}
