package ej7;

public class Mate extends Infusion
{
	public Mate() {
		
	}

	@Override
	protected void agregarTipoInfusion()
	{
		System.out.println("Se agrega yerba al mate\n");
	}

	@Override
	protected void endulzar() {
		super.endulzar();
	}
	@Override
	protected void tomar()
	{
		System.out.println("Se tomó el matesuli\n");
		
	}
	
}
