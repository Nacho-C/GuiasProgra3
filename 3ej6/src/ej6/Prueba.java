package ej6;

public class Prueba
{

	public static void main(String[] args)
	{
		Archivo foto1 = new Archivo("CAM00053.jpg", 150), foto2 = new Archivo("CAM0004.jpg",200),
				canc1 = new Archivo("Save me.mp3", 2500), canc2 = new Archivo("Bohemian Rhapsody.mp3", 5300),
				canc3 = new Archivo("Made in heaven.mp3", 6500);
		ArchivoComprimido comp1 = new ArchivoComprimido("Queen.zip", 80);
		Link link1 = new Link("Acceso directo a Save me.mp3.lnk", canc1);
		Directorio c = new Directorio("C:");
		Directorio fotos = new Directorio("fotos");
		Directorio mp3 = new Directorio("mp3");
		Directorio Queen = new Directorio("Queen");
		Directorio theBeatles = new Directorio("The Beatles");
		Archivo archivo1 = new Archivo("El choclo.mp3", 3500);
		Archivo archivo2 = new Archivo("El dia que me quieras.mp3", 4500);
		Archivo archivo3 = new Archivo("Narajo en flor.mp3", 5000);
		Archivo archivo4 = new Archivo("Let it be.mp3",3530);
        Archivo archivo5 = new Archivo("Yesterday.mp3",3000);
        Queen.agregarArchivo(canc1);
        Queen.agregarArchivo(canc2);
        Queen.agregarArchivo(canc3);
        fotos.agregarArchivo(foto1);
        fotos.agregarArchivo(foto2);
        comp1.agregarDirectorio(Queen);
		mp3.agregarArchivo(archivo1);
		mp3.agregarArchivo(archivo2);
		mp3.agregarArchivo(archivo3);
		theBeatles.agregarArchivo(archivo4);
        theBeatles.agregarArchivo(archivo5);
        c.agregarArchivo(link1);
        c.agregarDirectorio(comp1);
        c.agregarDirectorio(mp3);
        c.agregarDirectorio(fotos);
        mp3.agregarDirectorio(Queen);
        mp3.agregarDirectorio(theBeatles);
        System.out.println(c.buscaArchivo("Save me.mp3").getTamaño());
	}
}
