package Assignment2;

public class Question18Movelastnodetofront {
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
		  
	// =================================================
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
		  
		//method to move the last node to the front of a given linked list
		     public static Node rearrange(Node head)
		     {
		         // to proceed only when the list is valid
		         if (head == null || head.next == null) {
		             return head;
		         }
		  
		         Node ptr = head;
		  
		         // move to the second last node
		         while (ptr.next.next != null) {
		             ptr = ptr.next;
		         }
		  
		         // transform the list into a circular list
		         ptr.next.next = head;
		  
		         // Fix the head
		         head = ptr.next;
		  
		         // break the chain
		         ptr.next= null;
		  
		         return head;
		     }
		//====================================================
		     public static void main(String[] args)
		     {
		       
		         int[] num = { 1, 2, 3, 4 };
		  
		         Node head = null;
		         for (int i = num.length - 1; i >= 0; i--) {
		             head = new Node(num[i], head);
		         }
		  
		         head = rearrange(head);
		  
		         printList(head);
		     }
		 }
