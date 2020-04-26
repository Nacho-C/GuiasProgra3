package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Niebla.
 * <br>
 * Descripcion: Clase que implementa la Interfaz ICartaHechizo, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

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
