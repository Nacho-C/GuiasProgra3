package ej1;

public class Ordenadora
{
	public static void ordenar(Comparable[] array)
	{
		int i;
		boolean ordenado = false;
		Comparable aux;
		while (!ordenado)
		{
			ordenado = true;
			for (i = 0; i < array.length - 1; i++)
				if (array[i].compareTo(array[i+1]) > 0)
				{
					ordenado = false;
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
				}
		}
	}
}
