package ej4;

import java.util.ArrayList;
import java.util.Date;

public class Pedido
{
	private Proveedor proveedor;
	private Date fecha;
	private ArrayList<LineaDePedido> pedido = new ArrayList<LineaDePedido>();

	public Pedido(Proveedor proveedor)
	{
		this.proveedor = proveedor;
	}

	public Pedido(Proveedor proveedor, Date fecha)
	{
		this.proveedor = proveedor;
		this.fecha = fecha;
	}

	public Proveedor getProveedor()
	{
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor)
	{
		this.proveedor = proveedor;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public void addLinea(LineaDePedido linea)
	{
		pedido.add(linea);
	}

	public double costoTotal()
	{
		int retorno = 0;
		for (LineaDePedido n:pedido)
		{
			retorno += n.getCosto();
		}
		return retorno;
	}
}
