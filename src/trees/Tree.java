package trees;

public class Tree {
	Node root;
	
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
			
			if (startNode.rightSibling != null) {
				printKeys(startNode.rightSibling);
			}
			
			if (startNode.leftmostChild != null) {
				printKeys(startNode.leftmostChild);
			}
		}
	}
	
	public int getTreeGrade() {
		return this.getGradeOfNode(this.root.leftmostChild);
	}
	
	public int getGradeOfNode(Node startNode) {
		int grade = 0;
		if (startNode != null) {
			grade++;
			if (startNode.rightSibling != null) {
				grade = grade + getGradeOfNode(startNode.rightSibling);
			}
			
			if (startNode.leftmostChild != null) {
				grade = grade + getGradeOfNode(startNode.leftmostChild);
			}
		}
		
		return grade;
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
