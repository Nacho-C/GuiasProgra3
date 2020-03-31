package ej3;

public class Prueba
{
	public static void main(String[] args)
	{
		Vehiculo v = new Coche();
		Coche c = (Coche) v;
		//Bicicleta b = (Bicicleta) v;
		Vehiculo o = v;
		Vehiculo v2 = o;
		Vehiculo b2 = new Bicicleta();
		Bicicleta b3 = (Bicicleta) b2;
		v.detalle();
		c.detalle();
		//b.detalle();
		o.detalle();
		v2.detalle();
		b2.detalle();
		b3.detalle();
		System.out.println(v.a);
		System.out.println(c.a);
		//System.out.println(b.a);
		System.out.println(o.a);
		System.out.println(v2.a);
		System.out.println(b2.a);
		System.out.println(b3.a);
		System.out.println(v.getA());
		System.out.println(c.getA());
		//System.out.println(b.getA());
		System.out.println(o.getA());
		System.out.println(v2.getA());
		System.out.println(b2.getA());
		System.out.println(b3.getA());
	}
}