package ej6;

public class Prueba
{

	public static void main(String[] args)
	{
		CuentaCorriente cuentaC1 = new CuentaCorriente("Roberto",1000);
		CajaDeAhorro cuentaCDH1 = new CajaDeAhorro("Messi");
		CuentaUniversitaria cuentaU1 = new CuentaUniversitaria("Sandra");
		cuentaC1.depositar(10000);
		cuentaCDH1.depositar(10000);
		cuentaU1.depositar(10000);
		cuentaC1.extraer(10000);
		cuentaCDH1.extraer(5000);
		cuentaU1.extraer(10000); 
		
		System.out.println(cuentaC1.getSaldo());
		System.out.println(cuentaCDH1.getSaldo());
		System.out.println(cuentaU1.getSaldo());
		
	}

}
