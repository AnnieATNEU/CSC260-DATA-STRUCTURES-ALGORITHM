package ReadFile_reverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class readfile_reverse {

	public static void main(String[] args) throws FileNotFoundException{
		/*
		 * Problem :
		 * Write code to read a file and display its words in reverse order
		 */
//
		ArrayList <String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("words.txt"));
//		
//		while (input.hasNext()) {
//			String word = input.next();
//		    allWords.add(word);
//		}
//		System.out.println(allWords);
//		    
//		//display in reverse order
//		for (int i= allWords.size() -1; i>=0; i--) {
//			System.out.println(allWords.get(i));
//		}
//		
//		//remove all plural words
//		for (int i= 0; i<allWords.size() -1; i++) {
//			String word = allWords.get(i);
//			if (word.endsWith("s")) {
//				allWords.remove(i);
//				i--;
		
		        printRecursive(input);      
		    }
		 
		    private static void printRecursive(Scanner scanner) {
		        // if scanner doesn't have another line, then return
		       if (!scanner.hasNextLine()) {
		           return;
		       }
       
		       //recursion
		       System.out.println(scanner.nextLine());
		       //scanner now is pointing to the next line
		       printRecursive(scanner); // print the rest of the lines
		    }
		     
		
			}
		

/*
 * Problem :
 * Write code to read a file and display its words in reverse order
 * 
 * Solution:
 * ===Uses an Array but real solution that is better is Stack with arrayList
 * 
 * String[] allWords = new String[1000];
 * 
 *int wordCount=0;
 *
 * ====Using Stack
 */

//ArrayList <String> allWords = new ArrayList<String>();
//allWords.add("Marty Shore");
//allWords.add("Stuart Reges");
//allWords.add("Rayver MacGuin");
//allWords.add(2, "Dinah Louis");  // index and value
//allWords.set(2, "Jarah Fandin"); //setting value in specific index
////System.out.println(mylist.get(2));  // getting specific value
//System.out.println(allWords); 
