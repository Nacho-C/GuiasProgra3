package ej7;

public class Agua extends Elemento
{

	public Agua(Interfaz interfaz)
	{
		super(interfaz);
	}

	@Override
	public double getArmadura()
	{
		return this.getInterfaz().getArmadura() * 0.85;
	}

	@Override
	public double getAtaqueCorto()
	{
		return this.getInterfaz().getAtaqueCorto() * 1.2;
	}

	@Override
	public double getAtaqueDistante()
	{
		return this.getInterfaz().getAtaqueDistante();
	}
	
	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}
}
