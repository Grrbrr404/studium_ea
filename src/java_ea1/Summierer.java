package java_ea1;

public class Summierer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summierer summierer = new Summierer();
		int startWert = Integer.parseInt(args[0]);
		System.out.println("Ergebnis mit for-Schleife: " + summierer.forSumme(startWert));
		System.out.println("Ergebnis kleiner Gauss: " + summierer.kleinerGauss(startWert));
		System.out.println("Ergebnis rekursiv: " + summierer.rekursiveSumme(startWert));		
	}
	
	int forSumme(int startWert) {
		int ergebnis = 0;
		for (int i = 1; startWert >= i; i++ ) {
			ergebnis = ergebnis + i;
		}
		
		return ergebnis;
	}
	
	int rekursiveSumme(int startWert) {
		int ergebnis = startWert;
		if (startWert > 1) {
			ergebnis = ergebnis + rekursiveSumme(startWert-1);
		}
		
		return ergebnis;
	}
	
	int kleinerGauss(int startWert) {
		int ergebnis = (startWert * (startWert + 1)) / 2;
		return ergebnis;
	}
}
