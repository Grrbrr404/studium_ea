package Datenstrukturen_ea2;
import sets.*;

public class A2_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mercedes a = new Mercedes();
		Mercedes b = new Mercedes();
		Person p = new Person();
		Bmw bmw = new Bmw();
		int n = 5;
		Set set = new Set(n);
		set.insert(a);
		set.insert(a); // Error 1
		set.insert(b); // Error 2
		set.insert(p);
		set.insert(bmw); // Error Set full
		set.print();
		
		SetElement r = set.remove();
		System.out.println("Entfernt: " + r.getName());
		set.print();
	}

}
