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
	
	public void print() {
		System.out.print("{");
		for (int i = 0; i < sizeOfMemory; i++) {
		    String item = "null";
		    if (memory[i] != null) {
		    	item = memory[i].getValue();
		    }
			System.out.print(" [" + item + "] ");
		}
		System.out.println("}");
	}
	
	public boolean contains(SetElement element) {
		for (int i = 0; i < sizeOfMemory; i++) {
			if (memory[i] != null)  {
				if (memory[i].getValue() == element.getValue()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void insert(String newItemValue) {
		SetElement element = new SetElement(newItemValue);
		if (!contains(element)) {
			if (itemIndex < sizeOfMemory) {
				memory[itemIndex++] = element; 
			}
			else {
				System.out.println("Not enough space in set");
			}
		}
		else {
			System.out.println("Error: Element with value " 
		                      + element.getValue() 
		                      + " does already exists.");
		}
	}
	
	public SetElement remove() {
		SetElement result = null;
		if (itemIndex > 0) {
			// Get a random index to remove
			Random rnd = new Random();
			int removeIndex = rnd.nextInt(itemIndex);	
			result = memory[removeIndex]; 
					
			// Set element at removeIndex to null to let garbage collector clear memory
			memory[removeIndex] = null;
			
			// Rearrange memory, put top most element to removeIndex
			if (removeIndex < (itemIndex-1)) {
				memory[removeIndex] = memory[(itemIndex-1)];
				memory[(itemIndex-1)] = null;
			}
			
			itemIndex--;
		}
		
		return result;
	}
}
