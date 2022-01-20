package lesson06_Vector;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	//implement stack using queue
        Queue<Integer> myqueue = new LinkedList<Integer>();
        
// ====================================	
public void push(int val) {
	//to insert
	int size= myqueue.size();
	
	myqueue.add(val);
	for(int i = 0; i<size; i++) 
	{
		int x= myqueue.remove();
		myqueue.add(x);				
			} 
		}
//==========================================================
public int pop() {
	//to remove
			if(myqueue.isEmpty())
			{
			    System.out.println("No elements");
			    return -1;
				
			}
			int x  = myqueue.remove();
			return x;			
			}
		
//==========================================================
public int mypeek()
	{
		if (myqueue.isEmpty())
			return -1;
		return myqueue.peek();
	}
	    //returns true if Stack is empty else false
	boolean isEmpty() {
		return myqueue.isEmpty();
		
	}
	//==========================================================
					 
		public static void main(String[] args) {

			//Stack class i created
			MyStack mystack = new MyStack();
			mystack.push(100);
			mystack.push(200);
			mystack.push(300);
			int itemremo= mystack.pop();
			
			System.out.println("Here remove item is..."+ itemremo);
			
			int item = mystack.mypeek();
			System.out.println("Here what we have..."+ item);
	
		

		}
	}

