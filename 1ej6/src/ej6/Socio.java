package ej6;

public class Socio
{
	private String nombre;
	private int edad;
	private boolean representaClub;
	final int cuota = 500;
	
	public Socio(String nombre)
	{
		this.nombre = nombre;
	}
	
	public Socio(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Socio(String nombre, int edad, boolean representaClub)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.representaClub = representaClub;
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean getRepresentaClub()
	{
		return representaClub;
	}

	public void setRepresentaClub(boolean representaClub)
	{
		this.representaClub = representaClub;
	}
	
	public double calcularCuota()
	{
		int cuota = this.cuota;
		if (this.edad > 65)
			cuota *= 0.5;
		else
			if (this.edad < 18 && this.representaClub)
				cuota *= 0.75;
		return cuota;
	}
}
