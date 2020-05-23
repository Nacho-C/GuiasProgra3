package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado>
{
	private ArrayList<Llamado> atendidos = new ArrayList();
	
	@Override
	public Llamado getElemento() throws Exception
	{
		this.atendidos.add(this.elementos.peek());
		this.elementos.peek().setFechaHoraAtendido(new GregorianCalendar());
		return this.elementos.poll();
	}
	
	public int cantidadLlamados(Socio socio)
	{
		int retorno = 0;
		Iterator<Llamado> itLlamados = this.elementos.iterator();
		while (itLlamados.hasNext())
			if (itLlamados.next().getSocio().equals(socio))
				retorno++;
		itLlamados = this.atendidos.iterator();
		while (itLlamados.hasNext())
			if (itLlamados.next().getSocio().equals(socio))
				retorno++;
		return retorno;
	}
	
	public Iterator<Llamado> getLlamadosAtendidos()
	{
		return this.atendidos.iterator();
	}
	
	public Socio getSocioMasEmergencias()
	{
		int max = -1;
		Socio retorno = null, aux;
		Map.Entry<Socio, Integer> par;
		HashMap<Socio, Integer> hm = new HashMap();
		Iterator<Llamado> itLlamados = this.atendidos.iterator();
		Iterator itSocios;
		while (itLlamados.hasNext()) //Paso los socios atendidos a un HashMap que tiene como valor la cantidad de ocurrencias
		{
			aux = itLlamados.next().getSocio();
			if (hm.get(aux) == null)
				hm.put(aux, 1);
			else
				hm.put(aux, hm.get(aux) + 1);
		}
		itSocios = hm.entrySet().iterator();
		while (itSocios.hasNext()) //Busco el socio con mayor valor en el HashMap
		{
			par = (Map.Entry<Socio, Integer>) itSocios.next();
			if (par.getValue() > max)
			{
				max = par.getValue();
				retorno = par.getKey();
			}
		}
		return retorno;
	}
}
