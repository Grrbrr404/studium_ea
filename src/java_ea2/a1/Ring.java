package java_ea2.a1;

public class Ring<T> {
	
	Entry<T> firstEntry;
	int ringSize;
	
	public Ring(int size) {
		
		ringSize = size;
		
		Entry<T> previousEntry = null;
		Entry<T> currentEntry = null;
		
		for (int i = 0; i < size; i++) {
			currentEntry = new Entry<T>(null, null, null);
			if (i == 0) {
				firstEntry = currentEntry;
			}
			else if (i == 1) {
				currentEntry.previous = firstEntry;
				firstEntry.next = currentEntry;
			}
			else if (i == (size-1)) { 
				currentEntry.previous = previousEntry;
				previousEntry.next = currentEntry;
				
				currentEntry.next = firstEntry;
				firstEntry.previous = currentEntry;
			}
			else {
				currentEntry.previous = previousEntry;
				previousEntry.next = currentEntry;
			}
			
			previousEntry = currentEntry;
		}
	}
	
	public void print() {
		Entry<T> currentEntry = firstEntry.previous;
		while (currentEntry != firstEntry) {
			System.out.println(String.valueOf(currentEntry.element));
			currentEntry = currentEntry.previous;
		}
		System.out.println(String.valueOf(firstEntry.element));
	}
	
}
