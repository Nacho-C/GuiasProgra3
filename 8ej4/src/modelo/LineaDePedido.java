package modelo;

public class LineaDePedido implements Comparable
{
	private Producto producto;
	private int cantidad;

	public LineaDePedido(Producto producto)
	{
		this.producto = producto;
	}

	public LineaDePedido(Producto producto, int cantidad)
	{
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto()
	{
		return producto;
	}

	public void setProducto(Producto producto)
	{
		this.producto = producto;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public double getCosto()
	{
		return this.cantidad * this.producto.getPrecio();
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean retorno = true;
		LineaDePedido otro = (LineaDePedido) obj;
		if (this.producto != otro.producto)
			retorno = false;
		return retorno;
	}

	@Override
	public String toString()
	{
		return "Producto: " + this.producto.getCodigo() + " | Cantidad: " + this.cantidad;
	}

	@Override
	public int compareTo(Object arg0)
	{
		int retorno = 0;
		LineaDePedido otro = (LineaDePedido) arg0;
		if (this.producto.getCodigo() > otro.producto.getCodigo())
			retorno = 1;
		else
			if (this.producto.getCodigo() < otro.producto.getCodigo())
				retorno = -1;
		return retorno;
	}	
}
