package ej7;

public abstract class Personaje implements Interfaz
{
	private String nombre;

	private Mazo mazo = Mazo.getInstance();

	public Personaje(String nombre)
	{
		this.nombre = nombre;
	}

	public Interfaz elijeAdversario()
	{
		Interfaz adversario = this;
		while (adversario == this)
			adversario = mazo.getRandom();
		return adversario;
	}
}
