package modelo;

import java.util.Iterator;

public class Prueba
{

	public static void main(String[] args)
	{
		Mapa mapa = Mapa.getInstance();
		mapa.agregarPersonaje(new Personaje("Jon Snow",3.7,2.0));
		Personaje p = new Personaje("Aragorn",5.6,7.8);
		mapa.agregarPersonaje(p);
		mapa.agregarPersonaje(new Personaje("Arya",6,7));
		mapa.agregarPersonaje(new Personaje("Daenerys",16,37));
		Iterator<Personaje> it = mapa.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("El personaje más cercano a Aragorn es: " + p.getMasCercano());
	}

}
