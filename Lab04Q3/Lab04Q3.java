package Lab04Q3;
//Student name: Annie Dequit

public class Lab04Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 172773770;
		System.out.println("The number 7 occured " +count7(n) + " times" + " in " + n);
		
	}

	public static int count7(int n) {
		
		  if (n < 1) 
			  return 0;
		
		  if (n % 10 == 7)
			  //recursive, calling function by itself
			  return 1 + count7(n/10);
		  //recursive, calling function by itself
		  else return count7(n/10);
		
		}
}