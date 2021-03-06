package ej4;

public abstract class EmpleadoPermanente extends Empleado
{
	protected int antiguedad;
	protected double sueldoBase;

	public EmpleadoPermanente(String nombre, String domicilio, long numeroLegajo, int antiguedad, double sueldoBase)
	{
		super(nombre, domicilio, numeroLegajo);
		this.antiguedad = antiguedad;
		this.sueldoBase = sueldoBase;
	}

	public int getAntiguedad()
	{
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad)
	{
		this.antiguedad = antiguedad;
	}

	public double getSueldoBase()
	{
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase)
	{
		this.sueldoBase = sueldoBase;
	}

	abstract double getSueldoBruto();

	@Override
	public double getSueldoNeto()
	{
		return this.getSueldoBruto() * 0.83;
	}
}
