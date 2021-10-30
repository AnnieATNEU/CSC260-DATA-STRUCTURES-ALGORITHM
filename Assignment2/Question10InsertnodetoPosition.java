package Assignment2;

public class Question10InsertnodetoPosition {
	static class Node
	{
	    int data;
	    Node next;
	 
	    Node(int data, Node next)
	    {
	        this.data = data;
	        this.next = next;
	    }
	 
	    Node(int data) {
	        this.data = data;
	    }
	}
//=====================================================
	    public static void printList(Node head)
	    {
	        Node ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data + " —> ");
	            ptr = ptr.next;
	        } 
	        System.out.println("null");	    }
//======================================================	 
    public static Node sortedInsert(Node head, Node newNode)
	    {
	        // special case for the head end
	        if (head == null || head.data >= newNode.data)
	        {
	            newNode.next = head;
	            head = newNode;
	            return head;
	        }
	 
	        // locate the node before the point of insertion
	        Node current = head;
	        while (current.next != null && current.next.data < newNode.data) {
	            current = current.next;
	        }
	 
	        newNode.next = current.next;
	        current.next = newNode;
	 
	        return head;
	    }
//============================================= 
	    public static void main(String[] args)
	    {
	     
	        int[] num = {1, 2, 3, 4};
	 
	        // points to the head node of the linked list
	        Node head = null;
	 
	        // constructing a linked list
	        for (int i = num.length - 1; i >= 0; i--) {
	            head = new Node(num[i], head);
	        }
	 
	        head = sortedInsert(head, new Node(2));
	        head = sortedInsert(head, new Node(1));
	        head = sortedInsert(head, new Node(4));
	 
	        // print linked list
	        printList(head);
	    }
	}