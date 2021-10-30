package Lab04;

//Student name: Annie Dequit

public class Main {

	public static void main(String[] args) {
		//this should print out 5
		int n = 2;
		System.out.println("This is the total ears of bunnies " + bunnyEars(n));

	}

	public static int bunnyEars(int bunnies) {

		if (bunnies < 1) {
			return 0;
		}
		if (bunnies % 2 == 1) {
			// recursive with the odd number
			return 2 + bunnyEars(bunnies - 1);
		}
		// recursive with the even number
		return 3 + bunnyEars(bunnies - 1);
	}
}
