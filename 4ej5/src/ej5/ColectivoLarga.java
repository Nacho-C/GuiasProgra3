package ej5;

public class ColectivoLarga extends Colectivo
{
	private boolean cocheCama;

	public ColectivoLarga(String modelo, int cantPasajeros, boolean cocheCama)
	{
		super(modelo, cantPasajeros);
		this.cocheCama = cocheCama;
	}

	public boolean aceptoChofer(Chofer chofer)
	{
		return chofer.getCategoria().isHabilitaColectivoLarga();
	}

	public boolean isCocheCama()
	{
		return cocheCama;
	}

	public String toString()
	{
		return "Tipo: Colectivo de Larga Distancia\n" + super.toString() + "\n¿Es coche cama?: " + this.cocheCama;
	}
}
