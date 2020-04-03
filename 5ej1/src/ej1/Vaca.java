package ej1;

public class Vaca extends Animal
{
	public Vaca(String nombre, int esperanzaVida)
	{
		super(nombre, esperanzaVida);
	}

	public void emiteSonido() {
		System.out.println("vaca");
	}

}
