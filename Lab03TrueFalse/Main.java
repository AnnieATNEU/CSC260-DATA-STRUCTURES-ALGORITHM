package Lab03TrueFalse;

import java.util.*;

public class Main {

	// 4. Design a method that returns true if element n is a member of array x[]
	// and false if not.
	public static void main(String[] args)
	{
		//array 
		int arr[] = {10, 5, 9, 3, 8, };
		
		//in here I used the built in method Arrays.toString to print the array in the console
		System.out.println("This is the array of numbers");
		System.out.println(Arrays.toString(arr));
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter the number to check if it is a member of the array: ");
		int n = inp.nextInt();
	
		System.out.println(existOrnot(arr, n));
		
		}
       //method i used to determine the user input if exist or not in array
	public static boolean existOrnot(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

}