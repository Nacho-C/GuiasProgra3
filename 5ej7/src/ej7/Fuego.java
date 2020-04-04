package ej7;

public class Fuego extends Elemento
{
	public Fuego(Interfaz interfaz)
	{
		super(interfaz);
	}

	public void Incendiar()
	{
		System.out.println("Prende fuego");
	}

	@Override
	public double getArmadura()
	{
		return this.getInterfaz().getArmadura() * 0.5;
	}

	@Override
	public double getAtaqueCorto()
	{
		return this.getInterfaz().getAtaqueCorto() * 1.8;
	}

	@Override
	public double getAtaqueDistante()
	{
		return this.getInterfaz().getAtaqueDistante() * 1.7;
	}

	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}
}
