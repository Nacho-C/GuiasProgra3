package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Viento.
 * <br>
 * Descripcion: Clase que implementa las Interfaces ICartaHechizo y Cloneable, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

public class Viento extends CartaHechizo implements Cloneable
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
}
