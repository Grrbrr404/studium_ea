package sets;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Diese Klasse dient dazu eindeutige Schlüssel zur Programmlaufzeit zu vergeben.
 * Diese eindeutigen Schlüssel werden benötigt um die Laufzeit von O(1) bei den
 * Methoden insert, contains und remove zu ermöglichen
 */
class KeyPoolSingleton {
	public static KeyPoolSingleton instance = null;
	private int nextKey = 0;
	
	
	/**
	 * Merkt sich für jede Klasse einen eindeutigen Schlüssel
	 */
	private Dictionary<Object, Integer> keyMemory;
	
	public KeyPoolSingleton() {
		keyMemory = new Hashtable<Object, Integer>();
	}
	
	
	/**
	 * Gibt die einzige Instanz des KeyPoolSingleton zurück
	 * @return Singleton instance
	 */
	public static KeyPoolSingleton getInstance() {
		if (instance == null) {
			instance = new KeyPoolSingleton();
		}
		return instance;
	}
	
	
	/**
	 * Gibt für ein Element einen eindeutigen Schlüssel zurück
	 * @param element
	 * @return key
	 */
	public int getNextKeyFor(SetElement element) {
		int key;
		if (keyMemory.get(element.getClass()) == null) {
			key = nextKey++;
			keyMemory.put(element.getClass(), key);
		}
		else {
			key = keyMemory.get(element.getClass());
		}
		
		return key;
	}
	
}
