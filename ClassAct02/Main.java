package ClassAct02;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is print system");
		printStars(5);
	}

	public static void printStars(int n) {

		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor = factor * i;
			System.out.println(" " + factor);
		}
		System.out.println();
	}

}
