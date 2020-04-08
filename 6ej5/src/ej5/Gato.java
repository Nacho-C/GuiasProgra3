package ej5;

public class Gato extends Animal
{
	public Gato(String nombre, int edad, int esperanzaVida)
	{
		super(nombre, edad, esperanzaVida);
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("No se puede clonar un gato");
	}
}
