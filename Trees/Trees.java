package Trees;

public class Trees {
	static Node root; 
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int userdata)
		{
			this.data = userdata;
			left = right = null;
		}
//==================================================================
		public void case1_delete(int data) {
			Node parent= null;
			Node curr = root;
			while (curr!=null && curr.data !=data)
			{
				parent = curr;
				if(data < curr.data)
				{
					curr = curr.left;
				}
				else {
					curr = curr.right;
				}
			}
		//return if the key is not found in the tree
			if (curr== null)
			{
				System.out.println("The data is not found");
			}
			
			//case1 node to be deleted has no children 
			if (curr.left ==null && curr.right ==null)
			{
				if (curr != root)
				{
					if (parent.left==curr)
					{
						parent.left =null;
					}
					else {
						parent.right= null;
					}
				}
				else
				{
					root = null;
				}
			}
			
		}
	
	}
	
//============================================	
	public static Node getMinimum(Node curr)
	{
		while(curr.left !=null)
		{
			curr = curr.left;
		
		
	}
//============================================
		public  Insert(int i)
		{
			Node newNode = new Node(1);
			if(root == null) 
			{
				root = newNode;
			}
			else
			{
				Node current = root;
				Node parent;
				while(true)
				{
					parent = current;
					if(i < current.data)
					{
						current = current.left;
						if(current ==null)
						{
							parent.left = newNode;
							return;
						}
					}
					else
					{
						current = current.right;
						if(current== null)
						{
							parent.right = newNode;
							return;
						}
					}
				}
			}
		}
//==================================================================
		public void InOrder(Node node) {
			if (node != null)
			{
				InOrder(node.left);
				System.out.println("("+node.data + ")");
				
				InOrder(node.right);
			}
		}
		
		
//==================================================================
		public void PreOrder(Node node) {
			if (node != null)
			{
				InOrder(node.left);
				System.out.println("("+node.data + ")");	
				InOrder(node.left);
				InOrder(node.right);
			}
		}
//==================================================================	
     public void PostOrder(Node node) {
			if (node != null)
			{
				InOrder(node.left);
				System.out.println("("+node.data + ")");
				
				InOrder(node.right);
			}
		}
		
		
//==================================================================
     public void SearchNode(Node node) {
 		Node curr= root;
 		while(curr.data!=value) {
 			if(value < curr.data)
 				curr=curr.left;
 		}
 		else {
 			curr=curr.right;
 		}
 		}
 		
		
//==================================================================
	public void traverseTree(Node node)
	{
		if(node != null)
		{
			traverseTree(node.left);
			System.out.println("$s ", node.data);
			traverseTree(node.right);
		}
	}		
		
//==================================================================
	public static void main(String[] args) {
		Trees mytrees = new Trees();
		mytrees.Insert();
		mytrees.Insert(10);
		
		
		System.out.print("\nBinary Tree inOrder: " );
		mytrees.InOrder(tree.root);

	}

}

	public void Insert() {
		// TODO Auto-generated method stub
		
	}
}