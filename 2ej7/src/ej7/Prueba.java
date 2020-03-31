package ej7;

public class Prueba
{
	public static void main(String[] args)
	{
		Agenda agenda = new Agenda();
		agenda.agregarContacto("Nacho", 444157);
		agenda.agregarContacto("Lucho", 444158);
		agenda.agregarCelular("Nacho", 4208591);
		agenda.mostrarContactos();
	}
}
