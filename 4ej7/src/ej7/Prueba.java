package ej7;

public class Prueba
{

	public static void main(String[] args)
	{
		Mate mateico = new Mate();
		Cafe cafesuliAmargo = new Cafe();
		Cafe cafesuliDulce = new Cafe();
		cafesuliAmargo.esAmargo(true);
		mateico.prepararYTomar();
		cafesuliAmargo.prepararYTomar();
		cafesuliDulce.prepararYTomar();

	}

}
