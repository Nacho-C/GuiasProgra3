package modelo;

public class Prueba
{

	public static void main(String[] args)
	{
		Torneo torneo = Torneo.getInstance();
		Entrenador ent1 = new Entrenador("Entrenador1"), ent2 = new Entrenador("Entrenador2"), 
                ent3 = new Entrenador("Entrenador3"), ent4 = new Entrenador("Entrenador4"),
                ent5 = new Entrenador("Entrenador5"), ent6 = new Entrenador("Entrenador6"),
                ent7 = new Entrenador("Entrenador7"), ent8 = new Entrenador("Entrenador8"),
                ent9 = new Entrenador("Entrenador9"), ent10 = new Entrenador("Entrenador10"),
                ent11 = new Entrenador("Entrenador11"), ent12 = new Entrenador("Entrenador12"),
                ent13 = new Entrenador("Entrenador13"), ent14 = new Entrenador("Entrenador14"),
                ent15 = new Entrenador("Entrenador15"), ent16 = new Entrenador("Entrenador16");
		ent1.addPokemon(new Tierra("Tierra"));
        ent1.addPokemon(new Aire("Aire"));
        ent1.addPokemon(new Hielo("HieloSuperRecarga",true));
        ent2.addPokemon(new Hielo("HieloNoSuperRecarga",false));
        ent2.addPokemon(new Electrico("Electrico"));
        ent2.addPokemon(new Agua("Agua"));
        ent3.addPokemon(new Fuego("Fuego"));
        ent3.addPokemon(new Tierra("Tierra"));
        ent3.addPokemon(new Aire("Aire"));
        ent4.addPokemon(new Hielo("HieloSuperRecarga",true));
        ent4.addPokemon(new Hielo("HieloNoSuperRecarga",false));
        ent4.addPokemon(new Electrico("Electrico"));
        ent5.addPokemon(new Agua("Agua"));
        ent5.addPokemon(new Fuego("Fuego"));
        ent5.addPokemon(new Tierra("Tierra"));
        ent6.addPokemon(new Hielo("HieloSuperRecarga",true));
        ent6.addPokemon(new Tierra("Tierra"));
        ent6.addPokemon(new Aire("Aire"));
        ent7.addPokemon(new Tierra("Tierra"));
        ent7.addPokemon(new Aire("Aire"));
        ent7.addPokemon(new Hielo("HieloNoSuperRecarga",false));
        ent8.addPokemon(new Electrico("Electrico"));
        ent8.addPokemon(new Agua("Agua"));
        ent8.addPokemon(new Fuego("Fuego"));
        ent9.addPokemon(new Tierra("Tierra"));
        ent10.addPokemon(new Aire("Aire"));
        ent11.addPokemon(new Hielo("HieloSuperRecarga",true));
        ent12.addPokemon(new Fuego("Fuego"));
        
        ent1.addCarta(new Viento());
        ent1.addCarta(new Tormenta());
        ent1.addCarta(new Niebla());
        ent2.addCarta(new Viento());
        ent2.addCarta(new Tormenta());
        ent2.addCarta(new Niebla());
        ent3.addCarta(new Viento());
        ent3.addCarta(new Tormenta());
        ent3.addCarta(new Niebla());
        ent4.addCarta(new Viento());
        ent4.addCarta(new Tormenta());
        ent4.addCarta(new Niebla());
        ent5.addCarta(new Viento());
        ent5.addCarta(new Tormenta());
        ent6.addCarta(new Viento());
        ent6.addCarta(new Tormenta());
        ent7.addCarta(new Viento());
        ent7.addCarta(new Tormenta());
        ent8.addCarta(new Viento());
        ent8.addCarta(new Tormenta());
        ent9.addCarta(new Viento());
        ent10.addCarta(new Tormenta());
        ent11.addCarta(new Niebla());
        ent12.addCarta(new Viento());
        
		torneo.addEntrenador(ent1);
        torneo.addEntrenador(ent2);
        torneo.addEntrenador(ent3);
        torneo.addEntrenador(ent4);
        torneo.addEntrenador(ent5);
        torneo.addEntrenador(ent6);
        torneo.addEntrenador(ent7);
        torneo.addEntrenador(ent8);
        torneo.addEntrenador(ent9);
        torneo.addEntrenador(ent10);
        torneo.addEntrenador(ent11);
        torneo.addEntrenador(ent12);
        torneo.addEntrenador(ent13);
        torneo.addEntrenador(ent14);
        torneo.addEntrenador(ent15);
        torneo.addEntrenador(ent16);
        
		torneo.comenzarTorneo();
		torneo.reporteGeneral();
	}
}
