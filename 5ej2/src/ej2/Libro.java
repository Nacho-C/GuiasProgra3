package ej2;

public class Libro implements Prestable
{
	private boolean prestado = false;
	private int añoPublicacion;
	private String codigo,titulo;
	
	public Libro(int añoPublicacion, String codigo, String titulo)
	{
		this.añoPublicacion = añoPublicacion;
		this.codigo = codigo;
		this.titulo = titulo;
	}
	public void prestar()
	{
		this.prestado = true;
	}

	public int getAñoPublicacion()
	{
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion)
	{
		this.añoPublicacion = añoPublicacion;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	@Override
	public void devolver()
	{
		this.prestado = false;
	}
	@Override
	public boolean isPrestado()
	{
		return this.prestado;
	}
	@Override
	public String toString()
	{
		return "Libro: " + this.titulo + " codigo: " + this.titulo + "año publicacion: " + this.añoPublicacion + "\n";
	}
	
	
	
}
