package Listexam;



public class DoubleLinkedList {

//========create node
	Node head;
	Node tail;
	int size = 0;

	public class Node {
		int Data;
		Node Next;
		Node Prev;

		public Node(int userdata) {
			this.Data = userdata;
			this.Next = null;
			this.Prev=null;
		}
	}

//=====================================
	public void InsertFront(int data) {
		Node newnode = new Node(data);
		if (isEmpty())
		{ //if is empty make tail the newnode
			tail = newnode;
		} 
		else
		{
			//or else make the prev node the newnode
			head.Prev= newnode;
		}
			newnode.Next = head;
			this.head = newnode;
		size++;
	}
//=====================================

	public boolean isEmpty() {
		return size == 0;
	}

//=====================================

	public int size() {
		return size;
	}

//=====================================
	public void printFront() {
		if (isEmpty()) {
			System.out.println("Your list is Empty");
		} else { // Node current pointing to head
			System.out.print("The nodes are >>>");
			System.out.println();
			Node curr = head;
			// while curr is not empty print curr data until its null
			while (curr != null) {

				System.out.print(curr.Data + "->>>");		
				curr = curr.Next;
			}
			System.out.println("Null");
		}
	}	
	//=====================================
		public void printBack() {
			if (isEmpty()) {
				System.out.println("Your list is Empty");
			} else { // Node current pointing to head
				System.out.print("The nodes are >>>");
				System.out.println();
				Node curr = tail;
				// while curr is not empty print curr data until its null
				while (curr != null) {
					System.out.print(curr.Data + ">>>");
					curr = curr.Prev;
				}
				System.out.println("Null");
			}
		}

//=====================================	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList mylist = new DoubleLinkedList();
		System.out.println();
		mylist.InsertFront(10);
		mylist.InsertFront(20);
		mylist.InsertFront(30);

	    mylist.printFront();
	    mylist.printBack();
}
}