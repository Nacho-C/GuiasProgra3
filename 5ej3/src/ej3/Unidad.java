package ej3;

public abstract class Unidad implements Posicionable
{
	private String equipo;
	protected int costo,energia,x,y;
	public Unidad(String equipo, int costo, int energia,int x,int y)
	{
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	abstract void recibeDaño(int cantidad);
	
	public String getEquipo() {
		 return this.equipo;
	}
}
