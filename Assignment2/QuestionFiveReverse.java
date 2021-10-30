package Assignment2;
import java.util.*;

public class QuestionFiveReverse {

		// Create a class Node to enter
		static class Node
		{
			int data;
			Node next;
		};
		static Node head = null;
		// Function to reverse the
		// linked list
		static void reverseLL()
		{		
			//creating stack of node type
			Stack<Node> stack = new Stack<>();
			Node temp = head;
			while (temp.next != null)
			{
				
				// Push all the nodes
				// in to stack
				stack.add(temp);
				temp = temp.next;
			}
			head = temp;

			while (!stack.isEmpty())
			{
				
			//storing the top value of the list
				temp.next = stack.peek();
			
				// Pop the value from stack
				stack.pop();
			
				// update the next pointer in the
				// in the list
				temp = temp.next;
			}
			temp.next = null;
		}

//==========================================================
		//to print the element in the linkedlist
		public static void printlist(Node temp)
		{
			while (temp != null)
			{
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}
		}

		// Program to insert back of the
		// linked list
		public static void insertAgain( int value)
		{
			Node temp = new Node();
			temp.data = value;
			temp.next = null;
			
			// If *head equals to null
			if (head == null)
			{
			head = temp;
			return;
			}
			else
			{
			Node last_node = head;
			while (last_node.next != null)
			{
				last_node = last_node.next;
			}
			last_node.next = temp;
			return;
			}
		}
//===========================================
		public static void main(String[] args)
		{
			insertAgain( 1);
			insertAgain( 2);
			insertAgain(3);
			insertAgain( 4);
			System.out.print("The given linked list are \n");
			printlist(head);
			reverseLL();
			System.out.print("\nThe Reversed linked list are\n");
			printlist(head);
		}
		}

	