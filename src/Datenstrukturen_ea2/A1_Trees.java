package Datenstrukturen_ea2;

import trees.*;
public class A1_Trees {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = CreateTree();
		Tree tree = new Tree(root);
		
		System.out.println("Aufgabe a)");
		tree.printAllKeys();
		System.out.println("");
		System.out.println("Aufgabe b)");
		System.out.println(Integer.toString(tree.getTreeGrade()));
		
	}
	
	/*
	 *                   17
	 *                 14  13 
	 *              1     7
	 *            2   3 
	 * 
	 */
	public static Node CreateTree() {
		Node root = new Node(new ElemInteger(17));
		Node n_14 = new Node(new ElemInteger(14));
		Node n_13 = new Node(new ElemInteger(13));
		Node n_1 = new Node(new ElemInteger(1));
		Node n_7 = new Node(new ElemInteger(7));
		Node n_2 = new Node(new ElemInteger(2));
		Node n_3 = new Node(new ElemInteger(3));
		
		root.leftmostChild = n_14;
		
		n_14.leftmostChild = n_1;
		n_14.rightSibling = n_13;
		
		n_13.leftmostChild = n_7;
		
		
		n_1.leftmostChild = n_2;
		
		n_2.rightSibling = n_3;
		
		return root;
	}
	

}
