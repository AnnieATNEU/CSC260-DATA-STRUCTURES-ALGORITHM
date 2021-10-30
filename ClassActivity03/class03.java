package ClassActivity03;

public class class03 {

	public static void main(String[] args) {
		System.out.println("This is print system");
		int n = 3;
		Fact(n);
	}

	public static void Fact(int n) {

		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor = factor * i;
			System.out.println(" " + factor);
		}
		System.out.println();
	}

}
