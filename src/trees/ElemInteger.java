package trees;

public class ElemInteger implements Elem {
	public int value = 0;
	
	public ElemInteger() {
		this.value = 0;
	}
	
	public ElemInteger(int newValue) {
		this.value = newValue;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.value);
	}
}
