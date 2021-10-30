package Lab01;

public class Main {

	public static void main(String[] args) {

		System.out.println(" Student's Answers to the Questions:");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		
		// 2D array with 8 rows and 10 columns
		//student's answers
		String student_ans[][] = {{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
				{ "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
				{ "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
				{ "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" }, };
         
		//for loop to print the number of rows
		for (int row = 0; row < student_ans.length; row++) {
			//inner for loop to print the columns
			for (int col = 0; col < 10; col++) {
				System.out.print(student_ans[row][col] + " ");
			}
			//within the main loop code line #22, printing student's indeces number in each rows
			System.out.println("  -  Student " + row );
		}
		System.out.println('\n');

		//making object from different class and calling the method checkAnswers , 
		//then change the argument to the 2Darray from main class, which is student_ans.
		Class02 obj1 = new Class02();
		obj1.checkAnswers(student_ans);
		}	
}