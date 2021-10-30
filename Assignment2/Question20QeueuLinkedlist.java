package Assignment2;

public class Question20QeueuLinkedlist {
	static class Node
	{
	    int data;       // integer data
	    Node next;      // pointer to the next node
	 
	    public Node(int data)
	    {
	        // set data in the allocated node and return it
	        this.data = data;
	        this.next = null;
	    }
	}
//=============================================
	    private static Node rear = null, front = null;
	 
 //==========================================================
	    public static int dequeue()     // remove node
	    {
	        if (front == null)
	        {
	            System.out.print("\nQueue Underflow");
	            System.exit(1);
	        }
	 
	        Node temp = front;
	        System.out.printf("Removing %d\n", temp.data);
	 
	        // advance front to the next node
	        front = front.next;
	    
	        if (front == null) {
	            rear = null;
	        }
	 
	        // deallocate the memory of the removed node and
	        // optionally return the removed item
	        int item = temp.data;
	        return item;
	    }
 //==========================================================
	    public static void enqueue(int item)     // insertion method
	    {
	        // allocate a new node in a heap
	        Node node = new Node(item);
	        System.out.printf("Inserting %d\n", item);
	 
	        // special case: queue was empty
	        if (front == null)
	        {
	            // initialize both front and rear
	            front = node;
	            rear = node;
	        }
	        else {
	            // update rear
	            rear.next = node;
	            rear = node;
	        }
	    }
	 
//==========================================================
	    public static int peek()
	    {
	        // check for an empty queue
	        if (front != null) {
	            return front.data;
	        }
	        else {
	            System.exit(1);
	        }
	 
	        return -1;
	    }
//==========================================================
	    public static boolean isEmpty() {
	        return rear == null && front == null;
	    }
	 
//===================================================
	    public static void main(String[] args)
	    {
	    	Question20QeueuLinkedlist queue = new Question20QeueuLinkedlist();
	    	queue.enqueue(100);
	    	queue.enqueue(200);
	    	queue.enqueue(300);
	 
	        System.out.printf("The front element in the queue is %d\n", queue.peek());
	
	        queue.dequeue();
	        queue.dequeue();
	        System.out.printf("The front element now in the queue is %d\n", queue.peek());
	 
	        if (queue.isEmpty()) {
	            System.out.print("The queue is empty");
	        }
	        else {
	            System.out.print("The queue is not empty");
	        }
	    }
	}