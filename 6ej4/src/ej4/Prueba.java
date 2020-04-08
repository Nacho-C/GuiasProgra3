package ej4;

public class Prueba
{

	public static void main(String[] args)
	{
		ConjuntoNumeros c1 = new ConjuntoNumeros("Numeros",8), c2 = (ConjuntoNumeros) c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		c1.cambiarNumero(57, 3);
		System.out.println(c1);
		System.out.println(c2);
	}

}
