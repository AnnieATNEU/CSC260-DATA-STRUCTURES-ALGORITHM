package Lab03descending;

import java.util.*;

public class Main {

	// 3. Write a recursive function that prints the numbers 1…n in descending
	// order.
	// to print all numbers between 1 to N in reverse order
	public static void main(String[] args) {
		int N = 5;
		descendingNum(N);
	}

	// method to print from N to 1
	public static void descendingNum(int N) {
		
		if (N < 1) {
			System.out.println();
		}
		else {
			// recursion method calling itself here
			System.out.print(N + " ");
			descendingNum(N-1);
		}

	}
}

