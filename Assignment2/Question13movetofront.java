package Assignment2;

public class Question13movetofront {
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
//==============================================================
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
//=================================================	 
	    public static void main(String[] args)
	    {
	        int[] num = { 4, 5, 6 };
	 
	        // to construct the first linked list
	        Node a = null;
	        for (int i = num.length - 1; i >= 0; i--) {
	            a = new Node(num[i], a);
	        }
	        
	        int[] num2 = { 3, 7, 8 };
	 
	        //to construct the second linked list
	        Node b = null;
	        for (int i = 0; i < num2.length; i++) {
	            b = new Node(2 * num2[i], b);
	        }
	 
	        if (b != null)
	        {
	            // taking the node from the front of list `b`, and move it to the front of the list `a`
	            Node newNode = b;  
	            b = b.next;         
	 
	            newNode.next = a;   
	            a = newNode;       
	        }
	 
	        // print both lists
	        printList("In the first List, the first node is the first one from the right: ", a);
	        printList("Here that node is inserted at the Second List located in first node : ", b);
	    }
}