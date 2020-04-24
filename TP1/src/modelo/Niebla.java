package modelo;

public class Niebla implements ICartaHechizo
{
	public void hechizar(Pokemon pokemon)
	{
		pokemon.recibeNiebla();
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
