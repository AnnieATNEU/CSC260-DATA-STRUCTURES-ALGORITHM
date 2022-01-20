package Trees;

public class BinaryTreeLesson {
	static Node root = null;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int item) {
			this.data = item;
			this.left = right = null;
		}
	}

//=============================================
	public void Insert(int i) {
		Node newNode = new Node(1);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (i < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

//====================================================
	// to print its nodes in postorder
	public void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);

		System.out.print(node.data + " ");
	}

// =============================================
//to print its nodes in inorder
	public void InOrder(Node node) {
		if (node != null) {
			InOrder(node.left);
			System.out.print( node.data + " ");

			InOrder(node.right);
		}
	}

//=========================================================
	// to print its nodes in preorder
	public void PreOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {
		postOrder(root);
	}

	void printInorder() {
		InOrder(root);
	}

	void printPreorder() {
		PreOrder(root);
	}
// ===============================================================
public static void main(String[] args) {
		BinaryTreeLesson tree = new BinaryTreeLesson();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(70);
		tree.root.left.left = new Node(15);
		tree.root.left.right = new Node(7);
		tree.root.left.right.right = new Node(62);
		tree.root.left.right.right.right= new Node(22);
		tree.root.left.right.right.right.right = new Node(35);
		tree.root.left.right.right.right.right.right = new Node(87);
		tree.root.left.right.right.right.right.right.right = new Node(22);
		tree.root.left.right.right.right.right.right.right.right = new Node(31);
//		tree.root.left.right.right.right.right.right.right.right.right = new Node(31);
//		tree.root.left.right.right.right.right.right.right.right.right.right = new Node(5);

		System.out.println("\nBinary Tree inOrder: ");
		tree.printInorder();
		System.out.println(" ");
		
		System.out.println("\nBinary Tree PreOrder: ");
		tree.printPreorder();
		System.out.println(" ");

		System.out.println("\nBinary Tree PostOrder: ");
		tree.printPostorder();
	}
}
