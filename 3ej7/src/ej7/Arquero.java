package ej7;

public class Arquero extends Jugador
{
	private double efectividad;
	
	public Arquero(String nombre, double velocidad, double potencia)
	{
		super(nombre, velocidad, potencia);
		this.efectividad = 0.5;
	}
	
	public Arquero(String nombre, double velocidad, double potencia, double efectividad)
	{
		super(nombre, velocidad, potencia);
		this.efectividad = efectividad;
	}

	@Override
	public double indiceDefensa()
	{
		return efectividad;
	}

	@Override
	public double indiceAtaque()
	{
		return 0.1 * this.velocidad * this.potencia;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + "Posici�n: Arquero\nVelocidad: " + this.velocidad + "\nPotencia: " + this.potencia + "\nEfectividad: " + this.efectividad + "\n";
	}

}
