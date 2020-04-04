package ej3;

public abstract class Personaje extends Unidad implements Movible
{
	private String nombre;

	public Personaje(String nombre,String equipo, int costo, int energia)
	{
		super(equipo, costo, energia,0,0);
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void mover(int x, int y)
	{
		this.x+=x;
		this.y+=y;
	}
	
	

	abstract void recibeDaño(int cantidad);
		
}
