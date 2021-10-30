package Lab01;

import java.util.*;

public class Class02 {
	
	//method to use in the main class, x
	public void checkAnswers( String [][]answers) {
		//the answers
		String key[] = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
		
		//for loop to store students answer
		for (int i = 0; i < answers.length; i++) {
			int correct = 0;
			//for loop to store keys (right answers)
			for (int j = 0; j < key.length; j++) {
				//if statement to compare i which is students answers to j which is the key answers
				if (key[j] == answers[i][j])
					correct++; // correct will be the count of matches
			}
			System.out.println("Student " + i + "'s correct answer is " + correct);
	}

}}