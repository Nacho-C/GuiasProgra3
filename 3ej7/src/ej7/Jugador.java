package ej7;

abstract public class Jugador
{
	protected String nombre;
	protected double velocidad, potencia;
	
	public Jugador(String nombre, double velocidad, double potencia)
	{
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.potencia = potencia;
	}
	
	abstract public double indiceDefensa();
	
	abstract public double indiceAtaque();
}
