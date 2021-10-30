package Lab04Question2;
//Student name: Annie Dequit

public class Main {

	public static void main(String[] args) {

		String string1 = "xxhixx";
		System.out.println("The count of x in the string "+ "\""+ string1 + "\" is : " + countX(string1));
	}
	
		public static int countX(String str) {
			
			  if (str.equals("")) 
				  return 0;
			
			  if (str.charAt(0) == 'x') 
				  //recursive, calling function by itself
				  return 1 + countX(str.substring(1));
			
			  else 
				  //recursive, calling function by itself
				  return countX(str.substring(1));
			
			}

	}

