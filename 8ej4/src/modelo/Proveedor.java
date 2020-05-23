package modelo;

public class Proveedor
{
	private String nombre, email;
	private long telefono;

	public Proveedor(String nombre)
	{
		this.nombre = nombre;
	}

	public Proveedor(String nombre, String email)
	{
		this.nombre = nombre;
		this.email = email;
	}

	public Proveedor(String nombre, long telefono)
	{
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Proveedor(String nombre, long telefono, String email)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getTelefono()
	{
		return telefono;
	}

	public void setTelefono(long telefono)
	{
		this.telefono = telefono;
	}

	@Override
	public String toString()
	{
		return this.nombre;
	}
}
