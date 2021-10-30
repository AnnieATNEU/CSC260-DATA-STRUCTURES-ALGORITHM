
	package Lab_08_Merge;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Main {
		
	//Method to merge the two arrays in ascending order and store it in the third array
		public static void merge(int a[], int b[], int c[], int n1, int n2) {
			int i = 0, j = n2 - 1, n = 0;
			while (i < n1 && j >= 0) {
				if (a[i] > b[j])
					c[n++] = b[j--];
				else
					c[n++] = a[i++];
			}
			while (i < n1) {
				c[n++] = a[i++];
			}
			while (j >= 0) {
				c[n++] = b[j--];
			}
		}

	// this is the Method to sort the second array in descending order
		public static void reverse_sort(int b[], int n) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					if (b[j] < b[j + 1]) {
						int temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
					}
				}
			}
		}

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int number1, number2;

			System.out.println("Please Enter the no of element in first array :  ");
			number1 = input.nextInt();
			System.out.println("Please Enter the no of element in Second array :  ");
			number2 = input.nextInt();

			int[] a = new int[number1];
			int[] b = new int[number2];
			int[] c = new int[number1 + number2];
			int i;

			System.out.println("Please Enter the no of element in first array :  ");
			for (i = 0; i < number1; i++)
				a[i] = input.nextInt();
		
			System.out.println("Please Enter the no of element in Second array :  ");
			for (i = 0; i < number2; i++)
				b[i] = input.nextInt();

			Arrays.sort(a); //here we are Sorting the array  in ascending order.
			reverse_sort(b, number2); // Call method to reverse array in descending order
			merge(a, b, c, number1, number2); // Calling merge method to merge two array into one

			// Printing the first Array
			System.out.println("The first array is : ");
			for (i = 0; i < number1; i++)
				System.out.print(a[i] + " ");
			System.out.println();

			// Printing the Second Array
			System.out.println("The Second array is : ");
			for (i = 0; i < number2; i++)
				System.out.print(b[i] + " ");
			System.out.println();

			// Printing the Result Array
			System.out.println("The result of the merge array is :  ");
			for (i = 0; i < number1 + number2; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
		}
	}

