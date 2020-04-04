package ej5;

public class Joyero extends Artesano
{

	public Joyero(String nombre)
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
		return "hizo un par de aros de ";
	}

	@Override
	public String trabajarMetal()
	{
		return "hizo un anillo de ";
	}

}
