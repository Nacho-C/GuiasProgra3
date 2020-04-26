package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Viento.
 * <br>
 * Descripcion: Clase que implementa la Interfaz ICartaHechizo, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

public class Viento implements ICartaHechizo
{
	public void hechizar(Pokemon pokemon)
	{
		pokemon.recibeViento();
	}

	@Override
	public String toString()
	{
		return "Viento";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
}
