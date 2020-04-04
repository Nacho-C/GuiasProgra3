package ej3;

public class Cuartel extends Edificio
{

	public Cuartel(String equipo)
	{
		super(equipo, 500,3000);
	}

	@Override
	public int getTiempoConstruccion()
	{
		return 60;
	}

	@Override
	void recibeDaño(int cantidad)
	{
		this.energia-=cantidad*0.5;
		
	}

}
