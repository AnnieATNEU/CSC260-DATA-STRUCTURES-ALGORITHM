package Lab02_Recursion;

public class Main {

	public static void main(String[] args) {
	
		//call the countDown function so it will run in main, change the argument to 3
		int factorial = countDown(3);
		System.out.println("  - are the factorial number of " + factorial );
	}
	// Lab02 CSC260

//================================================
	public static int countDown(int n) {
		if (n == 1) {
			System.out.print("1");

		} else {
			System.out.print(" " + n);
			// Recursion: calling the method itself here
			countDown(n - 1); 
		}
		return n;
	}
}

