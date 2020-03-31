package ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class Departamento
{
	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Departamento(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void agregarEmpleado(Empleado empleado)
	{
		this.empleados.add(empleado);
	}

	public void eliminarEmpleado(Empleado empleado)
	{
		this.empleados.remove(empleado);
	}

	public String planilla()
	{
		String retorno = "Empleado\t\t\tSueldo\n";
		Empleado aux;
		Iterator<Empleado> itEmpleados = this.empleados.iterator();
		while (itEmpleados.hasNext())
		{
			aux = itEmpleados.next();
			retorno += aux.nombre + "\t\t\t" + aux.getSueldoNeto() + "\n";
		}
		return retorno;
	}

}
