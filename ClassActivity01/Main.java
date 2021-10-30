package ClassActivity01;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// ask the user for size and elements array
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Array size: ");
		int size = input.nextInt();
		int[] Array1 = new int[size];

		// for loop will loop base on how many size user entered
		System.out.print("Please Input the Array elements(numbers):");
		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = input.nextInt();
		}

		// ***************************************************************
		// make obj from different class
		Anotherclass obj1 = new Anotherclass();

		// using the created object from other class and call the method from that class
		System.out.println("These are the 1D array of the numbers you entered.");

		// this is the method we took from another class and we put the Array1 in the
		// arguments to
		// use the function of that method in this array for this main class.
		obj1.printArray(Array1);
		obj1.getMaxmin(Array1);
	}

}
