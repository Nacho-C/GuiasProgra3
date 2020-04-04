package ej3;

public class Medico extends Personaje
{

	public Medico(String equipo)
	{
		super("Medico",equipo, 40, 100);
	}

	@Override
	void recibeDaño(int cantidad)
	{
		this.energia -= 1.5*(cantidad);
	}


}
