package modelo;

import java.util.ArrayList;

public class chupapig
{
	/*public void comenzarTorneo()
	{
		this.cantPeleando = 0;
		double random = 0;
		Enfrentamiento enfrentamiento = null;
		Entrenador entrenador1 = null, entrenador2 = null;
		for (int i = 0; i < Torneo.cantArenasInicial; i++)
			this.arenas.add(new Arena());
		if (entrenadores.size() != Torneo.numeroEntrenadores)
			System.out.println("No se puede comenzar el torneo porque debe haber exactamente "
					+ Torneo.numeroEntrenadores + " entrenadores.");
		else
		{
			entrenadoresClon = (ArrayList<Entrenador>) entrenadores.clone(); // Se hace una clonacion no profunda del
																				// arreglo de entrenadores para no
																				// perder la referencia a ellos
			while (entrenadores.size() > 1 || this.cantPeleando > 0)
			{
				while ((entrenadores.size() > 1  || this.cantPeleando > 0) && entrenador1 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador1 = this.entrenadores.get((int) random);
					if (!entrenador1.tienePokemones())
					{
						System.out.println(
								entrenador1.getNombre() + " queda eliminado del torneo por no tener pokemones, con "
										+ entrenador1.getGanadas() + " rondas ganadas.\n");
						entrenadores.remove(entrenador1);
						entrenador1 = null;
					}
				}
				while ((entrenadores.size() > 1 || this.cantPeleando > 0) && entrenador2 == null)
				{
					random = (Math.random() * 0.99 * (this.entrenadores.size()));
					entrenador2 = this.entrenadores.get((int) random);
					if (entrenador2 != entrenador1)
					{
						if (!entrenador2.tienePokemones())
						{
							System.out.println(
									entrenador2.getNombre() + " queda eliminado del torneo por no tener pokemones, con "
											+ entrenador2.getGanadas() + " rondas ganadas.\n");
							entrenadores.remove(entrenador2);
							entrenador2 = null;
						}
					}
					else
						entrenador2 = null;
				}
				if (entrenadores.size() > 1)
				{
					enfrentamiento = new Enfrentamiento(entrenador1, entrenador2);
					this.cantPeleando += 2;
					this.entrenadores.remove(entrenador1);
					this.entrenadores.remove(entrenador2);
					enfrentamiento.start();
					enfrentamientos.add(enfrentamiento);
					entrenador1 = entrenador2 = null;
				}
			}
			System.out.println("El ganador del torneo es " + entrenadores.get(0).getNombre() + ", con "
					+ entrenadores.get(0).getGanadas() + " rondas ganadas.");
			
		}
	}*/
}
