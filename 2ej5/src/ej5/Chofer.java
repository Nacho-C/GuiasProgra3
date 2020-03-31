package ej5;

public class Chofer
{
	private Categoria categoria;
	private Domicilio domicilio;
	private String nombre;
	private Colectivo colectivo;
	
	public Chofer(String nombre, Categoria categoria, Domicilio domicilio)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.domicilio = domicilio;
	}

	public Chofer(String nombre, Categoria categoria, Domicilio domicilio, Colectivo colectivo)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.colectivo = colectivo;
	}

	public Categoria getCategoria()
	{
		return categoria;
	}

	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}

	public Domicilio getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getNombre()
	{
		return nombre;
	}

	public Colectivo getColectivo()
	{
		return colectivo;
	}

	public void setColectivo(Colectivo colectivo)
	{
		this.colectivo = colectivo;
	}
	
	public void desvincularColectivo()
	{
		this.colectivo = null;
	}

	@Override
	public String toString()
	{
		String retorno;
		if (this.colectivo == null)
			retorno = "Nombre del chofer: " + this.nombre + "\nDomicilio: " + this.domicilio + "\n" + this.categoria + "\nNo tiene colectivo asignado.";
		else
			retorno = "Nombre del chofer: " + this.nombre + "\nDomicilio: " + this.domicilio + "\n" + this.categoria + "\nColectivo " + this.colectivo;		
		return retorno;
	}
	
	

}
