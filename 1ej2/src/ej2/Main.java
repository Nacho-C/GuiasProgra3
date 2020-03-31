package ej2;

public class Main
{
	public static void main(String[] args)
	{
		int min;
		String cadena, paisauxiliar;
		Persona p1 = new Persona(), p2 = new Persona(), p3 = new Persona();
		Lugar l1 = new Lugar(), l2 = new Lugar(), l3 = new Lugar();
		Imagen i1 = new Imagen(), i2 = new Imagen(), i3 = new Imagen();
		p1.setEdad(27);
		p2.setEdad(17);
		p3.setEdad(8);
		l1.setPais("Noruega");
		i2.setLugar(l1);
		i1.setLugar(l2);
		i2.setPropietario(p1);
		i1.etiquetarPersona(p1);
		i1.etiquetarPersona(p2);
		i3.agregarComentario("que hermosa foto");
		i3.agregarComentario("hola quiero hacer una denuncia de trafico de bebes");
		i3.agregarComentario("que foto horrible");
		if (p1.getEdad() <= p2.getEdad() && p1.getEdad() <= p3.getEdad())
			min = p1.getEdad();
		else
			if (p2.getEdad() <= p1.getEdad() && p2.getEdad() <= p3.getEdad())
				min = p2.getEdad();
			else
				min = p3.getEdad();
		cadena = i3.getComentarios();
		paisauxiliar = i2.getLugar().getPais();	
	}
}
