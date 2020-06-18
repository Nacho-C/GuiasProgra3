package modelo;

public class Fuego extends Pokemon
{
	public Fuego(String nombre)
	{
		super(nombre, 530, 80, 200);
	}

	@Override
	public void recarga()
	{
		this.fuerza *= 1.1;
		this.vitalidad *= 1.1;
		//System.out.println(this.nombre + " recargó 10% de fuerza y 10% de vitalidad.");
	}

	@Override
	public void golpeFinal(Pokemon otro)
	{
		otro.recibeDano(this.fuerza * 1.25);
		this.fuerza = 0;
	}

	@Override
	public void recibeDano(double dano)
	{
		if (this.escudo >= dano / 2)
		{
			this.vitalidad -= dano / 2;
			this.escudo -= dano / 2;
		}
		else
		{
			this.vitalidad -= dano - this.escudo;
			this.escudo = 0;
		}
	}

	@Override
	public void recibeNiebla()
	{
		//System.out.println("El hechizo Niebla no afecta a los Pokemon de tipo Fuego.");
	}

	@Override
	public void recibeViento()
	{
		this.escudo *= 0.5;
	}

	@Override
	public void recibeTormenta()
	{
		this.vitalidad *= 0.9;
	}

	@Override
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			//Nunca se ejecuta ya que el Pokemon siempre es clonable
			return null;
		}
	}

	@Override
	public void curar()
	{
		this.vitalidad = 530;
	}
}
