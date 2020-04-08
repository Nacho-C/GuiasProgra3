package ej5;

public class Domicilio implements Cloneable
{
	private String calle;
	private int numero;

	public Domicilio(String calle, int numero)
	{
		this.calle = calle;
		this.numero = numero;
	}

	public String getCalle()
	{
		return this.calle;
	}

	public void setCalle(String calle)
	{
		this.calle = calle;
	}

	public int getNumero()
	{
		return this.numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public String toString()
	{
		return this.calle + " " + this.numero;
	}

	@Override
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			// nunca entra
			return null;
		}
	}
}
