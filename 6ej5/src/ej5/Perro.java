package ej5;

public class Perro extends Animal
{
	public Perro(String nombre, int edad, int esperanzaVida)
	{
		super(nombre, edad, esperanzaVida);
	}

	@Override
	public Object clone()
	{
		Object clon;
		try
		{
			clon = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			clon = null;
		}
		return clon;
	}
}
