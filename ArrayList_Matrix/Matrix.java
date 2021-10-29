package ArrayList_Matrix;
//student name: Annie Dequit
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		// declare variable
		int m, n, i, j, temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows ");

		// take number of rows
		m = input.nextInt();

		System.out.print("Enter number of columns ");

		// take number of columns
		n = input.nextInt();

		// declare an mxn order array
		int a[][] = new int[m][n];
		
		int option = 0;
		while (option != 7);
		try {
			System.out.println("Menu ");
			System.out.println("1. Input elements into matrix");
			System.out.println("2. Display elements of matrix  ");
			System.out.println("3. Sum of all the elements in matrix");
			System.out.println("4. Display row-wise sum of matrix");
			System.out.println("5. Display column-wise sum of matrix");
			System.out.println("6. Create transpose of matrix ");
			System.out.println("7. Exit ");
			System.out.print("Select an Option : ");

			option = input.nextInt();
			int list;
			// switch case
			switch (option) {
			case 1:
				inputElements(m,n);
				break;
			case 2:
				displayElements(m,n);
				break;
			case 3:
				allSum(m,n);
				break;
			case 4:
				rowWisesum(m,n);
				break;
			case 5:
				colWisesum(m,n);
				break;
			case 6:
				transposeMatrix(m,n);
				break;
			}

		} catch (Exception e) {
			System.out.println("Exception caught in Catch block");
		}
	}
//============================================
	public static void inputElements(int m, int n) {
		int a[][]= new int[m][n];
		// execute when m is equals to n
		if (m == n) {
			System.out.println("Enter all the values of matrix ");

			// take the matrix inputs
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					Scanner input = null;
					a[i][j] = input.nextInt();
				}
			}
			System.out.println("All elements inserted");
		}
	}

//================================================
	public static void allSum(int m, int n) {
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int[][] mat = null;
				sum = sum + mat[i][j];
			}
		}
		System.out.println("SUM of the elements of the matrix = " + sum);
	}

//=============================================================
	public static void rowWisesum(int m, int n) {
		int a[][]= new int[m][n];
	      //Calculates sum of each row of given matrix    
        for(int i = 0; i < m; i++){    
            int sumRow = 0;    
            for(int j = 0; j < n; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    

	}

//=============================================================
	public static void colWisesum(int m, int n) {
		int a[][]= new int[m][n];
		//Calculates sum of each column of given matrix    
        for(int i = 0; i < n; i++){    
            int sumCol = 0;    
            for(int j = 0; j < m; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
	}
//============================================

	public static void displayElements(int m, int n) {

		// declare an mxn order array
		int a[][] = new int[m][n];
		// print the original matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			System.out.println(" This is the elements in your matrix: " + a[i][j]);
		}
	}}
//============================================
	public static void transposeMatrix(int m, int n) {
        int temp;
		// declare an mxn order array
		int a[][] = new int[m][n];

		// this is to perform the transpose
		for (int j = 0; j < m; j++) {
			temp = a[j][j];
			a[j][j] = a[j][n - 1 - j];
			a[j][n - 1 - j] = temp;
		}
		System.out.println(" This is after transposing the matrix:  ");

		// print interchanged matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
