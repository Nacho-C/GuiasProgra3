package ej5;

public class Animal implements Cloneable
{
	private int esperanzaVida, edad;
	private String nombre;

	public Animal(String nombre, int edad, int esperanzaVida)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.esperanzaVida = esperanzaVida;
	}

	public int getEdad()
	{
		return this.edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public int getEsperanzaVida()
	{
		return this.esperanzaVida;
	}

	public void setEsperanzaVida(int esperanzaVida)
	{
		this.esperanzaVida = esperanzaVida;
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
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
