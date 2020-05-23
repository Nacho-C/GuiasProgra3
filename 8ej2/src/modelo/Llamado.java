package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Llamado implements Comparable
{
	private GregorianCalendar fechaHoraAtendido, fechaHoraPedido;
	private int prioridad;
	private Socio socio;
	private DateFormat formatter = new SimpleDateFormat("dd/MM/YYYY, HH:mm");
	
	public Llamado(int prioridad, Socio socio)
	{
		this.prioridad = prioridad;
		this.socio = socio;
		this.fechaHoraPedido = new GregorianCalendar();
		this.fechaHoraAtendido = null;
	}

	public GregorianCalendar getFechaHoraAtendido()
	{
		return this.fechaHoraAtendido;
	}
	
	public void setFechaHoraAtendido(GregorianCalendar fechaHoraAtendido)
	{
		this.fechaHoraAtendido = fechaHoraAtendido;
	}

	public GregorianCalendar getFechaHoraPedido()
	{
		return this.fechaHoraPedido;
	}

	public int getPrioridad()
	{
		return this.prioridad;
	}

	public Socio getSocio()
	{
		return this.socio;
	}
	
	@Override
	public int compareTo(Object o)
	{
		int retorno;
		Llamado otro = (Llamado) o;
		if (otro == null)
			return -1;
		else
			if (this.prioridad > otro.prioridad)
				retorno = -1;
			else
				if (this.prioridad < otro.prioridad)
					return 1;
				else
					retorno = this.fechaHoraPedido.compareTo(otro.fechaHoraPedido);
		return retorno;
	}
	
	@Override
	public String toString()
	{
		return this.socio + "\nPrioridad: " + this.prioridad + "\nFecha y hora del pedido: " + this.formatter.format(this.fechaHoraPedido.getTime());
	}
	
}
