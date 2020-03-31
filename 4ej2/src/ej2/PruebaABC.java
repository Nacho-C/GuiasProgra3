package ej2;

public class PruebaABC
{
	public static void main(String[] args)
	{
		ClaseC datoc = new ClaseC();
		//ClaseA datoX = new ClaseA();
		datoc.m3();
		datoc.m2();
		datoc.m1();
		System.out.println("El valor de los atributos es: \n " + " varC1=" + datoc.varC1 + "var1=" + datoc.var1
				+ " var2=" + datoc.var2 + " varB1=" + datoc.varB1);
		/*datoX.m3();
		datoX.m2();
		datoc.m1();
		System.out.println("El valor de los atributos es: \n "+ " varC1="+
		datoX.varC1 +
		 " var1="+ datoX.var1 + " var2="+ datoX.var2 +" varB1=" + datoX.varB1);*/
	}
}
