package lesson;

import java.util.Stack;

public class Stacks { //in stack FILO (FIRST IN LAST OUT) Only one pointer

	public static void main(String[] args) {
		// LIFO - Last in -First out
		Stack<String> animals= new Stack<String>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Horse");
		
		System.out.println("This is my stack items "+ animals);
		System.out.println();
		
		System.out.println("This is my stack items "+ animals.peek());
		System.out.println("========================================");
		
		//to remove the last element added // 
		System.out.println(animals.peek()); // pop , push , isEmpty, peek, isFull, size, toString
		
		/*
		 * Abstract Data type (ADT) 
		 * is a type (or class) for objects whose behaviour 
		 * is defined by a set of value and a set of operations. ... 
		 * It is called “abstract” because it gives an implementation-independent view. 
		 * The process of providing only the essentials 
		 * and hiding the details is known as abstraction.
		 */
			
		System.out.println("This is my stack items "+ animals);
		System.out.println("My array items are: " );
		Object[] myArray =animals.toArray();
		for (int i = 0; i < myArray.length; i++) {
			System.out.println( myArray[i]);
		}
		
		
	}

}
