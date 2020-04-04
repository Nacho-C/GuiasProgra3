package ej5;

public abstract class Material
{
	protected String color;

	public Material(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	abstract String trabajar(Artesano artesano);
}
