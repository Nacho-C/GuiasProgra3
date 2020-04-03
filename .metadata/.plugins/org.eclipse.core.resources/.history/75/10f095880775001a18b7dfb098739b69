package ej6;

public class ArchivoComprimido extends Directorio
{
	protected int tazaCompresion;

	public ArchivoComprimido(String nombre, int tazaCompresion)
	{
		super(nombre);
		this.tazaCompresion = tazaCompresion;
	}

	public int getTazaCompresion()
	{
		return this.tazaCompresion;
	}

	public double getTamaño()
	{
		return super.getTamaño() * this.tazaCompresion / 100;
	}
}
