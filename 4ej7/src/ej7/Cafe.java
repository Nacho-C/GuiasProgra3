package ej7;

public class Cafe extends Infusion
{
	private boolean amargo;
	
	public Cafe() {
	}
	
	public void esAmargo(boolean amargo) {
		this.amargo=amargo;
	}
	@Override
	protected void agregarTipoInfusion()
	{
		System.out.println("Se agrega Cafe Molido a la taza\n");
	}

	@Override
	protected void endulzar()
	{
		if (!this.amargo)
			System.out.println("Se agrega azucar a la bebida\n");
		else
			super.endulzar();
	}

	@Override
	protected void tomar()
	{ 
		if (this.amargo)
			System.out.println("Se tomó el cafesuli amargo\n");
		else
			System.out.println("Se tomó el cafesuli dulce\n");
	}
	
}
