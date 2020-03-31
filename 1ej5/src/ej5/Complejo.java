package ej5;



public class Complejo
{
	private double imaginario, real;
	
	public Complejo()
	{
		this.imaginario = this.real = 0;
	}

	public Complejo(double real, double imaginario)
	{
		this.imaginario = imaginario;
		this.real = real;
	}

	public double getImaginario()
	{
		return imaginario;
	}

	public void setImaginario(double imaginario)
	{
		this.imaginario = imaginario;
	}

	public double getReal()
	{
		return real;
	}

	public void setReal(double real)
	{
		this.real = real;
	}
	
	public double argumento()
	{
		double retorno;
		if (this.real == 0)
			if (this.imaginario == 0)
				retorno = 0;
			else
				if (this.imaginario > 0)
					retorno = 90;
				else
					retorno = 270;
		else
		{
			retorno = Math.atan(this.imaginario / this.real);
			if (this.real < 0 && this.imaginario > 0)
				retorno += 180;
			else
				if (this.real < 0 && this.imaginario < 0)
					retorno -= 180;
		}
		return retorno;
	}
	
	public void conjugado()
	{
		this.imaginario *= (-1);
	}
	
	public void division(Complejo divisor)
	{
		double numReal = (this.real * divisor.real) + (this.imaginario * divisor.Imaginario);
		double numIm = (this.imaginario * divisor.real) - (this.real *divisor.Imaginario);
		double denominador = (divisor.real * divisor.real) + (divisor.Imaginario * divisor.Imaginario);
		this.real = numReal / denominador;
		this.imaginario = numIm / denominador;
	}
	
	public double modulo()
	{
		return Math.sqrt((this.real * this.real) + (this.imaginario * this.imaginario));
	}
	
	public void producto(Complejo factor)
	{
		double aux = this.real;
		this.real = this.real * factor.real - this.imaginario * getImaginario();
		this.imaginario = aux * factor.Imaginario + this.imaginario * factor.real;
	}
	
	public void productoPorReal(double factor)
	{
		this.real *= factor;
		this.imaginario *= factor;
	}
	
	public void resta(Complejo sustraendo)
	{
		this.real -= sustraendo.real;
		this.imaginario -= sustraendo.Imaginario;
	}
	
	public void suma(Complejo sumando)
	{
		this.real += sumando.real;
		this.imaginario += sumando.Imaginario;
	}
}
