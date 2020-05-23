package modelo;

public class Socio
{
	private int dni;
	private String domicilio, nombre;
	
	public Socio()
	{
	}
	
	public Socio(int dni, String nombre, String domicilio)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	public int getDni()
	{
		return this.dni;
	}

	public void setDni(int dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return this.domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + " \nDNI: " + this.dni;
	}
}
