package ej7;

public class Tierra extends Elemento
{

	public Tierra(Interfaz interfaz)
	{
		super(interfaz);
	}

	@Override
	public double getArmadura()
	{
		return this.getInterfaz().getArmadura() * 1.25;
	}

	@Override
	public double getAtaqueCorto()
	{
		return this.getInterfaz().getAtaqueCorto() * 0.8;
	}

	@Override
	public double getAtaqueDistante()
	{
		return this.getInterfaz().getAtaqueDistante() * 0.7;
	}

	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}

}
