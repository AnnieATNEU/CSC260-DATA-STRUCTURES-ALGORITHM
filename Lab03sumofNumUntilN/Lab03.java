package Lab03sumofNumUntilN;

import java.util.*;

public class Lab03 {
	
	//1. Compute the sum of natural numbers until N. 
	   public static void main(String args[])
	    {
			
			Scanner inp = new Scanner(System.in);
			System.out.println("enter a number : ");
	        int n = inp.nextInt();

	        System.out.println("The sum of num until " + n + " is : " + sumNum(n));
	    }
//============================================
	    public static int sumNum(int n)
	    {
	        if (n <= 1)
	            return n;
	        else{
	        	//recursion method calling itself here
	        return n + sumNum(n - 1);
	    }
	     
	    }
	}
	