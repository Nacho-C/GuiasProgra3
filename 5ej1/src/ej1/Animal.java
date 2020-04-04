package ej1;

abstract public class Animal implements Emisor_De_Sonido
{
	protected String nombre;
	protected int esperanzaVida;
	
	public Animal(String nombre,int esperanzaVida) {
		this.nombre = nombre;
		this.esperanzaVida = esperanzaVida;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getEsperanzaVida()
	{
		return esperanzaVida;
	}
	public void setEsperanzaVida(int esperanzaVida)
	{
		this.esperanzaVida = esperanzaVida;
	}
	
	
}	
