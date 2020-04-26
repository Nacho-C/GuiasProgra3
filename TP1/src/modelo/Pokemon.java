package modelo;
/**
 * @author Grupo 3.
 * <br>
 * Clase Pokemon.
 * <br>
 * Descripcion: Clase abstracta que implementa las interfaces IClasificable y Cloneable. De esta clase se extienden los diferentes tipos de Pokemon. Se encarga de gestionar los atributos, de la estructura del ataque y de la implementacion del golpe inicial.<br>
 */
public abstract class Pokemon implements IClasificable, Cloneable
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
	
	public int getCategoria()
	{
		return this.puntosXP;
	}

	/**
	 * Descripcion: Realiza el ataque de 3 pasos genericos, los cuales implementa cada subclase.
	 * <br>
	 * <b>Pre:</b> Recibe una variable de clase Pokemon o de sus subclases, no nula.
	 * <br>
	 * <b>Post:</b> Este pokemon ataca al recibido por parametro.
	 * <br>
	 * @param otro Pokemon al cual se le va a realizar el ataque
	 */
	public void ataque(Pokemon otro)
	{
		this.golpeInicial(otro);
		System.out.println(this.nombre + " realiza un golpe inicial.");
		this.recarga();
		this.golpeFinal(otro);
		System.out.println(this.nombre + " realiza un golpe final.");
	}
	
	/**
	 * Descripcion: El Pokemon realiza el golpe inicial, que es generico para todos los tipos.
	 * <br>
	 * @param otro Pokemon que recibira el danio.
	 */
	public void golpeInicial(Pokemon otro)
	{
		otro.recibeDano(this.fuerza);
		this.fuerza /= 2;
	}
	
	/**
	 * Descripcion: Metodo generico que representa a los Pokemones que no recargan. Los que si lo hacen, sobreescriben este metodo en las subclases.<br>
	 */
	public void recarga()
	{
		System.out.println(this.nombre + " no recarga.");
	}
	
	/**
	 * Descripcion: Pokemon realiza el golpe final, donde cada subclase implementa su forma de hacerlo.
	 * <br>
	 * @param otro Pokemon que recibira el golpe final.<br>
	 */
	public abstract void golpeFinal(Pokemon otro);
	
	/**
	 * Descripcion: Pokemon recibe danio. Cada subclase implementa la forma de tratar ese danio
	 * <br>
	 * @param dano Valor que recibe el Pokemon como danio, de golpe inicial o golpe final.
	 */

	public abstract void recibeDano(double dano);
	
	/**
	 * Descripcion: Metodo que implementan las subclases para actuar frente a carta Niebla proveniente del adversario.<br>
	 */
	public abstract void recibeNiebla();
	
	/**
	 * Descripcion: Metodo que implementan las subclases para actuar frente a carta Viento proveniente del adversario.<br>
	 */
	public abstract void recibeViento();
	
	/**
	 * Descripcion: Metodo que implementan las subclases para actuar frente a carta Tormenta proveniente del adversario.<br>
	 */
	public abstract void recibeTormenta();
	
	/**
	 * Descripcion: Metodo que cura al Pokemon ganador de la pelea.<br>
	 */
	public abstract void curar();
	
	/**
	 * Descripcion: Sobreescritura del metodo clone() de la clase Object para hacerlo publico
	 * <br>
	 * <b>Post:</b> Se clonara el Pokemon solicitado.
	 * <br>
	 * @throws CloneNotSupportedException Si se solicita clonar un Pokemon que no es clonable (tipo Aire o Tierra), se lanza una excepcion.
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
