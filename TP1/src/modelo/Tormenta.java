package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Tormenta.
 * <br>
 * Descripcion: Clase que implementa las Interfaces ICartaHechizo y Cloneable, y que es utilizada por un Entrenador para debilitar al Pokemon enemigo.
 */

public class Tormenta implements ICartaHechizo, Cloneable
{
	public void hechizar(Pokemon pokemon)
	{
		pokemon.recibeTormenta();
	}

	@Override
	public String toString()
	{
		return "Tormenta";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
}
