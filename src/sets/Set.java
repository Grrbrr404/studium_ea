package sets;

import java.util.Random;

public class Set {
	
	private SetElement[] memory;
	private int itemIndex = 0;
	private int sizeOfMemory;
	
	public Set(int size) {
		this.memory = new SetElement[size];
		this.sizeOfMemory = size;
	}
	
	public boolean contains(SetElement element) {
		for (int i = 0; i < sizeOfMemory; i++) {
			if (memory[i].getValue() == element.getValue()) {
				return true;
			}
		}
		
		return false;
	}
	
	public void insert(SetElement element) {
		if (!this.contains(element)) {
			memory[itemIndex++] = element; 
		}
		else {
			System.out.println("Error: Element with value " 
		                      + element.getValue() 
		                      + " does already exists.");
		}
	}
	
	public SetElement remove() {
		Random rnd = new Random();
		int removeIndex = rnd.nextInt(itemIndex);	
		return memory[removeIndex];
	}
}
