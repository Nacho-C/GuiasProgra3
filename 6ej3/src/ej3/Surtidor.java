package ej3;

public class Surtidor
{
	private static final double capacidadMaxima = 20000;
	private double cantidadDiesel, cantidadPremium, cantidadSuper;

	public Surtidor()
	{
		this.cantidadDiesel = this.cantidadPremium = this.cantidadSuper = Surtidor.capacidadMaxima;
	}

	public double getCantidadDiesel()
	{
		return this.cantidadDiesel;
	}

	public double getCantidadPremium()
	{
		return this.cantidadPremium;
	}

	public double getCantidadSuper()
	{
		return this.cantidadSuper;
	}

	public void llenarDiesel()
	{
		this.cantidadDiesel = Surtidor.capacidadMaxima;
	}
	
	public void llenarPremium()
	{
		this.cantidadPremium = Surtidor.capacidadMaxima;
	}
	
	public void llenarSuper()
	{
		this.cantidadSuper = Surtidor.capacidadMaxima;
	}
	
	public void cargarCombustible(String combustible, double cantidad) throws Exception
	{
		if (cantidad < 0)
			throw new CargaInvalidaException("La cantidad ingresada es menor a 0",combustible,cantidad,0);
		else
			if (combustible.equals("Diesel"))
				if (this.cantidadDiesel >= cantidad)
					this.cantidadDiesel -= cantidad;
				else
					throw new FaltaCombustibleException("No alcanza el combustible",combustible,cantidad,this.cantidadDiesel);
			else
				if (combustible.equals("Premium"))
					if (this.cantidadPremium >= cantidad)
						this.cantidadPremium -= cantidad;
					else
						throw new FaltaCombustibleException("No alcanza el combustible",combustible,cantidad,this.cantidadPremium);
				else
					if (combustible.equals("Super"))
						if (this.cantidadSuper >= cantidad)
							this.cantidadSuper -= cantidad;
						else
							throw new FaltaCombustibleException("No alcanza el combustible",combustible,cantidad,this.cantidadSuper);
					else
						throw new TipoCombustibleInvalidoException("El combustible es invalido",combustible,cantidad,0);
	}
}
