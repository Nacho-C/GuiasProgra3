package ej6;

public class Link extends Archivo
{

	private Archivo link;

	public Link(String nombre, Archivo link)
	{
		super(nombre, 1);
		this.link = link;
	}

	public Archivo getLink()
	{
		return this.link;
	}
}
