package ej2;

public class Persona
{
	private int edad;
	private Lugar lugarNacimiento;
	private String nombre;
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public Lugar getLugarNacimiento()
	{
		return lugarNacimiento;
	}
	public void setLugarNacimiento(Lugar lugarNacimiento)
	{
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
}
