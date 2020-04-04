package ej7;

public class PersonajeFactory
{
	public static Elemento getPersonaje(String tipo, String elemento, String nombre)
	{
		Personaje personaje = null;
		Elemento respuesta = null;
		if (tipo.equals("Guerrero"))
			personaje = new Guerrero(nombre);
		else
			if (tipo.equals("Mago"))
				personaje = new Mago(nombre);
			else
				if (tipo.equals("Hechicera"))
					personaje = new Hechicera(nombre);
				else
					if (tipo.equals("Elfo"))
						personaje = new Elfo(nombre);
					else
						if (tipo.equals("Dragon"))
							personaje = new Dragon(nombre);
		if (elemento.equals("Agua"))
			respuesta = new Agua(personaje);
		else
			if (elemento.equals("Aire"))
				respuesta = new Aire(personaje);
			else
				if (elemento.equals("Tierra"))
					respuesta = new Tierra(personaje);
				else
					if (elemento.equals("Fuego"))
						respuesta = new Fuego(personaje);
		return respuesta;
	}

	public static Personaje getPersonaje(String tipo, String nombre)
	{
		Personaje personaje = null;
		if (tipo.equals("Guerrero"))
			personaje = new Guerrero(nombre);
		else
			if (tipo.equals("Mago"))
				personaje = new Mago(nombre);
			else
				if (tipo.equals("Hechicera"))
					personaje = new Hechicera(nombre);
				else
					if (tipo.equals("Elfo"))
						personaje = new Elfo(nombre);
					else
						if (tipo.equals("Dragon"))
							personaje = new Dragon(nombre);

		return personaje;
	}
}