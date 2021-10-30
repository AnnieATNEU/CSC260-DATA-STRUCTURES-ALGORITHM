package Assignment2;

public class Question12Splitnode {
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
//==========================================================
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
//====================================================	 
// Return the total number of nodes in a list
	    public static int findLength(Node head)
	    {
	        int count = 0;
	        Node ptr = head;
	        while (ptr != null)
	        {
	            count++;
	            ptr = ptr.next;
	        }
	        return count;
	    }
	 
 //to  Split given list's nodes into front and back halves,  and return the two lists using an array.      
	    public static Node[] frontBackSplit(Node source)
	    {
	        Node frontRef, backRef;
	 
	        int len = findLength(source);
	        if (len < 2)
	        {
	            frontRef = source;
	            backRef = null;
	            return new Node[] { frontRef, backRef };
	        }
	 
	        Node current = source;
	 
	        int hopCount = (len - 1) / 2;    
	        for (int i = 0; i < hopCount; i++) {
	            current = current.next;
	        }
	 
	        // Now cut at current
	        frontRef = source;
	        backRef = current.next;
	        current.next = null;
	 
	        return new Node[] { frontRef, backRef };
	    }
//======================================================	 
	    public static void main(String[] args)
	    {
	       
	        int[] num = {34, 11, 3, 9, 5, 1};
	 
	        // points to the head node of the linked list
	        Node head = null;
	 
	        //to construct a linkedlist
	        for (int i = num.length - 1; i >= 0; i--) {
	            head = new Node(num[i], head);
	        }
	 
	        Node[] nodes = frontBackSplit(head);
	 
	        // print linked list
	        System.out.println("Splitting the linkedlist node into halves : ");
	        printList("This part is the Front nodes: ", nodes[0]);
	        printList("This part is the Back nodes: ", nodes[1]);
	    }
	}


