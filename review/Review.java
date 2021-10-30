package review;

import java.util.*;

public class Review {
	public static void main(String[] args) {
		int [][] intArr ;
		intArr = new int [5][];
		for (int row = 0; row < intArr.length ; row ++) {
			for ( int col = 0; col < intArr[row].length ; col ++) { 	
               intArr [ row ][ col ] = row * col ; 	
		}
		}
		}
	
}