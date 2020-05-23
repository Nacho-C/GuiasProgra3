package modelo;

import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoGenericoOrdenado<T extends Comparable> implements IConjunto<T>
{
	private TreeSet<T> elementos = new TreeSet();
	
	@Override
	public void agrega(T elemento) throws OperacionConjuntoInvalidaException
	{
		int encontro = 0;
		Iterator<T> it = elementos.iterator();
		while (it.hasNext() && encontro == 0)
			if (it.next().equals(elemento))
				encontro = 1;
		if (encontro == 1)
			throw new OperacionConjuntoInvalidaException("El elemento ya se encontraba en el conjunto.",elemento);
		else
			elementos.add(elemento);
	}

	@Override
	public void elimina(T elemento) throws OperacionConjuntoInvalidaException
	{
		if (!this.elementos.contains(elemento))
			throw new OperacionConjuntoInvalidaException("El conjunto no contiene el elemento.",elemento);
		else
			elementos.remove(elemento);
	}

	@Override
	public int getCardinal()
	{
		return this.elementos.size();
	}

	@Override
	public Iterator<T> getIterator()
	{
		return this.elementos.iterator();
	}

	public T getMayor()
	{
		return this.elementos.last();
	}
	
	public T getMenor()
	{
		return this.elementos.first();
	}
}
