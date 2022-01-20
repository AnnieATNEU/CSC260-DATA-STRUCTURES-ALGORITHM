package LinkedlistSinglyDoubly;

public class LinkedlistExa {

	static Node head;
	static Node tail;
	static int size=0;
	

	static class Node {
		int Data;
		Node next;
		Node prev;

		// constructor
		public Node(int userdata) { // assigned userdata to Data and make next null
			this.Data = userdata;
			this.next = null;
			this.prev = null;
		}
	}
	
//===========================================

	public void addtoBeginning(int data) {
		System.out.println("The node has been inserted in the front : " + data);
		// create a new node
		Node newnode = new Node(data);
		// check if the list is empty
		if (this.head == null) {
			// make the new node as head
			this.head = newnode;
		} else {
			// Point the new node's next to head
			newnode.next = this.head;
			this.head = newnode;
		}

	}

//=====================================================
	public void addtoEnd(int data) {
		System.out.println("The node has been inserted in the end : " + data);
		// Create a new node
		Node newnode = new Node(data);
		if (this.head == null) {
			this.head = newnode;
		} else // Init the cur and prev nodes to the head
		{
			Node curr = this.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newnode;
		}

	}

//=====================================================
	public void addtoPosition(int position, int data) {
		System.out.println("The node " + data + " has been inserted at the position " + position);
		// . create a new node
		Node newnode = new Node(data);
		Node curr = this.head;
		Node prev = this.head;
		if (position == 1) {
			newnode.next = this.head;
			this.head = newnode;
			return;
		}
		while (curr.next != null && --position > 0) {
			prev = curr;
			curr = curr.next;
		}

		prev.next = newnode; // connecting with node before
		newnode.next = curr; // connecting with node after
	}

//=====================================================
public void printfromBeginning() {
				
		Node curr = head;

			while (curr != null) {
				System.out.print(curr.Data + ">>>");
				curr = curr.next;
			}
		}
	
//=====================================================
public void printfromEnd() {
	
	Node curr = tail;

		while (curr != null) {
			System.out.print(curr.Data + ">>>");
			curr = curr.prev;
		}
	}

//=====================================================


	public void deleteFirstNode(int data) {
		System.out.println("\nDelete the first node " + data + " from the list");
		// check if null or not
		if (this.head == null) {
			System.out.println("The list is empty.\n");
			return;
		}
		// create new reference
		Node cur = this.head;
		Node prev = this.head;
//					System.out.println("This is the new pointer next == " +cur.next);
//					System.out.println("This is the head next ==" + head.next.next);
//					
		if (this.head.Data == data) {
			this.head = this.head.next;
			return;
		}
	}

//=====================================================

	public void deleteLastNode(int data) {
		System.out.println("\nDelete the last node " + data + " from the list");
		if (this.head == null) {
			System.out.println("The list is Empty list");
		} else {
			// create new reference
			Node curr = this.head;
			while (curr.next.next != null) {
				// keep going til reach
				curr = curr.next;
			}
			// if reach the null
			curr.next = null;
		}
	}
	// =====================================================

	public void deleteAnynode(int data) {
		System.out.println("\nDelete any node position " + data + " from the list");
		// check if null or not
		if (this.head == null) {
			System.out.println("The list is empty.\n");
			return;
		}
		// create new references
		Node cur = this.head;
		Node prev = this.head;

		System.out.println("This is the curr pointer = " + cur);
		System.out.println("This is the pre pointer = " + prev);
		System.out.println("This is the head = " + head);

		// while data is not found and doesnt reach the null
		while (cur != null && cur.Data != data) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;
	}
//==================================================
	public static boolean isEmpty()
	{
		return size==0;
	}
//===========================================
	
	public int size()
	{
		return size;
	}
	//===========================================
	public static void addatLast(int data) {
		Node newnode = new Node(data);
		if(isEmpty())
		{
			tail=newnode;
		}
		else
		{
			head.prev=newnode;
		}
		newnode.next=head;
		head=newnode;
		size++;
	}
	
	//===========================================
	
		
		
	//===========================================
	public static void main(String[] args) {
		// this class
		LinkedlistExa mylist = new LinkedlistExa();
		System.out.println();

//				//singly linked list
//		Node first = new Node(100);
//		Node second = new Node(200);
//		Node third = new Node(300);
//
//		System.out.println();
//
//		mylist.head = first;
//		first.next = second;
//		second.next = third;
//		mylist.printList();
		// ==============================
		// doubly linked list

//			     Node first = new Node(100);
//				 Node second = new Node(200);
//				 Node third = new Node(300);
//				 
//				 first.next = second;
//				 first.prev= null;
//				 
//				 second.next = third;
//				 second.prev= first;
//				 third.prev=second;
//				 third.next = null;
//				 
//			     mylist.printList();
		
		mylist.addtoEnd(100);
		mylist.addtoEnd(200);
		mylist.addtoEnd(300);
		mylist.addtoEnd(400);
		
		mylist.printfromBeginning();
		System.out.println();
		mylist.printfromEnd();

	}
}
