package Assignment2;
import java.util.HashSet;
import java.util.Set;
	
public class QuestionSixDuplicate {

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
//================================================
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
	 
// This the Function to remove duplicates from a sorted list
	    public static Node removeDuplicates(Node head)
	    {
	        Node previous = null;
	        Node current = head;
	 
	        //to  take an empty set to store linked list nodes for future reference
	        Set<Integer> set = new HashSet<>();
	 
	        while (current != null)
	        {
	            // if the current node is seen before, ignore it
	            if (set.contains(current.data)) {
	                previous.next = current.next;
	            }
	            else {
	                // insert the current node into the set and proceed to the next node
	                set.add(current.data);
	                previous = current;
	            }
	            current = previous.next;
	        }
	 
	        return head;
	    }
	 
	    public static void main(String[] args)
	    {
	        // input keys
	        int[] keys = {13, 23, 40, 13, 15, 35, 4, 40};
	        
	        // points to the head node of the linked list
	        Node head = null;
	 
	        // to construct a linked list
	        for (int i = keys.length - 1; i >= 0; i--) {
	            head = new Node(keys[i], head);
	        }
	 
	        removeDuplicates(head);
	        printList(head);
	    }
	}