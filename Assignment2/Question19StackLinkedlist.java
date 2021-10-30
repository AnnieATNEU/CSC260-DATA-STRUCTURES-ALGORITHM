package Assignment2;

public class Question19StackLinkedlist {
	class Node
	{
	    int data;       // integer data
	    Node next;      // pointer to the next node
	}
	    private Node top;
	 
	    public Question19StackLinkedlist() {
	        this.top = null;
	    }
	 
//========================================================== 
	    public void push(int x)       //to insert
	    {
	        // allocate a new node in a heap
	        Node node = new Node();
	 
	        // check if stack (heap) is full. Then inserting an element would
	        // lead to stack overflow
	        if (node == null)
	        {
	            System.out.print("\nIt is empty");
	            return;
	        }
	 
	        System.out.println("Inserting " + x);
	 
	        // set data in the allocated node
	        node.data = x;
	 
	        // set the `.next` pointer of the new node to point to the current
	        // top node of the list
	        node.next = top;
	 
	        // update top pointer
	        top = node;
	    }
	 
	    // Utility function to check if the stack is empty or not
	    public boolean isEmpty() {
	        return top == null;
	    }
	 
	    // Utility function to return the top element of the stack
	    public int peek()
	    {
	        // check for an empty stack
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("The stack is empty");
	            return -1;
	        }
	    }
	 
	    // Utility function to pop a top element from the stack
	    public void pop()        // remove at the beginning
	    {
	        // check for stack underflow
	        if (top == null)
	        {
	            System.out.print("\nStack Underflow");
	            return;
	        }
	 
	        System.out.println("Removing " + peek());
	 
	        // update the top pointer to point to the next node
	        top = (top).next;
	    }
//============================================================
	    public static void main(String[] args)
	    {
	    	Question19StackLinkedlist stack = new Question19StackLinkedlist();
	 
	        stack.push(100);
	        stack.push(200);
	        stack.push(300);
	 
	        System.out.println("The top element is " + stack.peek());
	        
	        stack.pop();
	        System.out.println("The top element now is " + stack.peek());
	        
	        if (stack.isEmpty()) {
	            System.out.print("The stack is empty");
	        }
	        else {
	            System.out.print("The stack is not empty");
	        }
	    }
	}