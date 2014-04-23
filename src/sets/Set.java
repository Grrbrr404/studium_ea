package sets;

import java.util.Stack;

/**
 * Das eigentliche Set / Menge. Verwaltung von Objekten
 */
public class Set {
	
	/**
	 * Speicher für alle Objekte die das Interface SetElement implementieren
	 */
	private SetElement[] memory;
	
	/**
	 * Gibt die Anzahl der Elemente im Set an
	 */
	private int elementCount = 0;
	
	/**
	 * Die maximale Größe des Sets
	 */
	private int sizeOfSet;
	
	/**
	 * Vorhandene Elemente werden zusätzlich auf dem remove stack abgelegt
	 */
	private Stack<SetElement> removeStack;
	
	public Set(int size) {
		this.memory = new SetElement[size];
		this.sizeOfSet = size;
		this.removeStack = new Stack<SetElement>();
	}
	
	public void print() {
		System.out.print("{");
		for (int i = 0; i < sizeOfSet; i++) {
		    String item = "null";
		    if (memory[i] != null) {
		    	item = memory[i].getName();
		    }
			System.out.print(" [" + item + "] ");
		}
		System.out.println("}");
	}
	
	/**
	 * Es wird geprüft ob das angegebene Element bereits an der 
	 * vorgesehenen Stelle (durch element.getKey()) vorhanden ist. Laufzeit O(1)
	 * @param element
	 * @return true falls das Element bereits in memory vorhanden ist
	 */
	public boolean contains(SetElement element) {
		boolean result = false;
		if (element.getKey() < sizeOfSet) {
		  result = memory[element.getKey()] != null && memory[element.getKey()].getKey() == element.getKey();
		}
		return result;
	}
	
	/**
	 * Fügt ein neues Element in das Set ein, sofern es noch nicht vorhanden ist 
	 * Laufzeit O(1)
	 * @param element
	 */
	public void insert(SetElement element) {
		if (!contains(element)) {
			if (element.getKey() < sizeOfSet) {
				memory[element.getKey()] = element;
				removeStack.push(element);
				elementCount++;
			}
			else {
				System.out.println("Error: Set is full");
			}
		}
		else {
			System.out.println("Error: Element " + element.getName() + " does already exist.");
		}
	}
	
	/**
	 * Löscht mit hilfe des remove Stack das Element was zuletzt in das Set 
	 * eingefügt wurde.Ich habe die Aufgabe "ein beliebiges Element löschen" 
	 * so verstanden, das ich mir aussuchen darf welches ich löschen und 
	 * zurückgeben möchte. Laufzeit O(1)
	 * @return Element falls Set nicht leer. Sonst null
	 */
	public SetElement remove() {
		SetElement result = null;
		if (elementCount > 0) {
			result = removeStack.pop();
			memory[result.getKey()] = null;
			elementCount--;
		}
		return result;
	}
}
