package ej1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Prueba
{
	public static void main(String[] args)
	{
		int i;
		Persona p1 = new Persona("Carlos","Perez","Colon 3212"), p2 = new Persona("Carlos","Perez","Colon 3212"), p3 = new Persona("Ana","Garcia","Mitre 2812"), p4 = new Persona("Valeria","Alvarez","San Luis 2812"), p5 = new Persona("Luis","Garcia","Matheu 3538");
		//Inciso C
		Persona[] personas = {p1,p2,p3,p4,p5};
		System.out.println("Persona 1: \n" + p1.toString() + "HashCode: " + p1.hashCode() + "\n");
		System.out.println("Persona 2: \n" + p2.toString() + "HashCode: " + p2.hashCode() + "\n");
		System.out.println("Persona 1 == Persona 2: " + (p1 == p2));
		System.out.println("Persona 1 equals Persona 2: " + p1.equals(p2));
		System.out.println("\n*****\n\nArreglo inicial:\n");
		for (i=0;i<personas.length;i++)
			System.out.println(personas[i]);
		Ordenadora.ordenar(personas);
		System.out.println("\n*****\n\nArreglo ordenado:\n");
		for (i=0;i<personas.length;i++)
			System.out.println(personas[i]);
		//Inciso D
		Iterator<Persona> itPersonas;
		
		System.out.println("\n*****\nHashSet:\n");
		HashSet<Persona> hashset = new HashSet();
		hashset.add(p1);
		hashset.add(p2);
		hashset.add(p3);
		hashset.add(p4);
		hashset.add(p5);
		itPersonas = hashset.iterator();
		while (itPersonas.hasNext())
			System.out.println(itPersonas.next());
		
		System.out.println("\n*****\nLinkedHashSet:\n");
		LinkedHashSet<Persona> linkedhashset = new LinkedHashSet();
		linkedhashset.add(p1);
		linkedhashset.add(p2);
		linkedhashset.add(p3);
		linkedhashset.add(p4);
		linkedhashset.add(p5);
		itPersonas = linkedhashset.iterator();
		while (itPersonas.hasNext())
			System.out.println(itPersonas.next());
		
		System.out.println("\n*****\nTreeSet:\n");
		TreeSet<Persona> treeset = new TreeSet();
		treeset.add(p1);
		treeset.add(p2);
		treeset.add(p3);
		treeset.add(p4);
		treeset.add(p5);
		itPersonas = treeset.iterator();
		while (itPersonas.hasNext())
			System.out.println(itPersonas.next());
		
		System.out.println("\n*****\nArrayList:\n");
		ArrayList<Persona> arraylist = new ArrayList();
		arraylist.add(p1);
		arraylist.add(p2);
		arraylist.add(p3);
		arraylist.add(p4);
		arraylist.add(p5);
		itPersonas = arraylist.iterator();
		while (itPersonas.hasNext())
			System.out.println(itPersonas.next());
		
		System.out.println("\n*****\nLinkedList:\n");
		LinkedList<Persona> linkedlist = new LinkedList();
		linkedlist.add(p1);
		linkedlist.add(p2);
		linkedlist.add(p3);
		linkedlist.add(p4);
		linkedlist.add(p5);
		itPersonas = linkedlist.iterator();
		while (itPersonas.hasNext())
			System.out.println(itPersonas.next());
		
		System.out.println("\n*****\nPriorityQueue:\n");
		PriorityQueue<Persona> priorityqueue = new PriorityQueue();
		priorityqueue.add(p1);
		priorityqueue.add(p2);
		priorityqueue.add(p3);
		priorityqueue.add(p4);
		priorityqueue.add(p5);
		while (!priorityqueue.isEmpty())
			System.out.println(priorityqueue.poll());
	}
}
