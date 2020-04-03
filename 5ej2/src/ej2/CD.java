package ej2;

import java.util.ArrayList;

public class CD implements Prestable, Comparable
{
	private boolean prestado = false;
	private String codigo,titulo,interprete;
	private ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	
	public CD(boolean prestado, String codigo, String titulo, String interprete)
	{
		super();
		this.prestado = prestado;
		this.codigo = codigo;
		this.titulo = titulo;
		this.interprete = interprete;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public String getInterprete()
	{
		return interprete;
	}

	public ArrayList<Cancion> getCanciones()
	{
		return canciones;
	}

	@Override
	public void prestar()
	{
		this.prestado = true;
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
	
	public void añadirCancion(Cancion cancion) {
		canciones.add(cancion);
	}
	public void eliminarCancion(Cancion cancion) {
		canciones.remove(cancion);
	}

	@Override
	public String toString()
	{
		return "CD prestado: " + prestado + " codigo:" + codigo + " titulo:" + titulo + " interprete:" + interprete
				+ " canciones:" + canciones + "\n";
	}

	@Override
	public int compareTo(CD comparable)
	{
		int retorno = 0;
		if (comparable.getInterprete().equals(this.interprete))
			retorno = this.titulo.compareTo(comparable.titulo);
		else
			retorno = (this.interprete).compareTo(comparable.interprete);
		return retorno;
	}
}
