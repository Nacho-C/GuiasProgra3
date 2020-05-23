package modelo;

public class Producto
{
	private long codigo;
	private double precio;
	private String descripcion;

	public Producto(long codigo)
	{
		this.codigo = codigo;
	}

	public Producto(long codigo, String descripcion)
	{
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Producto(long codigo, double precio)
	{
		this.codigo = codigo;
		this.precio = precio;
	}

	public Producto(long codigo, String descripcion, double precio)
	{
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public double getPrecio()
	{
		return precio;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	@Override
	public String toString()
	{
		return "Código " + this.codigo;
	}
}
