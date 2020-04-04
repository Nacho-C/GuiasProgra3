package ej3;

public class Soldado extends Personaje implements Hostil
{

	public Soldado(String equipo)
	{
		super("Soldado",equipo, 100,500);
	}

	@Override
	void recibeDaño(int cantidad)
	{
		this.energia -= cantidad;
	}

	@Override
	public void atacar(Unidad adversario)
	{
		adversario.recibeDaño(50);
	}
}
