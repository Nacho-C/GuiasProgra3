package modelo;

public class Posicion
{
	private double x;
	private double y;

	public Posicion(double x, double y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}
	
	public void mueve(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
	
	public double distancia(Posicion otra)
	{
		double resultado;
		resultado = (this.x - otra.x) *  (this.x - otra.x) + (this.y - otra.y) *  (this.y - otra.y);
		resultado = Math.sqrt(resultado);
		return resultado;
	}
	
	@Override
	public String toString()
	{
		return "[x=" + x + ", y=" + y + "]";
	}
}
