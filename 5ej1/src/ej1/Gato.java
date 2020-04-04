package ej1;

public class Gato extends Animal 
{
	public Gato(String nombre, int esperanzaVida)
	{
		super(nombre, esperanzaVida);
	}

	public void emiteSonido() {
		System.out.println("guau");
	}
	
}
