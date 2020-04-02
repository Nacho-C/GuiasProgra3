package ej5;

public class Categoria
{
	private String nombreCategoria;
	private double sueldo;
	private boolean habilitaColectivoLinea, habilitaColectivoLarga, habilitaCamion;

	public Categoria(String nombreCategoria, double sueldo, boolean habilitaColectivoLinea,
			boolean habilitaColectivoLarga, boolean habilitaCamion)
	{
		this.nombreCategoria = nombreCategoria;
		this.sueldo = sueldo;
		this.habilitaColectivoLinea = habilitaColectivoLinea;
		this.habilitaColectivoLarga = habilitaColectivoLarga;
		this.habilitaCamion = habilitaCamion;
	}

	public double getSueldo()
	{
		return sueldo;
	}

	public void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}

	public String getNombreCategoria()
	{
		return nombreCategoria;
	}

	public boolean isHabilitaColectivoLinea()
	{
		return habilitaColectivoLinea;
	}

	public boolean isHabilitaColectivoLarga()
	{
		return habilitaColectivoLarga;
	}

	public boolean isHabilitaCamion()
	{
		return habilitaCamion;
	}

	public String toString()
	{
		return "\nCategoría: " + this.nombreCategoria + "\nSueldo: " + this.sueldo
				+ "\nHabilitado para Colectivos de Linea? " + this.habilitaColectivoLinea
				+ "\nHabilitado para Colectivos de Larga Distancia? " + this.habilitaColectivoLarga
				+ "\nHabilitado para Camiones? " + this.habilitaCamion;
	}

}
