package ej8;

import java.util.ArrayList;
import java.util.Iterator;

public class Torneo
{
	private static Torneo instance = null;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	private Torneo()
	{
	}

	public static Torneo getInstance()
	{
		if (Torneo.instance == null)
			Torneo.instance = new Torneo();
		return instance;
	}
	
	public void addEquipo(Equipo equipo)
	{
		this.equipos.add(equipo);
	}
	
	public void removeEquipo(Equipo equipo)
	{
		this.equipos.remove(equipo);
	}
	
	public Equipo getGanador()
	{
		Equipo retorno = null, aux;
		int max = -1;
		Iterator<Equipo> itEquipos = this.equipos.iterator();
		while (itEquipos.hasNext())
		{
			aux = itEquipos.next();
			if (aux.getPuntosObtenidos() > max)
			{
				max = aux.getPuntosObtenidos();
				retorno = aux;
			}
		}
		return retorno;
	}
}
