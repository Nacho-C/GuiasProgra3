package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Niebla.
 * <br>
 * Descripcion: Clase que implementa las Interfaces ICartaHechizo y Cloneable, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

public class Niebla extends CartaHechizo implements Cloneable
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
}
