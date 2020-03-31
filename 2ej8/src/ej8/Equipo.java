package ej8;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo
{
	private String nombre;
	private int partidosGanados, partidosPerdidos, partidosEmpatados, golesAFavor, golesEnContra;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

	public int getPartidosGanados()
	{
		return this.partidosGanados;
	}

	public int getPartidosPerdidos()
	{
		return this.partidosPerdidos;
	}

	public int getPartidosEmpatados()
	{
		return this.partidosEmpatados;
	}
	
	public int getPartidosJugados()
	{
		return this.partidosEmpatados + this.partidosGanados + this.partidosPerdidos;
	}
	
	public int getPuntosObtenidos()
	{
		return this.partidosEmpatados + 3 * this.partidosGanados;
	}

	public int getGolesAFavor()
	{
		return this.golesAFavor;
	}

	public int getGolesEnContra()
	{
		return this.golesEnContra;
	}
	
	public ArrayList<Jugador> getJugadores()
	{
		return jugadores;
	}
	
	public void addJugador(Jugador jugador)
	{
		this.jugadores.add(jugador);
	}
	
	public void removeJugador(Jugador jugador)
	{
		this.jugadores.remove(jugador);
	}
	
	public void sumarGolAFavor()
	{
		this.golesAFavor++;
	}
	
	public void sumarGolEnContra()
	{
		this.golesEnContra++;
	}
	
	public void sumarPartidoEmpatado()
	{
		this.partidosEmpatados++;
	}
	
	public void sumarPartidoGanado()
	{
		this.partidosGanados++;
	}
	
	public void sumarPartidoPerdido()
	{
		this.partidosPerdidos++;
	}

	public Equipo compararPuntaje(Equipo otro)
	{
		Equipo retorno = this;
		if (otro.getPuntosObtenidos() > this.getPuntosObtenidos())
			retorno = otro;
		else
			if (otro.getPuntosObtenidos() == this.getPuntosObtenidos())
				if (otro.golesAFavor > this.golesAFavor)
					retorno = otro;
				else
					if ((otro.golesAFavor == this.golesAFavor) && (otro.golesEnContra < this.golesEnContra))
						retorno = otro;
		return retorno;
	}
	
	public Jugador getGoleador()
	{
		Jugador retorno = null, aux;
		int maxGoles = 0;
		Iterator<Jugador> itJugador = this.jugadores.iterator();
		while (itJugador.hasNext())
		{
			aux = itJugador.next();
			if (aux.getCantGoles() > maxGoles)
			{
				maxGoles = aux.getCantGoles();
				retorno = aux;
			}
		}
		return retorno;
	}
	
	public Jugador compararGoleador(Equipo otro)
	{
		Jugador retorno = this.getGoleador(), goleadorOtro = otro.getGoleador();
		if (retorno.getCantGoles() < goleadorOtro.getCantGoles())
			retorno = goleadorOtro;
		return retorno;
	}
}
