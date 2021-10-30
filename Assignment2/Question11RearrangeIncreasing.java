package Assignment2;

public class Question11RearrangeIncreasing {
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
//===============================================
	    public static void printList(Node head)
	    {
	        Node ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data + " —> ");
	            ptr = ptr.next;
	        }
	 
	        System.out.println("null");
	    }
	 
	    // list sorted in increasing order
	    public static Node SortedIncreasing(Node head, Node newNode)
	    {
	        Node dummy = new Node();
	        Node current = dummy;
	        dummy.next = head;
	 
	        while (current.next != null && current.next.data < newNode.data) {
	            current = current.next;
	        }
	 
	        newNode.next = current.next;
	        current.next = newNode;
	        return dummy.next;
	    }
//=========================================================== 
	    // Given a list, changing it to be in sorted order (using `SortedIncreasing()`)
	    public static Node insertSort(Node head)
	    {
	        Node result = null;     
	        Node current = head;    
	        Node next;
	 
	        while (current != null)
	        {
	           
	            next = current.next;

	            result = SortedIncreasing(result, current);
	            current = next;
	        }	 
	        return result;
	    } 
	    public static void main(String[] args)
	    {
	   
	        int[] num = {8, 5, 11, 3, 7, 6};
	 
	        Node head = null;
	        // construct a linked list
	        for (int i = num.length - 1; i >= 0; i--) {
	            head = new Node(num[i], head);
	        }	 
	        head = insertSort(head);	 
	        // print linked list
	        printList(head);
	    }
	}


