package modelo;

/**
 * 
 * @author Grupo 3
 * <br>
 * Clase Pokemon
 * <br>
 * Descripcion: 
 * <br>
 * Clase abstracta de la cual se extienden los diferentes tipos de Pokemon. Se encarga de gestionar los atributos, de la estructura del ataque y de la implementación del golpe inicial.
 */
public abstract class Pokemon implements IClasificable
{
	protected String nombre;
	private int puntosXP;
	protected double escudo, vitalidad, fuerza;

	public Pokemon(String nombre, double vitalidad, double fuerza, double escudo)
	{
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.fuerza = fuerza;
		this.escudo = escudo;
		this.puntosXP = 0;
	}

	public double getEscudo()
	{
		return this.escudo;
	}

	public double getVitalidad()
	{
		return this.vitalidad;
	}

	public double getFuerza()
	{
		return this.fuerza;
	}

	public String getNombre()
	{
		return this.nombre;
	}
	
	public void addXP(long XP)
	{
		this.puntosXP += XP;
	}

	
/**
 * Descripcion: Realiza el ataque de 3 pasos genéricos, los cuales implementa cada subclase.
 * <br>
 * Precondicion: Recibe una variable de clase Pokemon o de sus subclases, no nula.
 * <br>
 * Postcondicion: Este pokemon ataca al recibido por parametro.
 * <br>
 * @param otro Pokemon al cual se va a realizar el ataque
 */
	public void ataque(Pokemon otro)
	{
		this.golpeInicial(otro);
		System.out.println(this.nombre + " realiza un golpe inicial.");
		this.recarga();
		this.golpeFinal(otro);
		System.out.println(this.nombre + " realiza un golpe final.");
	}

	public void golpeInicial(Pokemon otro)
	{
		otro.recibeDano(this.fuerza);
		this.fuerza /= 2;
	}

	public void recarga()
	{
		System.out.println(this.nombre + " no recarga.");
	}

	public abstract void golpeFinal(Pokemon otro);

	public abstract void recibeDano(double dano);
	
	public int getCategoria()
	{
		return this.puntosXP;
	}
	
	public abstract void recibeNiebla();
	
	public abstract void recibeViento();
	
	public abstract void recibeTormenta();
	
	public abstract void curar();
	
	/**
	 * Descripcion: Sobreescritura del método clone() de la clase Object para hacerla pública
	 * <br>
	 * Postcondicion: En el caso de los pokemon de un tipo clonable (por ejemplo Agua) devuelve un clon. En el caso de los pokemon de un tipo no clonable (por ejemplo Aire) tira una excepción de tipo CloneNotSupportedException.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + "\nPuntos de experiencia / Categoría: " + this.puntosXP + "\nVitalidad: " + this.vitalidad + "\nFuerza: " + this.fuerza + "\nEscudo: " + this.escudo;
	}
}
