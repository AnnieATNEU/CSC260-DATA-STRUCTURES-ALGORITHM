package lab03stringReverse;

public class StringReverse {
	

	/* method to use to print reverse of the passed string */
	//then I change the argument of this method to main class to user's input
	
	public static void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		  System.out.println(str);
		else
		{
			//to flip the string 
			System.out.print(str.charAt(str.length()-1));
			
			//recursion is here
			reverse(str.substring(0,str.length()-1));
		}
}}