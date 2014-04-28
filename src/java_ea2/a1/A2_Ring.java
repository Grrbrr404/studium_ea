package java_ea2.a1;

public class A2_Ring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ring<Integer> r = new Ring<Integer>(8);
		r.firstEntry.element = 3;
		r.firstEntry.previous.element = 4;
		r.print();
	}
}
