package ArrayList_Matrix;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
	
public class Multiplication2D {
	
	public static void main(String [] args) {
		getMultiplicationTable();
	}


	 public static void getMultiplicationTable(){

	      Scanner numsEnter = new Scanner(System.in);

	    System.out.println("Please enter in two numbers for 2D array [row first(4) then columns(6): ");

	    int numRow = numsEnter.nextInt();
	    int numCol = numsEnter.nextInt();

	    int[][] table = new int[numRow+1][numCol+1];

	    System.out.println("These are the multiplication of row element of two-dimensional array A[4][6]" );

	    while(true){
	        if((numRow >= 1 && numRow <= 10) && (numCol >= 1 && numCol <= 10)){
	            break;
	        }else{
	            System.out.println("These numbers are invalid, please enter two numbers between 0 & 10");
	            numRow = numsEnter.nextInt();
	            numCol = numsEnter.nextInt();
	        }
	    }
	    numRow++;
	    numCol++;

	    for(int row=0; row < table.length; row++){
	        for(int column = 0; column < table[row].length; column++){
	            System.out.print(table [row] [column] = (row) * (column) );
	            System.out.print(" ");
	        }
	        System.out.println();
	    }

	    }}