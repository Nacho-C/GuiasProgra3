package ej6;

public class Prueba
{
	public static void main(String[] args)
	{
		Socio s1 = new Socio("Carlos", 72, true), s2 = new Socio("Marta", 67, false), s3 = new Socio("Julián", 49, true), s4 = new Socio("María", 37, false), s5 = new Socio ("Marcos", 17, true), s6 = new Socio("Lucía", 15, false);
		System.out.println(s1.getNombre() + ": " + s1.calcularCuota());
		System.out.println(s2.getNombre() + ": " + s2.calcularCuota());
		System.out.println(s3.getNombre() + ": " + s3.calcularCuota());
		System.out.println(s4.getNombre() + ": " + s4.calcularCuota());
		System.out.println(s5.getNombre() + ": " + s5.calcularCuota());
		System.out.println(s6.getNombre() + ": " + s6.calcularCuota());
	}
}
