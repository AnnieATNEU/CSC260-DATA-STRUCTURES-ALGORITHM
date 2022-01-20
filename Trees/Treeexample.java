package Trees;


public class Treeexample {  
	  static Node root = null;

		static class Node {
			  int item;
			Node left;
			Node right;

			public Node(int item) {
				this.item = item;
				this.left = right = null;
			}
		}

//=======================================
	  void preorder(Node node) {
	    if (node == null)
	      return;

	    // traverse the root node
	    System.out.print(node.item + "->");
	    // traverse the left child
	    preorder(node.left);
	    // traverse the right child
	    preorder(node.right);
	  }

	  public static void main(String[] args) {
	    // create object of tree
		  Treeexample tree = new Treeexample();
	    
	    // create nodes of the tree
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

	    // preorder tree traversal
	    System.out.println("\nPreorder traversal ");
	    tree.preorder(tree.root);
	  }
	}