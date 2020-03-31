package ej4;

public class Experto extends EmpleadoPermanente
{
	public Experto(String nombre, String domicilio, long numeroLegajo, int antiguedad, double sueldoBase)
	{
		super(nombre, domicilio, numeroLegajo, antiguedad, sueldoBase);
	}

	@Override
	public double getSueldoBruto()
	{
		return this.sueldoBase * (1.5 + 0.015 * antiguedad);
	}
}
