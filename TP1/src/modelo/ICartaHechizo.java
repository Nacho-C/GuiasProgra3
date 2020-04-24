package modelo;

public interface ICartaHechizo
{
	void hechizar(Pokemon pokemon);
	Object clone() throws CloneNotSupportedException;
}
