package ej5;

public class AutomovilManual extends Automovil
{
	public AutomovilManual(String patente, double velocidadMaxima)
	{
		super(patente, velocidadMaxima);
	}
	
	public AutomovilManual(String patente)
	{
		super(patente);
	}
	
	@Override
	public void acelerar(double velocidad)
	{
		if (velocidad > 0)
			if (this.velocidad + velocidad >= this.velocidadMaxima)
				this.velocidad = velocidadMaxima;
			else
				this.velocidad += velocidad;
	}
	
	@Override
	public void frenar(double velocidad)
	{
		if (velocidad > 0)
			if (this.velocidad - velocidad <= 0)
				this.velocidad = 0;
			else
				this.velocidad -= velocidad;
	}
	
	public void subirMarcha()
	{
		this.setMarcha(this.marcha + 1);
	}
	
	public void bajarMarcha()
	{
		this.setMarcha(this.marcha - 1);
	}
}
