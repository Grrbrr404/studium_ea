package Datenstrukturen_ea2;
import sets.*;

public class A2_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set set = new Set(10);
		set.insert("5");
		set.print();
		
		// Test: Item einfügen was bereits vorhanden ist
		set.insert("5");
		set.print();
		
		// Test: Nur ein Element int Set, es muss 5 kommen
		SetElement d = set.remove();
		System.out.println(d.getValue());
		
		// Test: Die liste muss nun leer sein
		set.print();
		
		// Test: Liste füllen
		set.insert("1");
		set.insert("2");
		set.insert("3");
		set.insert("4");
		set.insert("5");
		set.insert("6");
		set.insert("7");
		set.insert("8");
		set.insert("9");
		set.insert("10");
		set.print();
		
		// Test: Set limit erreicht, weiteres element einfügen erzeugt Fehler
		set.insert("11");
		
		// Test: Remove mehrmals hinternander
		d = set.remove();
		System.out.println("Removed: " + d.getValue());
		set.print();
		d = set.remove();
		System.out.println("Removed: " + d.getValue());
		set.print();
		d = set.remove();
		System.out.println("Removed: " + d.getValue());
		set.print();
		d = set.remove();
		System.out.println("Removed: " + d.getValue());
		set.print();
		
		set.insert("11");
		set.print();
	}

}
