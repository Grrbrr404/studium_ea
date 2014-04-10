package ea1;

public class A1_Kontrollstruktur {

	public static void main(String[] args) {
		// Initialisierung
		int startzahl = 0;
		int ergebnis = 0;

		try {
			// Einlesen args[0] in startzahl falls möglich
			startzahl = Integer.parseInt(args[0]);
			ergebnis = startzahl;
			if (ergebnis > 0) {
				// Wenn die Eingabe größer Null ist, addiere zwei
				ergebnis = ergebnis + 2;
			} else {
				/*
				 * Wenn die Eingabe kleiner Null ist, mache Eingabe positiv und
				 * addiere zwei
				 */
				ergebnis = ergebnis * (-1) + 2;
			}

			while (ergebnis > 2) {
				// Dekrementier Ergebnis solange um zwei, bis es kleiner 2 ist
				ergebnis = ergebnis - 2;
			}

			int arbeiten = 4;

			/*
			 * - Schleife wird 10 mal durchlaufen, extrem schlecht geschrieben -
			 * Es wird 10*startwert+4 gerechnet - Schleife überflüssig da
			 * variable arbeiten im weiteren Verlauf nicht mehr verwendet wird
			 */
			for (int i = 2; i <= 20; i = i + 2) {
				arbeiten = arbeiten + startzahl;
			}
		} catch (Exception e) {
			System.out.print("Bitte nur gueltige ganze Zahlen eingeben, ");
			ergebnis = 3; // Dies führt zu Ausgabe "Fehler!"
		}

		switch (ergebnis) {
		case 0:
			// Ausgabe für ergebnis = 0
			System.out.println("Das kann nicht sein!");
			break;
		case 1:
			// Ausgabe für ergebnis = 1
			System.out.println("Die urspruengliche Zahl war ungerade!");
			break;
		case 2:
			// Ausgabe für ergebnis = 2
			System.out.println("Die urspruengliche Zahl war gerade!");
			break;
		default:
			// Ausgabe für ergebnis < 0 oder > 2
			System.out.println("Fehler!");
		}
		System.out.println("startzahl = " + startzahl);
	}

	public static void mainx(String[] args) {
		doit(2);
	}

	public static void doit(int zahl) {
		// Initialisierung, einlesen args[0] in startzahl

		// int startzahl = Integer.parseInt(args[0]);
		int startzahl = zahl;
		int ergebnis = startzahl;

		if (ergebnis > 0) {
			// Wenn die Eingabe größer Null ist, addiere zwei
			ergebnis = ergebnis + 2;
		} else {
			/*
			 * Wenn die Eingabe kleiner Null ist, mache Eingabe positiv und
			 * addiere zwei
			 */
			ergebnis = ergebnis * (-1) + 2;
		}

		while (ergebnis > 2) {
			// Dekrementier Ergebnis solange um zwei, bis es kleiner 2 ist
			ergebnis = ergebnis - 2;
		}

		int arbeiten = 4;

		/*
		 * - Schleife wird 10 mal durchlaufen, extrem schlecht geschrieben - Es
		 * wird 10*startwert+4 gerechnet - Schleife überflüssig da variable
		 * arbeiten im weiteren Verlauf nicht mehr verwendet wird
		 */
		for (int i = 2; i <= 20; i = i + 2) {
			arbeiten = arbeiten + startzahl;
		}
		System.out.println(ergebnis);
		switch (ergebnis) {
		case 0:
			// Ausgabe für ergebnis = 0
			System.out.println("Das kann nicht sein!");
			break;
		case 1:
			// Ausgabe für ergebnis = 1
			System.out.println("Die urspruengliche Zahl war ungerade!");
			break;
		case 2:
			// Ausgabe für ergebnis = 2
			System.out.println("Die urspruengliche Zahl war gerade!");
			break;
		default:
			// Ausgabe für ergebnis < 0 oder > 2
			System.out.println("Fehler!");
		}
		System.out.println("startzahl = " + startzahl);
	}
}
