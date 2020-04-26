package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Interfaz ICartaHechizo.
 * <br>
 * Descripcion: Interfaz que se encarga de contener el metodo para realizar el doble dispatch, entre los tipos de pokemones y de cartas.<br>
 */
public interface ICartaHechizo
{
	/**
	 * Descripcion: Metodo para hechizar a un Pokemon. Este es implementado en cada una de las clases que implementan esta interfaz (Niebla, Tormenta y Viento).
	 * <br>
	 * @param pokemon Pokemon que sera hechizado.
	 */
	void hechizar(Pokemon pokemon);
	
	Object clone() throws CloneNotSupportedException;
}
