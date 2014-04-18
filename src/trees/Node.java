package trees;

public class Node {
	private Elem key;
	public Node leftmostChild = null, rightSibling = null;	
	
	public Node(Elem key, Node leftmostChild, Node rightSibling) {
		this.key = key;
		this.leftmostChild = leftmostChild;
		this.rightSibling = rightSibling;
	}
	
	public Node(Elem key) {
		this.key = key;
	}
	
	public String getGeyAsString() {
		return this.key.toString();
	}

	public Elem getKey() {
		return this.key;
	}
	
}
