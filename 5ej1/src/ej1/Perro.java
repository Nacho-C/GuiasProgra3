package ej1;

public class Perro extends Animal
{	
	public Perro(String nombre, int esperanzaVida)
	{
		super(nombre, esperanzaVida);
	}

	public void emiteSonido() {
		System.out.println("miauu");
	}
}
