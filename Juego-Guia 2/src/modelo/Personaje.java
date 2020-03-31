package modelo;

import java.util.Iterator;

public class Personaje
{
	private String nombre;
	private Posicion posicion;
	private int vitalidad = 500;
	
	public Personaje(String nombre, double x, double y)
	{
		this.nombre = nombre;
		this.posicion = new Posicion(x,y);
	}

	public String getNombre()
	{
		return nombre;
	}

	public Posicion getPosicion()
	{
		return posicion;
	}

	public int getVitalidad()
	{
		return vitalidad;
	}
	
	public void recibeDano(int cantidad)
	{
		this.vitalidad -= cantidad;
	}
	
	public void mueve(double x, double y)
	{
		this.posicion.mueve(x, y);
	}
	
	public double distancia(Personaje otro)
	{
		double respuesta;
		respuesta = this.posicion.distancia(otro.posicion);
		return respuesta;
	}
	
	public Personaje getMasCercano()
	{
		Iterator<Personaje> it = Mapa.getInstance().iterator();
		Personaje actual = null;
		Personaje menor = it.next();
		while (it.hasNext())
		{
			actual = it.next();
			if (this != actual && this.distancia(actual) < this.distancia(menor))
					menor = actual;
		}
		return menor;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + "\tVitalidad: " + this.vitalidad + "\tPosición: " + this.posicion;
	}
}
