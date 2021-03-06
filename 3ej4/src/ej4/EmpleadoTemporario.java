package ej4;

public class EmpleadoTemporario extends Empleado
{
	private int horasTrabajadas;
	private double sueldoPorHora;

	public EmpleadoTemporario(String nombre, String domicilio, long numeroLegajo, int horasTrabajadas,
			double sueldoPorHora)
	{
		super(nombre, domicilio, numeroLegajo);
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
	}

	public int getHorasTrabajadas()
	{
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas)
	{
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoPorHora()
	{
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora)
	{
		this.sueldoPorHora = sueldoPorHora;
	}

	@Override
	public double getSueldoNeto()
	{
		return this.sueldoPorHora * this.horasTrabajadas;
	}
}
