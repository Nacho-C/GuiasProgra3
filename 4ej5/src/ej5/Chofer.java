package ej5;

public class Chofer
{
	private String nombre;
	private Categoria categoria;
	private Vehiculo vehiculoAsignado;
	
	public Chofer(String nombre, Categoria categoria)
	{
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public Chofer(String nombre, Categoria categoria, Vehiculo vehiculoAsignado)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.vehiculoAsignado = vehiculoAsignado;
	}

	public Categoria getCategoria()
	{
		return categoria;
	}

	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}

	public Vehiculo getVehiculoAsignado()
	{
		return vehiculoAsignado;
	}

	public void setVehiculoAsignado(Vehiculo vehiculoAsignado)
	{
		this.vehiculoAsignado = vehiculoAsignado;
	}

	public String getNombre()
	{
		return nombre;
	}
	
	
	
}
