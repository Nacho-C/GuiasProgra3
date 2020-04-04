package ej2;

public class Revista
{ 
	private int nro,añoPublicacion;
	private String codigo,titulo;
	
	public Revista(int nro, int añoPublicacion, String codigo, String titulo)
	{
		super();
		this.nro = nro;
		this.añoPublicacion = añoPublicacion;
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public int getNro()
	{
		return nro;
	}

	public void setNro(int nro)
	{
		this.nro = nro;
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
	public String toString()
	{
		return "Revista: " + this.titulo + " codigo: " + this.titulo + " nro: " + this.nro + " año publicacion: " + this.añoPublicacion + "\n";
	}
	
}
