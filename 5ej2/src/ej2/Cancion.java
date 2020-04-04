package ej2;

public class Cancion
{
	private int numeroDePista,mins,segs;
	private String titulo;
	
	public Cancion(int numeroDePista, int mins, int segs, String titulo)
	{
		super();
		this.numeroDePista = numeroDePista;
		this.mins = mins;
		this.segs = segs;
		this.titulo = titulo;
	}

	public int getNumeroDePista()
	{
		return numeroDePista;
	}

	public void setNumeroDePista(int numeroDePista)
	{
		this.numeroDePista = numeroDePista;
	}

	public int getMins()
	{
		return mins;
	}

	public void setMins(int mins)
	{
		this.mins = mins;
	}

	public int getSegs()
	{
		return segs;
	}

	public void setSegs(int segs)
	{
		this.segs = segs;
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
		return "Cancion numeroDePista:" + numeroDePista + " mins:" + mins + " segs:" + segs + " titulo:" + titulo
				+ "\n";
	}
	
	
	
	
}
