package ej8;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Partido
{
	private boolean termino;
	private Equipo equipo1, equipo2;
	private Date fecha;
	private ArrayList<String> goles1 = new ArrayList<String>(), goles2 = new ArrayList<String>();

	public Partido(Equipo equipo1, Equipo equipo2, Date fecha)
	{
		Iterator<Jugador> itJugadores;
		this.termino = false;
		if (equipo1 != equipo2)
		{
			itJugadores = equipo1.getJugadores().iterator();
			while (itJugadores.hasNext())
			{
				itJugadores.next().sumarPartido();
			}
			this.equipo1 = equipo1;
			itJugadores = equipo2.getJugadores().iterator();
			while (itJugadores.hasNext())
			{
				itJugadores.next().sumarPartido();
			}
			this.equipo2 = equipo2;
			this.fecha = fecha;
		}
		else
			System.out.println("Un equipo no puede jugar contra si mismo.");
	}

	public Equipo getEquipo1()
	{
		return this.equipo1;
	}

	public Equipo getEquipo2()
	{
		return this.equipo2;
	}

	public Date getFecha()
	{
		return this.fecha;
	}

	public void añadirGol(Jugador jugador)
	{
		if (this.termino)
			System.out.println("El partido ya terminó.");
		else
			if (this.equipo1.getJugadores().contains(jugador))
			{
				jugador.sumarGol();
				this.goles1.add(jugador.getNombre());
				this.equipo1.sumarGolAFavor();
				this.equipo2.sumarGolEnContra();
			}
			else
				if (this.equipo2.getJugadores().contains(jugador))
				{
					jugador.sumarGol();
					this.goles2.add(jugador.getNombre());
					this.equipo2.sumarGolAFavor();
					this.equipo1.sumarGolEnContra();
				}
				else
					System.out.println("El jugador no juega en este partido.");
	}

	public String terminar()
	{
		String retorno = "Resultado:\n\n" + this.equipo1.getNombre() + ": " + this.goles1.size() + "\nGoleadores:";
		Iterator<String> itGoles = this.goles1.iterator();
		this.termino = true;
		if (this.goles1.size() > this.goles2.size())
		{
			this.equipo1.sumarPartidoGanado();
			this.equipo2.sumarPartidoPerdido();
		}
		else
			if (this.goles1.size() < this.goles2.size())
			{
				this.equipo1.sumarPartidoPerdido();
				this.equipo2.sumarPartidoGanado();
			}
			else
			{
				this.equipo1.sumarPartidoEmpatado();
				this.equipo2.sumarPartidoEmpatado();
			}
		while (itGoles.hasNext())
		{
			retorno += "\t" + itGoles.next() + "\n";
		}
		retorno += "\n" + this.equipo2.getNombre() + ": " + this.goles2.size() + "\nGoleadores:";
		itGoles = this.goles2.iterator();
		while (itGoles.hasNext())
		{
			retorno += "\t" + itGoles.next() + "\n";
		}
		return retorno;
	}
}
