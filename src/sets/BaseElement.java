package sets;


/**
 * Diese Basisklasse stellt durch den Konstruktor sicher, das jedes Element
 * seinen eigenen eindeutigen Schlüssel aus dem KeyPoolSingleton erhält
 * 
 * Elemente die in das Set eingefügt werden sollen, sollten von dieser Klasse 
 * abgeleitet werden.
 */

public abstract class BaseElement implements SetElement {
	private int key;
	
	public BaseElement() {
		key = KeyPoolSingleton.getInstance().getNextKeyFor(this);
	}
	
	public int getKey() {
		return key;
	}
}
