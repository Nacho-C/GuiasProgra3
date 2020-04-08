package ej2;

public class Prueba
{

	public static void main(String[] args)
	{
		CuentaBancaria cuenta = new CuentaBancaria("Luca");
		try
		{
			cuenta.depositar(7220);
			System.out.println("Se depositaron 7220");
		}
		catch (DepositoInvalidoException e)
		{
			//Aca nunca entra
			e.printStackTrace();
		}
		try
		{
			//Nunca puede
			cuenta.depositar(0);
		}
		catch (DepositoInvalidoException e)
		{
			System.out.println(e.getMessage() + e.getCantidadInvalida());
		}
		
		try
		{
			cuenta.extraer(5000);
		}
		catch (ExtraccionInvalidaException e)
		{
			//Nunca puede
			e.printStackTrace();
		}
		
		try
		{
			//No puede
			cuenta.extraer(3000);
		}
		catch (ExtraccionInvalidaException e)
		{
			System.out.println(e.getMessage() + "\nSaldo: " + e.getDato().getSaldo() + "\nMonto: " + e.getDato().getExtraccionSolicitada());
		}
	}

}
