package ej5;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa
{
	private static Empresa instance = null;
	private String nombre;
	ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	ArrayList<Acoplado> acoplados = new ArrayList<Acoplado>();

	private Empresa(String nombre)
	{
		this.nombre = nombre;
	}

	public static Empresa getInstance(String nombre)
	{
		if (Empresa.instance == null)
			Empresa.instance = new Empresa(nombre);
		return Empresa.instance;
	}

	public String getNombre()
	{
		return nombre;
	}

	public ArrayList<Vehiculo> getVehiculos()
	{
		return vehiculos;
	}

	public ArrayList<Chofer> getChoferes()
	{
		return choferes;
	}

	public ArrayList<Categoria> getCategorias()
	{
		return categorias;
	}

	public ArrayList<Acoplado> getAcoplados()
	{
		return acoplados;
	}

	public void addChofer(Chofer chofer)
	{
		this.choferes.add(chofer);
	}

	public void removeChofer(Chofer chofer)
	{
		this.choferes.remove(chofer);
	}

	public void addVehiculo(Vehiculo vehiculo)
	{
		this.vehiculos.add(vehiculo);
	}

	public void removeVehiculo(Vehiculo vehiculo)
	{
		this.vehiculos.remove(vehiculo);
	}

	public void addCategoria(Categoria categoria)
	{
		this.categorias.add(categoria);
	}

	public void removeCategoria(Categoria categoria)
	{
		this.categorias.remove(categoria);
	}
	
	public void addAcoplado(Acoplado acoplado)
	{
		this.acoplados.add(acoplado);
	}

	public void removeAcoplado(Acoplado acoplado)
	{
		this.acoplados.remove(acoplado);
	}
	
	public int cantChoferesCategoria(Categoria categoria)
	{
		Iterator<Chofer> it = this.choferes.iterator();
		int retorno = 0;
		while (it.hasNext())
			if (it.next().getCategoria() == categoria)
				retorno++;
		return retorno;
	}
	
	public int cantChoferesSinVehiculo()
	{
		Iterator<Chofer> it = this.choferes.iterator();
		int retorno = 0;
		while (it.hasNext())
			if (it.next().getVehiculoAsignado() == null)
				retorno++;
		return retorno;
	}
	
	public int cantVehiculosTotal()
	{
		return this.vehiculos.size();
	}
	
	public int cantAcopladosTotal()
	{
		return acoplados.size();
	}
	
	public String mostrarChoferes()
	{
		String retorno = "";
		Iterator<Chofer> it = this.choferes.iterator();
		while (it.hasNext())
			retorno += it.next();
		return retorno;
	}
	
	public String mostrarVehiculos()
	{
		String retorno = "";
		Iterator<Vehiculo> it = this.vehiculos.iterator();
		while (it.hasNext())
			retorno += it.next();
		return retorno;
	}
	
	public String mostrarAcoplados()
	{
		String retorno = "";
		Iterator<Acoplado> it = this.acoplados.iterator();
		while (it.hasNext())
			retorno += it.next();
		return retorno;
	}
}
