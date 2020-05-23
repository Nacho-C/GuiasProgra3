package modelo;

import java.util.PriorityQueue;

public class ListaConPrioridades<T extends Comparable>
{
	protected PriorityQueue<T> elementos = new PriorityQueue();
	
	public void agrega(T elemento)
	{
		this.elementos.add(elemento);
	}
	
	public T consultaElemento()
	{
		return this.elementos.peek();
	}
	
	public int getCantidad()
	{
		return this.elementos.size();
	}
	
	public T getElemento() throws Exception
	{
		return this.elementos.poll();
	}
}
