package ej7;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo
{
	private String nombre;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

	public double indiceDefensa()
	{
		double retorno = 0;
		Iterator<Jugador> it = jugadores.iterator();
		while (it.hasNext())
			retorno += it.next().indiceDefensa();
		return retorno;
	}
	
	public double indiceAtaque()
	{
		double retorno = 0;
		Iterator<Jugador> it = jugadores.iterator();
		while (it.hasNext())
			retorno += it.next().indiceAtaque();
		return retorno;
	}
	
	public String agregaDelantero(String nombre, double velocidad, double potencia)
	{
		String retorno = null;
		if ((velocidad <= 1) && (velocidad >= 0) && (potencia <= 1) && (potencia >= 0))
		{
			this.jugadores.add(new Delantero(nombre,velocidad,potencia));
			retorno = "Jugador agregado.";
		}
		else
			if (!((velocidad <= 1) && (velocidad >= 0)))
				retorno = "Imposible crear un delantero con velocidad = " + velocidad;
			else
				retorno = "Imposible crear un delantero con potencia = " + potencia;
		return retorno;
	}
	
	public String agregaDefensor(String nombre, double velocidad, double potencia)
	{
		String retorno = null;
		if ((velocidad <= 1) && (velocidad >= 0) && (potencia <= 1) && (potencia >= 0))
		{
			this.jugadores.add(new Defensor(nombre,velocidad,potencia));
			retorno = "Jugador agregado.";
		}
		else
			if (!((velocidad <= 1) && (velocidad >= 0)))
				retorno = "Imposible crear un defensor con velocidad = " + velocidad;
			else
				retorno = "Imposible crear un defensor con potencia = " + potencia;
		return retorno;
	}
	
	public String agregaArquero(String nombre, double velocidad, double potencia)
	{
		String retorno = null;
		if ((velocidad <= 1) && (velocidad >= 0) && (potencia <= 1) && (potencia >= 0))
		{
			this.jugadores.add(new Arquero(nombre,velocidad,potencia));
			retorno = "Jugador agregado.";
		}
		else
			if (!((velocidad <= 1) && (velocidad >= 0)))
				retorno = "Imposible crear un arquero con velocidad = " + velocidad;
			else
				retorno = "Imposible crear un arquero con potencia = " + potencia;
		return retorno;
	}
	
	public String agregaArquero(String nombre, double velocidad, double potencia, double efectividad)
	{
		String retorno = null;
		if ((velocidad <= 1) && (velocidad >= 0) && (potencia <= 1) && (potencia >= 0) && (efectividad <= 1) && (efectividad >= 0))
		{
			this.jugadores.add(new Arquero(nombre,velocidad,potencia,efectividad));
			retorno = "Jugador agregado.";
		}
		else
			if (!((velocidad <= 1) && (velocidad >= 0)))
				retorno = "Imposible crear un arquero con velocidad = " + velocidad;
			else
				if (!((potencia <= 1) && (potencia >= 0)))
				retorno = "Imposible crear un arquero con potencia = " + potencia;
				else
					retorno = "Imposible crear un arquero con efectividad = " + efectividad;
		return retorno;
	}
	
	public void eliminarJugador(Jugador jugador)
	{
		this.jugadores.remove(jugador);
	}
	
	public Iterator<Jugador> getJugadores()
	{
		return this.jugadores.iterator();
	}
}
