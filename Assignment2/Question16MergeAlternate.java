package Assignment2;

public class Question16MergeAlternate {
	static class Node
	{
	    int data;
	    Node next;
	 
	    Node(int data, Node next)
	    {
	        this.data = data;
	        this.next = next;
	    }
	 
	    Node() {}
	}
//====================================================================
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
	 
	    // method to construct a linked list by merging alternate nodes of two given linked lists using a dummy node
	    public static Node shuffleMerge(Node a, Node b)
	    {
	        Node dummy = new Node();
	        Node tail = dummy;
	 
	        while (true)
	        {
	            // if it's empty
	            if (a == null)
	            {
	                tail.next = b;
	                break;
	            }
	 
	            else if (b == null)
	            {
	                tail.next = a;
	                break;
	            }
	 
	 //  moving two nodes to the tail
	            else {
	                tail.next = a;
	                tail = a;
	                a = a.next;
	 
	                tail.next = b;
	                tail = b;
	                b = b.next;
	            }
	        }
	 
	        return dummy.next;
	    }
//==========================================================	 
	    public static void main(String[] args)
	    {
	       
	        int[] num = { 2, 3, 4, 5, 6, 7,8 };
	 
	        Node a = null, b = null;
	        for (int i = num.length - 1; i >= 0; i = i - 2) {
	            a = new Node(num[i], a);
	        }
	 
	        for (int i = num.length - 2; i >= 0; i = i - 2) {
	            b = new Node(num[i], b);
	        }
	 
	        // print both lists
	        printList("The first List is: ", a);
	        printList("The Second List is: ", b);
	 
	        Node head = shuffleMerge(a, b);
	        printList("And this is After Merge: ", head);
	    }
	}