package ej2;

import java.util.Date;

public class Imagen
{
	private int cantidadPersonas;
	private String comentarios = "";
	private Date fecha;
	private Lugar lugar;
	private Persona[] personasEnFoto = new Persona[100];
	private Persona propietario;

	public int getCantidadPersonas()
	{
		return cantidadPersonas;
	}

	public String getComentarios()
	{
		return comentarios;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public Lugar getLugar()
	{
		return lugar;
	}

	public void setLugar(Lugar lugar)
	{
		this.lugar = lugar;
	}

	public Persona[] getPersonasEnFoto()
	{
		return personasEnFoto;
	}

	public Persona getPropietario()
	{
		return propietario;
	}

	public void setPropietario(Persona propietario)
	{
		this.propietario = propietario;
	}

	public void agregarComentario(String comentario)
	{
		this.comentarios += ('-' + comentario + "\n");
	}

	public void etiquetarPersona(Persona participante)
	{
		this.personasEnFoto[this.cantidadPersonas] = participante;
		this.cantidadPersonas++;
	}
}
