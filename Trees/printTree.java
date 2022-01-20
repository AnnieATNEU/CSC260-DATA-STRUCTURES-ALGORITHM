package Trees;
public class printTree {

	/**
	 * Method to perform pre order traversal of a binary tree
	 * @param root
	 */
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	/**
	 * Method to perform in order traversal of a binary tree
	 * @param root
	 */
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	/**
	 * Method to perform post order traversal of a binary tree
	 * @param root
	 */
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(21);
		root.left.left = new Node(1);
		root.left.right = new Node(8);
		root.right.left = new Node(13);
		root.right.right = new Node(25);
		root.right.left.left = new Node (12);
		root.right.left.right = new Node(18);
		
		printTree treeOrder = new printTree();
		
		//Pre-order traversal
		treeOrder.preOrder(root);
		System.out.println();
		
		//In order traversal
		treeOrder.inOrder(root);
		System.out.println();
		
		//Post-order traversal
		treeOrder.postOrder(root);
		System.out.println();
	}
}

private class Node {
	int data;
	Node left;
	Node right;
	
	private Node(int value) {
		data = value;
		left = right = null;
	}
}