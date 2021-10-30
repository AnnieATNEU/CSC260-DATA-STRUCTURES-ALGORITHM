package Lab05Stack;

import java.util.Stack;

public class Lab05Stack {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node top;

///////////////////////////////////////////////////

	public void push(int data) {
		if (null == top) {
			top = new Node(data);
		} else {
			Node node = new Node(data);
		}
	}

////////////////////////////////////////////
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	//////////////////////////////////////////////

	public void printStack() {
		Node tmp = top;

		if (top == null) {
			System.out.println("Stack is empty....!!");
		}
		System.out.println();
		while (tmp != null) {
			System.out.println(" | " + tmp.data);
			tmp = tmp.next;
		}
	}

/////////////////////////////////////////////	  
	public static void main(String[] args) {
      Lab05Stack stack = new Lab05Stack();
      stack.printStack();
      stack.push(5);
      stack.push(14);
      stack.push(3);
      stack.push(23);
      
      
	}

}
