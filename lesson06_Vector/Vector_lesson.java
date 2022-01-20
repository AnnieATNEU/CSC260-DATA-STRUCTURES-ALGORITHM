package lesson06_Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_lesson {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		v.addElement("Apple");
		v.addElement("Orange");
		v.addElement("Mango");
		v.addElement("Fig");
		
		System.out.println("size is: " + v.size());
		System.out.println("Default capacity increment is : " + v.capacity());
		
		v.addElement("fruit1");
		v.addElement("fruit2");
		v.addElement("fruit3");
		
		//size and capacityIncrement after two insertions
		System.out.println("Size after addition" + v.size());
		System.out.println("capacity after increment is: " + v.capacity());
	
		//Display vector elements
		Enumeration en = v.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
			System.out.println(en.nextElement() + " ");
		
	}

}
