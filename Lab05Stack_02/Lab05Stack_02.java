package Lab05Stack_02;

import java.util.Stack;

public class Lab05Stack_02 {

	static int size;
	static int myarray[];
	static int top;

	 public Lab05Stack_02(int size2) {
		this.size=size;
		this.myarray = new int[size];
		this.top = -1;
	}
	//==========================================================
	public void push(int pushitem) {
		if (!isFull()) {
			// increment the pointer , then add the item
			top++;
			myarray[top] = pushitem;
			System.out.println("pushed element / inserted: " + pushitem);
		} else {
			System.out.println(pushitem);
		}
	}
	//==========================================================
	public int pop() {
		if(!isEmpty())
		{
		    int returnedTop = top;
		    top--;
		    
		    System.out.println("popped element/ The item removed: " +myarray[returnedTop]);
		    return myarray[returnedTop];
			
		}else {
			System.out.println("Your stack is empty");
			return -1;
		}
	}
	//==========================================================
	public int peek(int x) {
		if (!this.isEmpty()) {

			return myarray[top];
		}else {
			System.out.println("Your stack is empty");
			return -1;
		}
	}

	//==========================================================
public boolean isEmpty() {
return (top == -1);
}
//==========================================================
	public boolean isFull() {

		return (size - 1 == top);
	}
//==========================================================
		 public void reversePrint(Stack<Integer> stack) {

				if (stack.isEmpty())
					return;

				int x = stack.pop();
				//recursion calling the method itself
				reversePrint(stack);

				System.out.print(x + " ");

				// push elements back to stack
				stack.push(x);
			}
//==========================================================
				 
	public static void main(String[] args) {

		//Stack class i created
		Lab05Stack_02 tempStack = new Lab05Stack_02(1);
		Stack<Integer> originalStack = new Stack<>();
		System.out.println("***************Stack is First In-Last Out , so the last element here is 4 and \n ****************therefore if reversed 4 should print out first");
		tempStack.push(4);
		tempStack.push(5);
		tempStack.push(6);
		tempStack.push(7);
		tempStack.push(8);
		tempStack.reversePrint(originalStack);

	}
}
