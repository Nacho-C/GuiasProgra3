package ej3;

public class Main
{
	public static void main(String[] args)
	{
		Categoria c1 = new Categoria("Principiante",80), c2 = new Categoria("Operario",100), c3 = new Categoria("Experto",130);
		Empleado juanP = new Empleado(), robG = new Empleado(), sandL = new Empleado(), gerG = new Empleado(), vicH = new Empleado(), caroG = new Empleado();
		juanP.setAntiguedad(4);
		juanP.setCat(c1);
		juanP.setHsTrabajadas(100);
		juanP.setNombre("Juan Pérez");
		robG.setAntiguedad(8);
		robG.setCat(c1);
		robG.setHsTrabajadas(120);
		robG.setNombre("Roberto González");
		sandL.setAntiguedad(14);
		sandL.setCat(c1);
		sandL.setHsTrabajadas(120);
		sandL.setNombre("Sandra López");
		gerG.setAntiguedad(16);
		gerG.setCat(c2);
		gerG.setHsTrabajadas(110);
		gerG.setNombre("German Gutiérrez");
		vicH.setAntiguedad(9);
		vicH.setCat(c3);
		vicH.setHsTrabajadas(100);
		vicH.setNombre("Vicente Hernández");
		caroG.setAntiguedad(20);
		caroG.setCat(c3);
		caroG.setHsTrabajadas(115);
		caroG.setNombre("Carolina Gómez");
		System.out.println(juanP.getNombre() + ": " + juanP.getSueldo() + "\n" + robG.getNombre() + ": " + robG.getSueldo() + "\n" + sandL.getNombre() + ": " + sandL.getSueldo() + "\n" + gerG.getNombre() + ": " + gerG.getSueldo() + "\n" + vicH.getNombre() + ": " + vicH.getSueldo() + "\n" + caroG.getNombre() + ": " + caroG.getSueldo() + "\n");
	}
}
