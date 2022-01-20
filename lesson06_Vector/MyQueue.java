package lesson06_Vector;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//implement queue using stack
public class MyQueue {

	static Stack<Integer> stack = new Stack<Integer>();

	// Enqueue an item from the queue
	public void enqueue(int val) {
		if(!stack.isEmpty()) {
			int i = stack.peek();
			stack.pop();
			//recursion
			enqueue(val);
			stack.push(i);
		
		}
		else {
			stack.add(val);
	}
	}
	
	// Dequeue an item from the queue
	public int dequeue() {
		// if first stack is empty
		if (stack.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}

		// Return top of 
		int x = stack.pop();
		return x;
	}

	// peek an item from the queue
	public int peek() {
			if (stack.isEmpty()) {
				 return -1;		
			}
			return stack.peek();
	}	
	// isEmpty method
   boolean isEmpty() {
	   return stack.isEmpty();
   }
			


	public static void main(String[] args) {
		MyQueue myqueue = new MyQueue();
		myqueue.enqueue(100);
		myqueue.enqueue(200);
		myqueue.enqueue(300);
		
		System.out.println("The top in here is the first element because it is queue");
		System.out.println("==========================================================");
		System.out.println("Without dequeue this is what is on top  : "+ myqueue.peek());
		
		myqueue.dequeue();
		System.out.println("After dequeue this is what is left on top : "+ myqueue.peek());
	}
}

