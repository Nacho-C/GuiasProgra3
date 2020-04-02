package ej5;

public class Chofer
{
	private String nombre;
	private Categoria categoria;
	private Vehiculo vehiculoAsignado;
	private Domicilio domicilio;

	public Chofer(String nombre, Categoria categoria, Domicilio domicilio)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.vehiculoAsignado = null;
	}

	public Chofer(String nombre, Categoria categoria, Domicilio domicilio, Vehiculo vehiculoAsignado)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.domicilio = domicilio;
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
		if (vehiculoAsignado.aceptoChofer(this))
			this.vehiculoAsignado = vehiculoAsignado;
	}

	public void desvincularVehiculo()
	{
		this.vehiculoAsignado = null;
	}

	public String getNombre()
	{
		return nombre;
	}

	public Domicilio getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio = domicilio;
	}

	public String toString()
	{
		return "\nNombre: " + this.nombre + "\nDomicilio: " + this.domicilio + this.categoria
				+ ((this.vehiculoAsignado != null) ? ("\nVehículo:\n" + this.vehiculoAsignado)
						: "\nNo tiene vehículo asignado.");
	}

}
