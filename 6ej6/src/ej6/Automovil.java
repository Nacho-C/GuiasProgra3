package ej6;

public class Automovil
{
	private String marca, modelo, patente;
	private Motor motor;

	public Automovil(String marca, String modelo, String patente, Motor motor)
	{
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.motor = motor;
	}

	public String getMarca()
	{
		return this.marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return this.modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public String getPatente()
	{
		return this.patente;
	}

	public void setPatente(String patente)
	{
		this.patente = patente;
	}

	public Motor getMotor()
	{
		return this.motor;
	}

	public void setMotor(Motor motor)
	{
		this.motor = motor;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Automovil aux = (Automovil) super.clone();
		aux.motor.setFabricante(this.motor.getFabricante());
		aux.motor.setnSerie(this.motor.getnSerie());
		aux.motor.setPotencia(this.motor.getPotencia());
		return aux;
	}

}
