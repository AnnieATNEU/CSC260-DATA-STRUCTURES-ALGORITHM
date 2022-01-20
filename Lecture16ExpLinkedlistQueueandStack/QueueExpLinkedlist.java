package Lecture16ExpLinkedlistQueueandStack;


public class QueueExpLinkedlist {

	Node head;
	Node Top = null;
	Node tail=null;
	Node front=null;

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
//=====================================
	public void peek() {
		if(front!=null)
		{
		System.out.println(front.data);	
		}else {
			System.out.println("No Data");
		}
	}
	
//=====================================	
	public void enqueue(int data) {
		Node newnode= new Node(data);
		if(front==null) {
			front = newnode;
			tail= newnode;
		}else {
			tail=newnode;
		}
	}
//=====================================	
//=====================================	
	//to delete item
	public void dequeue(int data) {
			Node curr= front;
			if(front==null) {
				System.out.println("No Data");
			}else {
				front=front.next;
			}
		}
//=====================================	
	public boolean isEmpty() {
		return Top==null;
	}
//=====================================

	public static void main(String[] args) {
    QueueExpLinkedlist mylist = new QueueExpLinkedlist();
	mylist.enqueue(10);
	mylist.enqueue(20);
	mylist.enqueue(30);
	
	mylist.peek();
	
	}

}

