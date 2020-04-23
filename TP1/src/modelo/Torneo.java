package modelo;

import java.util.ArrayList;

public class Torneo
{
	private static Torneo instance = null;
	
	public static String nombre;
	
	public final static int numeroEntrenadores = 16;
	
	private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
	
	private Torneo(String nombre)
	{
		Torneo.nombre = nombre;
	}
	
	public Torneo getInstance(String nombre)
	{
		if (Torneo.instance == null)
			Torneo.instance = new Torneo(nombre);
		return Torneo.instance;
	}
}
