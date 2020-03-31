package ej5;
 
import java.util.ArrayList;
import java.util.Iterator;

public class Empresa
{
	private ArrayList<Colectivo> colectivos = new ArrayList<Colectivo>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	
	public void agregarChofer(Chofer chofer)
	{
		this.choferes.add(chofer);
	}
	
	public void agregarCategoria(Categoria categoria)
	{
		this.categorias.add(categoria);
	}
	
	public void agregarColectivo(Colectivo colectivo)
	{
		this.colectivos.add(colectivo);
	}
	
	public void muestraChoferes()
	{
		Iterator<Chofer> itChofer = this.choferes.iterator(); 
		while (itChofer.hasNext())
			System.out.println(itChofer.next());
	}
	
	public int choferesSinColectivo()
	{
		int retorno = 0;
		Iterator<Chofer> itChofer = this.choferes.iterator(); 
		while (itChofer.hasNext())
			if (itChofer.next().getColectivo() == null)
				retorno++;
		return retorno;
	}
	
	public int cantidadDeColectivos()
	{
		int retorno = 0;
		Iterator<Colectivo> itColectivo = this.colectivos.iterator();
		while (itColectivo.hasNext())
		{
			itColectivo.next();
			retorno++;
		}
		return retorno;
	}
	
	public int choferesCategoria(Categoria categoria)
	{
		int retorno = 0;
		Iterator<Chofer> itChofer = this.choferes.iterator(); 
		while (itChofer.hasNext())
			if (itChofer.next().getCategoria() == categoria)
				retorno++;
		return retorno;
	}

	public void muestraCategoriasSueldo(double sueldo)
	{
		Categoria actual;
		Iterator<Categoria> itCategoria = this.categorias.iterator();
		while (itCategoria.hasNext())
		{
			actual = itCategoria.next();
			if (actual.getSueldo() > sueldo)
				System.out.println(actual);
		}
	}
	
	public void muestraChoferesSueldo(double sueldo)
	{
		Chofer actual;
		Iterator<Chofer> itChofer = this.choferes.iterator(); 
		while (itChofer.hasNext())
		{
			actual = itChofer.next();
			if (actual.getCategoria().getSueldo() > sueldo)
				System.out.println(actual);
		}
	}
}
