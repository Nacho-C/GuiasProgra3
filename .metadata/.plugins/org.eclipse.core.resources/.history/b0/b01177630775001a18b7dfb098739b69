package ej6;

import java.time.LocalDate;

public class Archivo
{
	protected String nombre;
	protected LocalDate fechaCreacion;
	private LocalDate fechaUltMod;
	private double tamaño;

	public Archivo(String nombre, double tamaño)
	{
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.fechaUltMod = this.fechaCreacion = LocalDate.now();
	}

	protected Archivo(String nombre)
	{
		this.nombre = nombre;
		this.fechaUltMod = this.fechaCreacion = LocalDate.now();
	}

	public String getNombre()
	{
		return nombre;
	}

	public LocalDate getFechaCreacion()
	{
		return fechaCreacion;
	}

	public LocalDate getFechaUltMod()
	{
		return fechaUltMod;
	}

	public double getTamaño()
	{
		return tamaño;
	}

	public void setNombre(String nuevoNombre)
	{
		this.nombre = nuevoNombre;
		fechaUltMod = LocalDate.now();
	}
}
