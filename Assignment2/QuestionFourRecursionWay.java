package Assignment2;

public class QuestionFourRecursionWay {
		static Node head; // head of list
		
		static class Node {
			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}
//==========================================
		//method to reverse,  recursion
public static Node reverse(Node head)
		{
			if (head == null || head.next == null)
				return head;

			///to reverse the rest list and put the first element at the end 
			//recursion is here
			Node rest = reverse(head.next);
			head.next.next = head;
			head.next = null;

			// fix the head pointer 
			return rest;
		}

		// method to print linkedlist 
//==============================================
		public static void print()
		{
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		static void push(int data)
		{
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}

//================================================================
	public static void main(String args[])
	{

		push(34);
		push(18);
		push(45);
		push(9);

		System.out.println("Given linked list");
		print();

		head = reverse(head);

		System.out.println("Reversed Linked list");
		print();
	}
	}
