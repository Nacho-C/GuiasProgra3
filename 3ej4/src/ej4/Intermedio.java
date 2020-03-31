package ej4;

public class Intermedio extends EmpleadoPermanente
{
	public Intermedio(String nombre, String domicilio, long numeroLegajo, int antiguedad, double sueldoBase)
	{
		super(nombre, domicilio, numeroLegajo, antiguedad, sueldoBase);
	}

	@Override
	public double getSueldoBruto()
	{
		return this.sueldoBase * (1.25 + 0.01 * antiguedad);
	}
}
