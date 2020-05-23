package modelo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ConjuntoGenerico<T> implements IConjunto<T>
{	
	private LinkedHashSet<T> elementos = new LinkedHashSet();
	
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

}
