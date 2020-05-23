package modelo;

import java.util.Iterator;

public interface IConjunto<T>
{
	void agrega(T elemento) throws OperacionConjuntoInvalidaException;
	void elimina(T elemento) throws OperacionConjuntoInvalidaException;
	int getCardinal();
	Iterator<T> getIterator();
}
