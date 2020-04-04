package ej1;

import java.util.ArrayList;
import java.util.Iterator;

public class Prueba
{

	public static void main(String[] args)
	{
		ArrayList<Emisor_De_Sonido> arrayEmisores = new ArrayList<Emisor_De_Sonido>();
		arrayEmisores.add(new Perro("firulais",20));
		arrayEmisores.add(new Pollito("pio",184));
		arrayEmisores.add(new Gato("michi",1232));
		arrayEmisores.add(new Vaca("lola",2));
		arrayEmisores.add(new Ambulancia());
		Iterator<Emisor_De_Sonido> it = arrayEmisores.iterator();
		while (it.hasNext())
			it.next().emiteSonido();
		
	}

}
