package ej7;

public abstract class Elemento implements Interfaz
{
	private Interfaz interfaz;

	private Mazo mazo = Mazo.getInstance();

	public Elemento(Interfaz interfaz)
	{
		this.interfaz = interfaz;
	}

	public Interfaz getInterfaz()
	{
		return this.interfaz;
	}

	public Interfaz elijeAdversario()
	{
		Interfaz adversario = this;
		while (adversario == this)
			adversario = mazo.getRandom();
		return adversario;
	}
}
