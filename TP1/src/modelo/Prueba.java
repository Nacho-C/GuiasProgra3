package modelo;

public class Prueba
{

	public static void main(String[] args)
	{
		Torneo torneo = Torneo.getInstance();
		Entrenador ent1 = new Entrenador("Lucho"), ent2 = new Entrenador("Gabriel"), ent3 = new Entrenador("Cazorla"), ent4 = new Entrenador("Papá");
		ent1.addPokemon(new Tierra("Geodude"));
		ent1.addPokemon(new Aire("Papá2"));
		ent1.addPokemon(new Hielo("Fresquito",true));
		ent2.addPokemon(new Hielo("Ligeramente Menos Fresquito",false));
		ent2.addPokemon(new Electrico("Electrico"));
		ent3.addPokemon(new Agua("Squirtle"));
		ent3.addPokemon(new Electrico("Carlitos Chiuro"));
		ent4.addPokemon(new Fuego("Papá"));
		ent1.addCarta(new Viento());
		ent1.addCarta(new Tormenta());
		ent1.addCarta(new Niebla());
		ent2.addCarta(new Niebla());
		torneo.addEntrenador(ent1);
		torneo.addEntrenador(ent2);
		torneo.addEntrenador(ent3);
		torneo.addEntrenador(ent4);
		torneo.comenzarTorneo();
		torneo.reporteGeneral();
	}
}
