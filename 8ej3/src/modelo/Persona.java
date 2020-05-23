package modelo;

public class Persona implements Comparable
{
	private String nombre, apellido, direccion;
	
	public Persona(String nombre, String apellido, String direccion)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return this.apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getDireccion()
	{
		return this.direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		Persona other = (Persona) obj;
		boolean retorno = true;
		if ((this.apellido != null && other.apellido == null) || (this.apellido == null && other.apellido != null))
			retorno = false;
		else
			if (this.apellido != null && other.apellido != null && !this.apellido.equals(other.apellido))
				retorno = false;
		if ((this.nombre != null && other.nombre == null) || (this.nombre == null && other.nombre != null))
			retorno = false;
		else
			if (this.nombre != null && other.nombre != null && !this.nombre.equals(other.nombre))
				retorno = false;	
		return retorno;
	}

	@Override
	public int compareTo(Object arg0)
	{
		int retorno;
		Persona other = (Persona) arg0;
		if (this.apellido.compareToIgnoreCase(other.apellido) != 0)
			retorno = this.apellido.compareToIgnoreCase(other.apellido);
		else
			retorno = this.nombre.compareToIgnoreCase(other.nombre);
		return retorno;
	}

	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + " | Apellido: " + this.apellido + " | Direccion: " + this.direccion;
	}	
}
