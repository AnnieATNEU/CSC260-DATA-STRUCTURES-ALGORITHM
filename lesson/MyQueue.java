package lesson;

import lesson.MyQueue;

public class MyQueue {

	private int[] myarray; // array to store queue elements
	private int head; // front points to the front element in the queue
	private int Tail; // rear points to the front element in the queue
	private int capacity; // maximum capacity of the queue
	private int count; // current size of the queue

	MyQueue(int size) { // constructor
		myarray = new int[size];
		capacity = size;
		head = 0;
		Tail = -1;
		count = 0;
	}

//////////////////////////////////////////
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Your Queue is Full");
			System.exit(-1);
		} else {
			Tail = (Tail + 1) % capacity;
			myarray[Tail] = item;
			System.out.println("The item inserted");
			count++;
		}
	}

//////////////////////////////////////////
	public void dequeue() {
		if (stack.isEmpty()) {
			System.out.println("Your Queue is Empty");
			System.exit(-1);
		} else {
			head = (head + 1) % capacity;	
			System.out.println("The item has been deleted");
			count--;
		}
	}

//////////////////////////////////////////
	public boolean isFull() {
		return (size() == capacity());
	}

public int capacity() {
	// TODO Auto-generated method stub
	return 0;
}

public  int peek();
{
	if(stack.isEmpty()) {
			System.out.println("is Empty");
			System.exit(-1);
	}
	return myarray[head];
}




	public static void main(String[] args) {

		MyQueue myqueue = new MyQueue(5);
		myqueue.enqueue(1);
		myqueue.enqueue(2);
		int Peek_ =myqueue.peek()
		System.out.println(Peek_);
		myqueue.enqueue(1);
		myqueue.enqueue(2);
		
		System.out.println(myqueue.peek());
		myqueue.dequeue();
	}

}
