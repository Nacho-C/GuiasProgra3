package ej2;

public class Prueba
{

	public static void main(String[] args)
	{
		CD cd1 = new CD(false, "tuvieja", "titulo2" ,"Duki");
		CD cd2 = new CD(false, "tuvieja2", "titulo" ,"Duki");
		Libro libro1 = new Libro(2000,"codigo","las cronicas de tu vieja");
		Revista revista1 = new Revista(1,2000,"codigo","las cronicas de alfredito");
		cd1.añadirCancion(new Cancion(cd1.getCanciones().size()+1,4,20,"goteo"));
		cd1.añadirCancion(new Cancion(cd1.getCanciones().size()+1,4,20,"goteo2electroyvuvalu"));
		cd2.añadirCancion(new Cancion(cd2.getCanciones().size()+1,4,20,"goteo"));
		cd2.añadirCancion(new Cancion(cd2.getCanciones().size()+1,4,20,"goteo2electroyvuvalu"));
		System.out.println(libro1.isPrestado());
		System.out.println(cd2.compareTo(cd1));
		
	}

}
