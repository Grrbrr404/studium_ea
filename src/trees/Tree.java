package trees;

public class Tree {
	private Node root;
	private int gradeOfTree = 0;
	
	public Tree(Node rootNode) {
		this.root = rootNode;
	}
	
	/**
	 * Prints all keys starting from root node to console
	 */
	public void printAllKeys() {
		printKeys(this.root);
	}
	

	/**
	 * Prints all keys below startNode (startNode key included)
	 * @param startNode The node to start with
	 */
	public void printKeys(Node startNode) {
		if (startNode != null) {
			System.out.println(startNode.getKey());
			
			if (startNode.leftmostChild != null) {
				printKeys(startNode.leftmostChild);
			}
			
			if (startNode.rightSibling != null) {
				printKeys(startNode.rightSibling);
			}
			
			
		}
	}
	
	public int getTreeGrade() {
		this.gradeOfTree = 0;
		this.getGradeOfNode(this.root.leftmostChild);
		return this.gradeOfTree;
	}
	
	private void getGradeOfNode(Node startNode) {
		if (startNode != null) {
			// System.out.println(startNode.getKey());
			
			if (startNode.rightSibling != null) {
				getGradeOfNode(startNode.rightSibling);
			}
			
			if (startNode.leftmostChild != null) {
				getGradeOfNode(startNode.leftmostChild);
			}
			
			Node currentNode = startNode;
			int grade = 1;
			while (currentNode.rightSibling != null) {
				grade++;
				currentNode = currentNode.rightSibling;
			}
			
			if (grade > this.gradeOfTree) {
				gradeOfTree = grade;
			}
			
		}
	}
	
	public ArrayNode ConvertToArrayTree() {
		return ConvertToArrayNode(this.root);
	}

	public ArrayNode ConvertToArrayNode(Node node) {
		ArrayNode anode = null;
		int nodeIndex = 0;
		if (node != null) {
			anode = newnode_arr(this.getTreeGrade());
			anode.setKey(node.getKey());
		    
			Node currentNode = node.leftmostChild;
			while (currentNode != null) {
				anode.sons[nodeIndex++] = ConvertToArrayNode(currentNode);
				currentNode = currentNode.rightSibling;
			}
		}
		return anode;
	}

	private ArrayNode newnode_arr(int grade) {
		return new ArrayNode(new ElemInteger(0), grade);
	}
}
