package ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa
{
	private String nombre;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	private static Empresa instance = null;

	private Empresa()
	{
	}

	public static Empresa getInstance()
	{
		if (Empresa.instance == null)
			Empresa.instance = new Empresa();
		return instance;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void agregarDepartamento(Departamento departamento)
	{
		this.departamentos.add(departamento);
	}

	public void eliminarDepartamento(Departamento departamento)
	{
		this.departamentos.remove(departamento);
	}

	public void imprimirPlanillas()
	{
		Departamento aux;
		Iterator<Departamento> itDepartamentos = this.departamentos.iterator();
		while (itDepartamentos.hasNext())
		{
			aux = itDepartamentos.next();
			System.out.println("Departamento: " + aux.getNombre() + "\n" + aux.planilla() + "\n");
		}
	}
}
