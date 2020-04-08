package ej3;

public class Prueba
{

	public static void main(String[] args)
	{
		Surtidor surtidor = new Surtidor();
		try
		{
			surtidor.cargarCombustible("Premium", -1);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			surtidor.cargarCombustible("ChotoDeMono", 500);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			surtidor.cargarCombustible("Diesel", 210000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			surtidor.cargarCombustible("Super", 500);
			System.out.println("Cargo correctamente 500 de Super");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
