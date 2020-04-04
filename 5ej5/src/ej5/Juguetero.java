package ej5;

public class Juguetero extends Artesano
{

	public Juguetero(String nombre)
	{
		super(nombre);
	}

	@Override
	public String trabajar(Material mat)
	{
		return this.nombre + " " + mat.trabajar(this);
	}

	@Override
	public String trabajarMadera()
	{
		return "hizo un muñequito de ";
	}

	@Override
	public String trabajarMetal()
	{
		return "hizo un autito de ";
	}

}
