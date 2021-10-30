package lab_09Delete;

public class Lab_09 {
	
	Node head; //Head of list
		class Node
		{
			int Data;
			Node next;
			Node(int data)
			{
				Data = data;
				next = null;
			}
		}
//=================to insert a new node at the front of the list
	public void push(int new_data)
			{
	
				Node new_node = new Node(new_data);

				//create new reference
				new_node.next = head;

				//then move the head to point to new Node
				head = new_node;
			}
//==================//to check whether the value x is present in linked list
	public boolean search(Node head, int x)
			{
				Node current = head;
				while (current != null)
				{
					if (current.Data == x)
						return true; //if data is found
					current = current.next;
				}
				return false; //if data is not found
			}

//====================main method
			public static void main(String args[])
			{	
				Lab_09 mylist = new Lab_09();

			//pushing value to linkedlist
				mylist.push(1);
				mylist.push(4);
				mylist.push(2);
				mylist.push(5);
				
				if (mylist.search(mylist.head, 6))
					System.out.println("True");
				else
					System.out.println("False");
			}
		}
	
       	


