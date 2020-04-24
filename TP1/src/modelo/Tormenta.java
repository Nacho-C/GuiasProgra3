package modelo;

public class Tormenta implements ICartaHechizo
{
	public void hechizar(Pokemon pokemon)
	{
		pokemon.recibeTormenta();
	}

	@Override
	public String toString()
	{
		return "Niebla";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
}
