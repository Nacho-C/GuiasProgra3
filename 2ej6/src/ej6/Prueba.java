package ej6;

public class Prueba
{	
	public static void main(String[] args)
	{
		Estacion estacion = new Estacion();
		estacion.agregarSurtidor();
		estacion.agregarSurtidor();
		estacion.agregarSurtidor();
		estacion.getSurtidor(1).extraerGasoil(100);
		estacion.getSurtidor(1).llenarDepositoGasoil();
		estacion.getSurtidor(1).extraerSuper(110);
		estacion.getSurtidor(2).extraerSuper(300);
		estacion.getSurtidor(2).extraerPremium(50);
		estacion.getSurtidor(2).extraerSuper(20);
		estacion.getSurtidor(3).extraerPremium(450);
		System.out.println("Cantidad de surtidores: " + estacion.cantidadSurtidores());
		System.out.println("Litros de Premium en stock: " + estacion.cantCombustible("Premium"));
		System.out.println("Surtidor con más ventas de Super: " + estacion.maxVentas("Super").getId());
		System.out.println("Histórico de la estación: " + estacion.getHist());
		System.out.println("Histórico de Super: " + estacion.getHist("Super"));
		System.out.println("Histórico del surtidor 2: " + estacion.getHist(2));
	}
}
