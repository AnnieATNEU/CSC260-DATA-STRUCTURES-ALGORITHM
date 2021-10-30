package Assignment2;

public class QuestionTwo {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
//===============================================
	public void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println("The middle element is [" + slow_ptr.data + "] \n");
	}

	// Inserts a new Node at front of the list
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// this method prints the linked list elements from given node
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		QuestionTwo mylist = new QuestionTwo();
		for (int i = 5; i > 0; --i) {
			mylist.push(i);
			mylist.printList();
			mylist.printMiddle();
		}
	}
}
