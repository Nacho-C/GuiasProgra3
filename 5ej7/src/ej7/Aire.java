package ej7;

public class Aire extends Elemento
{
	public Aire(Interfaz interfaz)
	{
		super(interfaz);
	}

	public void InvocarHuracan()
	{
		System.out.println("Invoca un huracan");
	}

	@Override
	public double getArmadura()
	{
		return this.getInterfaz().getArmadura() * 0.9;
	}

	@Override
	public double getAtaqueCorto()
	{
		return this.getInterfaz().getAtaqueCorto() * 1.2;
	}

	@Override
	public double getAtaqueDistante()
	{
		return this.getInterfaz().getAtaqueDistante() + 10;
	}
	
	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}
}
