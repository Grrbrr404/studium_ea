package trees;

public class ArrayNode {
	public Elem key;
	public ArrayNode[] sons;
	
	public ArrayNode(Elem value, int sonCount) {
		sons = new ArrayNode[sonCount];
		key = value;
	}
	
	public void setKey(Elem newValue) {
		this.key = newValue;
	}
}
