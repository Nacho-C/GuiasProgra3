package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Niebla.
 * <br>
 * Descripcion: Clase que implementa las Interfaces ICartaHechizo y Cloneable, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

public class Niebla implements ICartaHechizo, Cloneable
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
