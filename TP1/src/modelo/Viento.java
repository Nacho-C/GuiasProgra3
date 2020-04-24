package modelo;

public class Viento implements ICartaHechizo
{
	public void hechizar(Pokemon pokemon)
	{
		pokemon.recibeViento();
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
