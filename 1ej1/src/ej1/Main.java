package ej1;

public class Main
{
	public static void main(String[] args)
	{
		String aux = new String();
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(1250);
		cuenta.extraer(450);
		System.out.println("Saldo: " + cuenta.getSaldo());
		cuenta.setTitular("Juan Perez");
		aux = cuenta.getTitular();
		System.out.println("Titular: " + cuenta.getTitular());
	}
}
