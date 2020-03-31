package ej7;

public class Delantero extends Jugador
{

	public Delantero(String nombre, double velocidad, double potencia)
	{
		super(nombre, velocidad, potencia);
	}

	@Override
	public double indiceDefensa()
	{
		return this.velocidad * 0.5;
	}

	@Override
	public double indiceAtaque()
	{
		return this.velocidad * this.potencia;
	}

	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + "Posición: Delantero\nVelocidad: " + this.velocidad + "\nPotencia: " + this.potencia + "\n";
	}
}
