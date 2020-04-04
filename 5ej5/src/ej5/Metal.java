package ej5;

public class Metal extends Material
{
	private String nombre;

	public Metal(String nombre, String color)
	{
		super(color);
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	@Override
	public String trabajar(Artesano artesano)
	{
		return artesano.trabajarMetal() + this.nombre + " " + this.color;
	}
}
