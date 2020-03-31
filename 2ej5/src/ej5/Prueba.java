package ej5;

public class Prueba
{
	public static void main(String[] args)
	{
		Domicilio dom1 = new Domicilio("España", 1139);
		Categoria cat1 = new Categoria("Chiquitín", 120000);
		Colectivo col1 = new Colectivo("Boeing 737");
		Chofer ch1 = new Chofer("Luca", cat1, dom1, col1);
		Empresa empresa = new Empresa();
		empresa.agregarChofer(ch1);
		empresa.agregarCategoria(cat1);
		empresa.agregarColectivo(col1);
		empresa.muestraChoferes();
		System.out.println("\nLa cantidad de choferes sin colectivo asignado es: " + empresa.choferesSinColectivo());
		System.out.println("\nLa cantidad total de colectivos de la empresa es: " + empresa.cantidadDeColectivos());
		System.out.println("\nLa cantidad de choferes en la categoría Chiquitín es: " + empresa.choferesCategoria(cat1));
		System.out.println("\nCategorías con sueldo mayor a 128.000:");
		empresa.muestraCategoriasSueldo(128000);
		System.out.println("\nChoferes con sueldo mayor a 100.000:");
		empresa.muestraChoferesSueldo(100000);
	}

}
