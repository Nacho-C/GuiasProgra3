package ej7;

import java.util.HashMap;
import java.util.Iterator;

public class Agenda
{
	private HashMap<String, NumerosContacto> contactos = new HashMap<String, NumerosContacto>();

	public void agregarContacto(String nombre, long fijo)
	{
		NumerosContacto numeros = new NumerosContacto(fijo);
		if (this.contactos.containsKey(nombre))
			System.out.println("Contacto ya existente");
		else
			this.contactos.put(nombre, numeros);
	}

	public void eliminarContacto(String nombre)
	{
		if (this.contactos.containsKey(nombre))
			this.contactos.remove(nombre);
		else
			System.out.println("No existe el contacto " + nombre);
	}
	
	public void cambiarNombre(String viejo, String nuevo)
	{
		NumerosContacto numeros;
		if (this.contactos.containsKey(viejo))
		{
			numeros = this.contactos.get(viejo);
			this.contactos.remove(viejo);
			this.contactos.put(nuevo, numeros);
		}
		else
			System.out.println("No existe el contacto " + viejo);
	}
	
	public void cambiarFijo(String nombre, long fijo)
	{
		if (this.contactos.containsKey(nombre))
			this.contactos.get(nombre).setFijo(fijo);
		else
			System.out.println("No existe el contacto " + nombre);
	}

	public void agregarCelular(String nombre, long celular)
	{
		if (this.contactos.containsKey(nombre))
			this.contactos.get(nombre).addCelular(celular);
		else
			System.out.println("No existe el contacto " + nombre);
	}

	public void eliminarCelular(String nombre, long celular)
	{
		if (this.contactos.containsKey(nombre))
			this.contactos.get(nombre).addCelular(celular);
		else
			System.out.println("No existe el contacto " + nombre);
	}

	public boolean estaContacto(String nombre)
	{
		boolean retorno = false;
		if (this.contactos.containsKey(nombre))
			retorno = true;
		return retorno;
	}
	
	public void mostrarContactos()
	{
		System.out.println(contactos);
	}
}
