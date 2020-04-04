package ej7;

public class Hechicera extends Personaje
{

	public Hechicera(String nombre)
	{
		super(nombre);
	}

	@Override
	public double getArmadura()
	{
		return 1000;
	}

	@Override
	public double getAtaqueCorto()
	{
		return 70;
	}

	@Override
	public double getAtaqueDistante()
	{
		return 50;
	}
	
	@Override
	public Interfaz eligeAdversario()
	{
		return super.elijeAdversario();
	}

}
