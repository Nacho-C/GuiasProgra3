package ej7;

public class Guerrero extends Personaje
{

	public Guerrero(String nombre)
	{
		super(nombre);
	}

	@Override
	public double getArmadura()
	{
		return 1500;
	}

	@Override
	public double getAtaqueCorto()
	{
		return 100;
	}

	@Override
	public double getAtaqueDistante()
	{
		return 100;
	}

	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}
}
