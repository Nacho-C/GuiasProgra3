package ej5;

public abstract class Artesano
{
	protected String nombre;

	public Artesano(String nombre)
	{
		this.nombre = nombre;
	}

	abstract String trabajar(Material mat);

	abstract String trabajarMadera();

	abstract String trabajarMetal();
}
