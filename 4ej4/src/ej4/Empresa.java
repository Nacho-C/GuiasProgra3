package ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa
{
	private static Empresa instance = null;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	private Empresa()
	{
	}
	
	public static Empresa getInstance()
	{
		if (Empresa.instance == null)
			Empresa.instance = new Empresa();
		return instance;
	}
	
	public Iterator<Vehiculo> getIteratorVehiculos()
	{
		return vehiculos.iterator();
	}
	
	public void addVehiculo(Vehiculo vehiculo)
	{
		vehiculos.add(vehiculo);
	}
	
	public void removeVehiculo(Vehiculo vehiculo)
	{
		vehiculos.remove(vehiculo);
	}
}
