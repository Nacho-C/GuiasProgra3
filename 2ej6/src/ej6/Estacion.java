package ej6;

import java.util.ArrayList;
import java.util.Iterator;

public class Estacion
{
	private ArrayList<Surtidor> surtidores = new ArrayList<Surtidor>();

	public int cantidadSurtidores()
	{
		return surtidores.size();
	}

	public int cantCombustible(String combustible)
	{
		int acum = 0;
		Iterator<Surtidor> it = this.surtidores.iterator();
		if (combustible.equals("Gasoil"))
			while (it.hasNext())
				acum += it.next().getCantGasoil();
		else
			if (combustible.equals("Super"))
				while (it.hasNext())
					acum += it.next().getCantSuper();
			else
				while (it.hasNext())
					acum += it.next().getCantPremium();
		return acum;
	}

	public Surtidor maxVentas(String combustible)
	{
		int max = -1;
		Surtidor surtidorActual, surtidorMax = null;
		Iterator<Surtidor> it = this.surtidores.iterator();
		if (combustible.equals("Gasoil"))
			while (it.hasNext())
			{
				surtidorActual = it.next();
				if (surtidorActual.getVentasGasoil() > max)
				{
					max = surtidorActual.getVentasGasoil();
					surtidorMax = surtidorActual;
				}
			}
		else
			if (combustible.equals("Super"))
				while (it.hasNext())
				{
					surtidorActual = it.next();
					if (surtidorActual.getVentasSuper() > max)
					{
						max = surtidorActual.getVentasSuper();
						surtidorMax = surtidorActual;
					}
				}
			else
				while (it.hasNext())
				{
					surtidorActual = it.next();
					if (surtidorActual.getVentasPremium() > max)
					{
						max = surtidorActual.getVentasPremium();
						surtidorMax = surtidorActual;
					}
				}
		return surtidorMax;
	}

	public void agregarSurtidor()
	{
		surtidores.add(new Surtidor());
	}

	public int getHist()
	{
		int retorno = 0;
		Surtidor actual;
		Iterator<Surtidor> it = this.surtidores.iterator();
		while (it.hasNext())
		{
			actual = it.next();
			retorno += actual.getHistGasoil() + actual.getHistPremium() + actual.getHistSuper();
		}
		return retorno;
	}

	public int getHist(String combustible)
	{
		int retorno = 0;
		Surtidor actual;
		Iterator<Surtidor> it = this.surtidores.iterator();
		if (combustible.equals("Gasoil"))
			while (it.hasNext())
			{
				actual = it.next();
				retorno += actual.getHistGasoil();
			}
		else
			if (combustible.equals("Premium"))
				while (it.hasNext())
				{
					actual = it.next();
					retorno += actual.getHistPremium();
				}
			else
				while (it.hasNext())
				{
					actual = it.next();
					retorno += actual.getHistSuper();
				}
		return retorno;
	}

	public int getHist(Surtidor surtidor)
	{
		return surtidor.getHistGasoil() + surtidor.getHistPremium() + surtidor.getHistSuper();
	}

	public int getHist(int idSurtidor)
	{
		int retorno = 0, idActual = -1;
		Surtidor actual = null;
		Iterator<Surtidor> it = this.surtidores.iterator();
		while (it.hasNext() && idActual < idSurtidor)
		{
			actual = it.next();
			idActual = actual.getId();
		}
		if (actual != null && actual.getId() == idSurtidor)
			retorno += actual.getHistGasoil() + actual.getHistPremium() + actual.getHistSuper();
		return retorno;
	}

	public Surtidor getSurtidor(int idSurtidor)
	{
		int idActual = -1;
		Surtidor retorno = null, actual = null;
		Iterator<Surtidor> it = this.surtidores.iterator();
		while (it.hasNext() && idActual < idSurtidor)
		{
			actual = it.next();
			idActual = actual.getId();
		}
		if (actual != null && actual.getId() == idSurtidor)
			retorno = actual;
		return retorno;
	}

}
