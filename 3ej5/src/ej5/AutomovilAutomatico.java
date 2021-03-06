package ej5;

public class AutomovilAutomatico extends Automovil
{
	public AutomovilAutomatico(String patente, double velocidadMaxima)
	{
		super(patente, velocidadMaxima);
	}

	public AutomovilAutomatico(String patente)
	{
		super(patente);
	}

	private void cambiarMarchaAutomatico()
	{
		if (velocidad == 0)
			this.setMarcha(0);
		else
			if (velocidad <= 10)
				this.setMarcha(1);
			else
				if (velocidad <= 35)
					this.setMarcha(2);
				else
					if (velocidad <= 50)
						this.setMarcha(3);
					else
						if (velocidad <= 90)
							this.setMarcha(4);
						else
							this.setMarcha(5);
	}

	@Override
	public void acelerar(double velocidad)
	{
		if (velocidad > 0)
			if (this.velocidad + velocidad >= this.velocidadMaxima)
				this.velocidad = velocidadMaxima;
			else
				this.velocidad += velocidad;
		if (this.marcha != -1)
			this.cambiarMarchaAutomatico();
	}

	@Override
	public void frenar(double velocidad)
	{
		if (velocidad > 0)
			if (this.velocidad - velocidad <= 0)
				this.velocidad = 0;
			else
				this.velocidad -= velocidad;
		if (this.marcha != -1)
			this.cambiarMarchaAutomatico();
	}

	public void setPuntoMuerto()
	{
		this.setMarcha(0);
	}

	public void setReversa()
	{
		this.setMarcha(-1);
	}
}
