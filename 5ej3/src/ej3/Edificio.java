package ej3;

public abstract class Edificio extends Unidad implements Construible
{
	

	public Edificio(String equipo, int costo, int energia)
	{
		super(equipo, costo, energia,10,10);
	}

	@Override
	abstract void recibeDaño(int cantidad);

	@Override
	abstract public int getTiempoConstruccion();
	
}
