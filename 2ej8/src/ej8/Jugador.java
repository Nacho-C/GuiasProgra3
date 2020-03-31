package ej8;

public class Jugador
{
	private String nombre;
	private int añoNacimiento, numeroCamiseta, posicion, cantPartidos, cantGoles;

	public Jugador(String nombre, int añoNacimiento)
	{
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}
	
	public int getNumeroCamiseta()
	{
		return this.numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta)
	{
		this.numeroCamiseta = numeroCamiseta;
	}

	public int getPosicion()
	{
		return this.posicion;
	}

	public void setPosicion(int posicion)
	{
		this.posicion = posicion;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public int getAñoNacimiento()
	{
		return this.añoNacimiento;
	}

	public int getCantPartidos()
	{
		return this.cantPartidos;
	}

	public int getCantGoles()
	{
		return this.cantGoles;
	}
	
	public void sumarGol()
	{
		this.cantGoles++;
	}
	
	public void sumarPartido()
	{
		this.cantPartidos++;
	}
	
	public double golesPorPartido()
	{
		double retorno = 0;
		if (this.cantPartidos != 0)
			retorno = (double) this.cantGoles * 100 / this.cantPartidos;
		return retorno;
	}
	
	public Jugador comparar(Jugador otro)
	{
		Jugador retorno = this;
		if (otro.cantGoles > this.cantGoles)
			retorno = otro;
		return retorno;
	}

}
