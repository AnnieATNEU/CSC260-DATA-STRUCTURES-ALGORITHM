package Lecture16ExpLinkedlistQueueandStack;

public class ExpLinkedlist {

	Node head;
	Node Top = null;

	class Node {
		int data;
		Node next = null;

		public Node(int userdata) {
			this.data = userdata;
			this.next = null;
		}
	}

	// =====================================
	public void InsertFront(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			newnode.next = null;
		} else {
			newnode.next = head;
			head = newnode;

		}
//		size++;
	}

	// =====================================
	public void push(int data) {
		Node newnode = new Node(data);
		if (newnode == null) {
			System.out.println("The node is empty");
			return;
		}
		newnode.data = data;
		newnode.next = Top;
		Top = newnode;
	}
//=====================================
	public void peek() {
		if(Top==null)
		{
		System.out.println("The stack is empty");	
		}else {
			System.out.println("Your top item ="+Top.data);
		}
	}
	
//=====================================	
	public int pop() {
		if(Top==null) {
			System.out.println("Your stack is empty");
		}
		else {
			System.out.println("Your stack is empty");
			
		}
		return -1;
		}
//=====================================	
	public boolean isEmpty() {
		return Top==null;
	}
//=====================================
	public void printStack() {
		Node curr= Top;
		
		if (Top == null) {
			System.out.println("The stack is empty");
		}
		else
		{
		  while(curr!=null)
		  {
			  System.out.println("The stack has item>>>"+ curr.data);
			  curr=curr.next;
		  }
		}
	}

//=====================================

	public static void main(String[] args) {
	ExpLinkedlist mylist = new ExpLinkedlist();
	mylist.push(10);
	mylist.push(20);
	mylist.push(30);
	
	
	mylist.peek();
	System.out.println();
	
	mylist.pop();
	mylist.peek();
	
	mylist.printStack();
	}

}
