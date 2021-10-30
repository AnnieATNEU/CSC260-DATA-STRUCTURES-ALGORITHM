package ClassActivity01;

public class Anotherclass {

	// method to call in main class
	public void printArray(int[] array) {

		int x = array.length;
		for (int i = 0; i < x; i++) {
			System.out.print(array[i] + " ");

		}
	}

//#########################################################
	// method to get min & max from array
	public void getMaxmin(int[] array) {
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			// re-assigning values of variable min and max from array
			if (array[i] < min)
				min = array[i];

			if (array[i] > max)
				max = array[i];

		}

		// printing after the for loop
		System.out.println("\n" + "The min number in the array is: " + min);
		System.out.println("The max number in the array is: " + max);

	}
}
