package ej5;

public class Prueba
{

	public static void main(String[] args)
	{
		Persona p1 = new Persona(6457889, 14758, "Chiuro", new Domicilio("España", 1139), new Perro("Michi",17,25)), p2 = (Persona) p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		p1.setDomicilio(new Domicilio("Colon", 1825));
		p1.setMascota(new Perro("Firulais",10,20));
		System.out.println(p1);
		System.out.println(p2);
	}

}
