package java_ea1;

public class A2_Fallunterscheidung {

	static final String STRECKE = "Strecke";
	static final String DREIECK = "Dreieck";
	static final String RECHTW_DREIECK = "RechtwinkligesDreieck";
	static final String KREIS = "Kreis";
	static final String ELLIPSE = "Ellipse";
	static final String VIERECK = "Viereck";
	static final String RECHTECK = "Rechteck";
	static final String FUENFECK = "Fuenfeck";
	static final String QUADRAT = "Quadrat";
	static final String SECHSECK = "Sechseck";

	public static void main(String[] args) {
		String geo = args[0];

		if (geo.equals(STRECKE)) {
			StreckeInfo();
		} else if (geo.equals(DREIECK)) {
			DreieckInfo();
		} else if (geo.equals(RECHTW_DREIECK)) {
			RechtwDreieckInfo();
		} else if (geo.equals(KREIS)) {
			KreisInfo();
		} else if (geo.equals(ELLIPSE)) {
			EllipseInfo();
		} else if (geo.equals(VIERECK)) {
			ViereckInfo();
		} else if (geo.equals(RECHTECK)) {
			RechteckInfo();
		} else if (geo.equals(FUENFECK)) {
			FuenfeckInfo();
		} else if (geo.equals(QUADRAT)) {
			QuadratInfo();
		} else if (geo.equals(SECHSECK)) {
			SechseckInfo();
		} else {
			System.out.println("Ich weiß nichts über Ihre eingabe.");
		}
	}

	public static void StreckeInfo() {
		System.out.println("Eine gerade Linie");
		System.out.println("Kann durch zwei Punkte begrenzt sein");
		System.out.println("Unendliche Strecken heissen Strahlen");
		System.out.println("Strecken mit nur einer Begrenzung heissen Halbstrahl");
	}

	public static void DreieckInfo() {
		System.out.println("Hat drei Ecken");
		System.out.println("Auch Triangel genannt");
		System.out.println("Begrenzungslinien auch Seiten genannt");
		System.out.println("Pythagoras ... :-)");
	}

	public static void RechtwDreieckInfo() {
		System.out.println("Hat drei Ecken");
		System.out.println("Auch Triangel genannt");
		System.out.println("Begrenzungslinien auch Seiten genannt");
		System.out.println("Hat mindestens einen 90 Grad Winkel");
	}

	public static void KreisInfo() {
		System.out.println("Rund");
		System.out.println("Hat einen Mittelpunkt");
		System.out.println("Flächeninhalt kann näherungsweise mit der Kreiszahl Pi bestimmt werden");
		System.out.println("Es gibt einen Radius");
	}

	public static void EllipseInfo() {
		System.out.println("Geschlossene ovale Kurve");
		System.out.println("Keine Ecken");
		System.out.println("Besteht aus zwei Hauptachsen");
		System.out.println("Hat einen Mittelpunkt");
	}

	public static void RechteckInfo() {
		System.out.println("Auch Orthogon genannt");
		System.out.println("Innenwinkel sind alle rechte Winkel");
		System.out.println("Gegenüberliegende Seiten sind gleich lang und parallel");
		System.out.println("Die Winkelsumme beträgt 90°");
	}

	public static void ViereckInfo() {
		System.out.println("Oberbegriff fuer viereckige Formen");
		System.out.println("Hat zwei Diagonalen");
		System.out.println("Liegen beide Diagonelen innerhalb des Vierecks, so ist es konvex");
		System.out.println("Liegen beide Diagonelen außerhalb des Vierecks, so ist es nicht konvex");
	}

	public static void FuenfeckInfo() {
		System.out.println("Hat fünf Ecken");
		System.out.println("Ein ebenes Fünfeck besitzt einen eindeutig bestimmbaren Flächeninhalt");
		System.out.println("Die Summe der Innenwinkel eines regelmäßigen Fünfecks beträgt 540°");
		System.out.println("Regelmäßiges Fünfeck und Pentagramm bilden eine Grundfigur, in der das Verhältnis des Goldenen Schnittes wiederholt auftritt.");
	}

	public static void QuadratInfo() {
		System.out.println("Vier Ecken");
		System.out.println("Vier Symmetrieachsen");
		System.out.println("Ist punktsymmetrisch");
		System.out.println("Ist geschlosse");
	}

	public static void SechseckInfo() {
		System.out.println("Sechs ecken");
		System.out.println("Ist geschlossen");
		System.out.println("Auch Hexagon genannt");
		System.out.println("Sind alle sechs Seiten gleich lang, spricht man von einem gleichseitigen Sechseck");
	}

}
