package Assignment2;

import java.util.Scanner;

public class QuestionMenu {

	public static void main(String[] args) {
	   QuestionMenu mylist = new QuestionMenu();
	   mylist.menu();
	}
//=============================================
	public static void menu() {	
		
		int option;
		do {
			System.out.println("***Math AssignmentI Questions***");
			System.out.println("1. 2 + 2 ");
			System.out.println("2. 50 - 24  ");
			System.out.println("3. 23 X 18");
			System.out.println("4. 250 / 20");
			System.out.println("5. What does 1st derivative means? ");
			System.out.println("6. Exit");
			System.out.print("Select a question to show answer (1-5) : ");
			Scanner inp = new Scanner(System.in);
			option = inp.nextInt();

			switch (option) {
			case 1:
				int sum = 2 + 2;
				System.out.println("*******************************************************");
				System.out.println("#1 Answer is : " + sum);
				System.out.println("*******************************************************");
				break;

			case 2:
				int subtraction = 50 - 24;
				System.out.println("*******************************************************");
				System.out.println("#2 Answer is : " + subtraction);
				System.out.println("*******************************************************");
				break;

			case 3:
				int multi = 23 * 18;
				System.out.println("*******************************************************");
				System.out.println("#3 Answer is : " + multi);
				System.out.println("*******************************************************");
				break;

			case 4:
				int division = 250 / 20;
				System.out.println("*******************************************************");
				System.out.println("#4 Answer is : " + division);
				System.out.println("*******************************************************");
				break;

			case 5:
				String answer1 = "The first derivative of a function is an expression which \ntells us the slope of a tangent line to the curve at any instant.";
				System.out.println("*******************************************************");
				System.out.println("#5 Answer is : " + answer1);
				System.out.println("*******************************************************");
				break;

			case 6:
				System.out.println("Goodbye! Thank you. ");
				break;

			}
		} while (option != 6);
	}}


// ============================================
