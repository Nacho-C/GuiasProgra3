package ej4;

public class Principiante extends EmpleadoPermanente
{
	public Principiante(String nombre, String domicilio, long numeroLegajo, int antiguedad, double sueldoBase)
	{
		super(nombre, domicilio, numeroLegajo, antiguedad, sueldoBase);
	}

	@Override
	public double getSueldoBruto()
	{
		double retorno = this.sueldoBase;
		if (this.antiguedad >= 2)
			if (this.antiguedad < 5)
				retorno *= 1.05;
			else
				if (this.antiguedad < 10)
					retorno *= 1.07;
				else
					if (this.antiguedad < 15)
						retorno *= 1.1;
					else
						if (this.antiguedad < 20)
							retorno *= 1.15;
						else
							retorno *= 1.2;
		return retorno;
	}
}
