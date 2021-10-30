package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Queue class
public class Waitinglist {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Waitinglist myqueue = new Waitinglist();

		// here is our menu
		int option;
		option = input.nextInt();
		while (option != 7)
			;
		try {
			System.out.println("Menu ");
			System.out.println("1. Add customer to list");
			System.out.println("2. Display the customer next in line  ");
			System.out.println("3. Remove customer next in line");
			System.out.println("4. Display the length of the line");
			System.out.println("5. Display people ahead of particular costumer");
			System.out.println("6. Exit");
			System.out.print("Select an Option : ");

			switch (option) {
			case 1:
				System.out.println("Enter customer name: ");
				String customerNAme = input.nextLine();
				myqueue.addCustomer(customerNAme);
				break;
				
			case 2:
				System.out.println("Customer next in line is:  ");
				myqueue.displaynextCustomer();
				break;
				
			case 3:
				System.out.println("Enter customer name: ");
				String removeName = input.nextLine();
				myqueue.removeCustomer(removeName);
				break;
				
			case 4:
				System.out.println("The length of the line is:  ");
				myqueue.displayLengthofLine();
				break;
				
			case 5:
				System.out.println("Enter customer name that you want to check: ");
				String cusTocheck = input.nextLine();
				String aheadcustomer= ((Queue<String>)myqueue).peek();
				myqueue.displayPeopleAhead(cusTocheck,aheadcustomer);
				break;
				
			case 6:
				System.out.println("Goodbye! Thank you. ");
				break;
						
			}
		} catch (Exception e) {
			System.out.println("Exception caught in Catch block");
		}
	}

// ============================================
	// method to add customer
	public static void addCustomer(String customerNAme) {
		Stack<Integer> stack = new Stack<Integer>();
		if (!stack.isEmpty()) {
			Integer i = stack.peek();
			// recursion
			addCustomer(customerNAme);
			stack.push(i);
		}
	}

//============================================
	// peek the next customer in queue
	public int displaynextCustomer() {
		Stack<Integer> stack = new Stack<Integer>();
		if (stack.isEmpty()) {
			return -1;
		}
		return stack.peek();
	}

//============================================
	//to remove customer next in line
	public static String removeCustomer(String removeName) {
		Stack<Integer> stack = new Stack<Integer>();
		// Dequeue an item from the queue
			// if first stack is empty
			if (stack.isEmpty()) {
				System.out.println("Queue is Empty");
//				return -1;
			}

			// Return top of 
	return removeName;
		}
//============================================
	public static void displayLengthofLine() {
		Queue<String> myqueue = new LinkedList<>();	
		myqueue.size();
	}

//============================================
	public static void displayPeopleAhead(String cusTocheck, String aheadcustomer) {
		Queue<String> myqueue = new LinkedList<>();
		String myObject = myqueue.peek();

		for( String aheadcustomer1 : myqueue){
			String customer= myqueue.peek();	

	}
	}
}


