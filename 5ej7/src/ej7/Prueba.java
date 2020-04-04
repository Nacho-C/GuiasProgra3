package ej7;

public class Prueba
{

	public static void main(String[] args)
	{
		Interfaz p1 = PersonajeFactory.getPersonaje("Mago", "Fuego", "Cazorla"), p2 = PersonajeFactory.getPersonaje("Hechicera", "Agua", "Luqui");
		Mazo mazo = Mazo.getInstance();
		mazo.addPersonaje(p1);
		mazo.addPersonaje(p2);
		
	}
}
