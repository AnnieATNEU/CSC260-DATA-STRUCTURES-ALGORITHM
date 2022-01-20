package lesson06_Vector;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class v2 {

	public static void main(String[] args, Vector<String> subList) {
	
		Vector<String> v = new Vector<String>();
		v.add("Item1");
		v.add("Item2");
		v.add("Item3");
		v.add("Item4");
		v.add("Item5");
		v.add("Item6");
	
		
		List sublist = v.subList(2,5);
		
		//size and capacityIncrement after two insertions
		System.out.println("Sub list elements :" );
		for(int i=0; 1 < subList.size(); i++)
		System.out.println(subList.get(i));
	
		
	}

}