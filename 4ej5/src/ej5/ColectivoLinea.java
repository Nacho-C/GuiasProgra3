package ej5;

public class ColectivoLinea extends Colectivo
{

	public ColectivoLinea(String modelo, int cantPasajeros)
	{
		super(modelo, cantPasajeros);
	}

	public boolean aceptoChofer(Chofer chofer)
	{
		return chofer.getCategoria().isHabilitaColectivoLinea();
	}

	public String toString()
	{
		return "Tipo: Colectivo de Linea\n" + super.toString();
	}
}
