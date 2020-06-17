package modelo;

public class Electrico extends Pokemon
{
	private double probCritico = 0.25;

	public Electrico(String nombre)
	{
		super(nombre, 600, 80, 50);
	}

	/**
	 * Descripcion: Golpe final de los pokemon de tipo Electrico. Tiene una probabilidad de dar un critico dada por el atributo probCritico.<br>
	 */
	@Override
	public void golpeFinal(Pokemon otro)
	{
		double critico = Math.random();
		if (critico < probCritico)
		{
			otro.recibeDano(this.fuerza * 2);
			System.out.println(this.getNombre() + " realizó un ataque crítico.");
		}
		else
			otro.recibeDano(this.fuerza);
	}

	@Override
	public void recibeDano(double dano)
	{
		if (this.escudo >= dano * 0.1)
		{
			this.vitalidad -= dano * 0.9;
			this.escudo -= dano * 0.1;
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
		this.probCritico *= 0.4;
	}

	@Override
	public void recibeViento()
	{
		this.vitalidad *= 0.85;
	}

	@Override
	public void recibeTormenta()
	{
		System.out.println("El hechizo Tormenta no afecta a los Pokemon de tipo Eléctrico.");
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
		this.vitalidad = 600;
	}
}
