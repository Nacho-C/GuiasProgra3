package ej5;

public class Camion extends Vehiculo
{
	private double tara, capacidad;
	private Acoplado acoplado;

	public Camion(String modelo, int numInterno, double tara, double capacidad, Acoplado acoplado)
	{
		super(modelo, numInterno);
		this.tara = tara;
		this.capacidad = capacidad;
		this.acoplado = acoplado;
		if (acoplado == null)
			acoplado.setEnUso(true);
	}

	public boolean aceptoChofer(Chofer chofer)
	{
		return chofer.getCategoria().isHabilitaCamion();
	}

	public double getTara()
	{
		return tara;
	}

	public double getCapacidad()
	{
		return capacidad;
	}

	public Acoplado getAcoplado()
	{
		return acoplado;
	}

	public void desvincularAcoplado()
	{
		this.acoplado.setEnUso(false);
		this.acoplado = null;
	}

	public void vincularAcoplado(Acoplado acoplado)
	{
		if (acoplado.getTara() <= this.capacidad)
		{
			this.acoplado.setEnUso(true);
			this.acoplado = acoplado;
		}
	}

	@Override
	public String toString()
	{
		return "Tipo: Camión\n" + super.toString() + "\nTara del camión: " + this.tara + "\nCapacidad del camión: "
				+ this.capacidad + ((this.acoplado == null) ? "No tiene acoplado." : ("Acoplado: \n" + this.acoplado));
	}
}
