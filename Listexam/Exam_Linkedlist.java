package Listexam;

public class Exam_Linkedlist {

//========create node
	Node head;
	int size = 0;

	public class Node {
		int Data;
		Node Next;

		public Node(int userdata) {
			this.Data = userdata;
			this.Next = null;
		}
	}

//=====================================
	public void InsertFront(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			head = newnode;
		} else {
			newnode.Next = this.head;
			this.head = newnode;

		}
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
	public void printlist() {
		if (isEmpty()) {
			System.out.println("Your list is Empty");
		} else { // Node current pointing to head
			System.out.print("The nodes are >>>");
			Node curr = head;
			// while curr is not empty print curr data until its null
			while (curr != null) {
				System.out.print(curr.Data + ">>>");
//				System.out.print(curr.Next + ">>>");
				System.out.println();

				curr = curr.Next;
			}
			System.out.println("Null");
		}
	}

//=====================================	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_Linkedlist mylist = new Exam_Linkedlist();
		System.out.println();
		mylist.InsertFront(10);
		mylist.InsertFront(20);
		mylist.InsertFront(30);

		mylist.printlist();
//=============================	
		Exam_Linkedlist mylist2 = new Exam_Linkedlist();
		mylist2.InsertFront(40);
		mylist2.InsertFront(50);
		mylist2.InsertFront(60);

		System.out.println();
		mylist2.printlist();
	}

}
