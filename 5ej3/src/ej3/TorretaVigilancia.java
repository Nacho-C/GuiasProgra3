package ej3;

public class TorretaVigilancia extends Edificio implements Hostil
{

	public TorretaVigilancia(String equipo)
	{
		super(equipo, 200,2000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad adversario)
	{
		adversario.recibeDaño(10);
	}

	@Override
	public int getTiempoConstruccion()
	{
		return 40;
	}
	@Override
	void recibeDaño(int cantidad)
	{
		this.energia-=cantidad;
		
	}
	
}
