package Assignment2;

public class Question14MoveEvenNode {

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
//==========================================================================
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
// method to rearrange the given list such that every even node will be
// to moved to the end of the list in reverse order.
	    public static void rearrange(Node head)
	    {
	        // empty list
	        if (head == null) {
	            return;
	        }
	
	        // maintain two lists, odd and even
	        Node odd = head;
	        Node even = null, prev = null;
	 
	        // do for each odd node
	        while (odd != null && odd.next != null)
	        {
	            // "move" next node (which will be even)
	            //in to the front of even list
	            if (odd.next != null)
	            {
	                Node newNode = odd.next;
	                odd.next = odd.next.next;
	 
	                newNode.next = even;
	                even = newNode;
	            }
	 
	            // then update `prev` and move to the next odd node
	            prev = odd;
	            odd = odd.next;
	        }
	 
	        //then append even list to odd list
	        if (odd != null) {
	            odd.next = even;
	        }
	        else {
	            prev.next = even;
	        }
	    }
//====================================================== 
	    public static void main(String[] args)
	    {
	       
	        int[] num = { 1, 2, 3, 4, 5, 6, 7 };
	 
	        // to construct the first linked list
	        Node head = null;
	        for (int i = num.length - 1; i >= 0; i--) {
	            head = new Node(num[i], head);
	        }
	 
	        printList("This is the list before: ", head);
	 
	        // rearrange the references to the given list
	        rearrange(head);
	 
	        printList("And this is the list after: ", head);
	    }
	}
