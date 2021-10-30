package lab03stringReverse;

import java.util.*;

public class Main {
		
	//2. Write a recursive function to reverse a string. 
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Type your string to reverse: ");
		String userString = inp.nextLine();
		
		//making object from StringReverse class
		StringReverse obj1 = new StringReverse();
		obj1.reverse(userString);
	}

}
