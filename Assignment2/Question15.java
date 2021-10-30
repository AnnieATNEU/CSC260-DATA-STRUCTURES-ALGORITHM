package Assignment2;

public class Question15 {
	static class Node
	{
	    int data;
	    Node next;
	 
	    Node(int data, Node next)
	    {
	        this.data = data;
	        this.next = next;
	    }
	}
//====================================================
	    public static void printList(String msg, Node head)
	    {
	        System.out.print(msg);
	 
	        Node ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data + " —> ");
	            ptr = ptr.next;
	        }
	 
	        System.out.println("null");
	    }
	 
	    public static Node[] alternatingSplit(Node source)
	    {
	        // Split the nodes into `a` and `b` lists
	        Node a = null;
	        Node b = null;
	        Node current = source;
	 
	        while (current != null)
	        {
	           	 
	            Node newNode = current;         
	            current = current.next;        
	 
	            newNode.next = a;             
	            a = newNode;                    
	 
	            if (current != null)
	            {
	 
	                newNode = current;          
	                current = current.next;    
	 
	                newNode.next = b;           
	                b = newNode;                
	            }
	        }
	 
	        return new Node[] { a, b };
	    }
//======================================================
	    public static void main(String[] args)
	    {
	       
	        int[] num = { 2, 3, 4, 5, 6, 7,8 };
	 
	        // to construct the first linked list
	        Node head = null;
	        for (int i = num.length - 1; i >= 0; i--) {
	            head = new Node(num[i], head);
	        }
	 
	        Node[] nodes = alternatingSplit(head);
	 
	        // this is to print both lists
	        printList("This is the first List: ", nodes[0]);
	        printList("This is the second List: ", nodes[1]);
	    }
	}