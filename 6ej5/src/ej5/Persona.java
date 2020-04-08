package ej5;

public class Persona implements Cloneable, Comparable
{
	private int dni, legajo;
	private String apellido;
	private Domicilio domicilio;
	private Animal mascota;

	public Persona(int dni, int legajo, String apellido, Domicilio domicilio, Animal mascota)
	{
		this.dni = dni;
		this.legajo = legajo;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.mascota = mascota;
	}

	public int getDni()
	{
		return this.dni;
	}

	public void setDni(int dni)
	{
		this.dni = dni;
	}

	public Animal getMascota()
	{
		return this.mascota;
	}

	public void setMascota(Animal mascota)
	{
		this.mascota = mascota;
	}

	public int getLegajo()
	{
		return this.legajo;
	}

	public void setLegajo(int legajo)
	{
		this.legajo = legajo;
	}

	public String getApellido()
	{
		return this.apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public Domicilio getDomicilio()
	{
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio = domicilio;
	}

	@Override
	public int compareTo(Comparable otro)
	{
		Persona aux = (Persona) otro;
		int retorno = 0;
		if (this.apellido.compareToIgnoreCase(aux.apellido) < 0)
			retorno = -1;
		else
			if (this.apellido.compareToIgnoreCase(aux.apellido) > 0)
				retorno = 1;
			else
				if (this.dni < aux.dni)
					retorno = -1;
				else
					if (this.dni > aux.dni)
						retorno = 1;
		return retorno;
	}

	public String toString()
	{
		return "Apellido: " + this.apellido + "\nDomicilio: " + this.domicilio + "\nDNI: " + this.dni + "\nLegajo: "
				+ this.legajo + "\nMascota: " + this.mascota;
	}

	@Override
	public Object clone()
	{
		Persona clon = null;
		try
		{
			clon = (Persona) super.clone();
			clon.domicilio = (Domicilio) this.domicilio.clone();
			clon.mascota = (Animal) this.mascota.clone();
		}
		catch (CloneNotSupportedException e)
		{
			clon.mascota = null;
			System.out.println("No se puede clonar un gato.");
		}
		return clon;
	}

}
