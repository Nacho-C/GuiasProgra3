package modelo;

import java.util.Date;
import java.util.Iterator;

public class Pedido extends ConjuntoGenericoOrdenado<LineaDePedido>
{
	private Proveedor proveedor;
	private Date fecha;

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

	public double costoTotal()
	{
		int retorno = 0;
		Iterator<LineaDePedido> it = this.getIterator();
		while (it.hasNext())
			retorno += it.next().getCosto();
		return retorno;
	}
	
	public String toString()
	{
		String retorno = "";
		Iterator<LineaDePedido> it = this.getIterator();
		while (it.hasNext())
			retorno += it.next().toString() + " | \n";
		retorno += "Costo total: " + this.costoTotal();
		return retorno;
	}
}
