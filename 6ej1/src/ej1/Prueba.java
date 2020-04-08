package ej1;

public class Prueba
{

	public static void main(String[] args)
	{
		Usuario usuario;
		try
		{
			usuario = new Usuario("Luqui","k16544556");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
