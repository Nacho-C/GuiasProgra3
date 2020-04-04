package ej5;

public class Madera extends Material
{
	private String tipo;

	public Madera(String tipo, String color)
	{
		super(color);
		this.tipo = tipo;
	}

	public String getTipo()
	{
		return tipo;
	}

	@Override
	public String trabajar(Artesano artesano)
	{
		return artesano.trabajarMadera() + this.tipo + " " + this.color;
	}
}
