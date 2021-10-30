package lab_09Delete;

public class lab09_Q2SearchList {
	
	    static Node head; // head of list
	 
	    /* Linked list Node*/
	    class Node
	    {
	        public static final int Data = 0;
			int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	 
	    /*To delete 1st occurrence of the given item in linked list */
//==========================================================
	   public void deleteKey(int key)
	    {
	        // Store head node
	        Node temp = head, prev = null;
	 
	        // If head node found  the key or the multiple occurrences of key
	        while (temp != null && temp.data == key)
	        {
	        	//creating new references
	            head = temp.next; 
	            temp = head; 
	        }
	 
	        // Delete occurrences other than head
	        while (temp != null)
	        {
	            //searching for item to delete and track previous node , also create new references           
	            while (temp != null && temp.data != key)
	            {
	                prev = temp;
	                temp = temp.next;
	            }
	 
	            // if they item is not found
	            if (temp == null)
	                return;
	 
	            // detaching the node from linked list
	            prev.next = temp.next;
	 
	            //create new reference
	            temp = prev.next;
	        }
	    }
	 
	    /* to insert a new Node at front of the list. */
//==========================================================
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
//==========================================================	 
	    /* to print the content of linked list */
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	    }
//==========================================================
	    public boolean SearchList(int data)  {
	    	Node searchrefr = this.head;
	    	while (searchrefr != null)
	    	{
	    		if (searchrefr.Data == data)
	    			return true; // data found
	    		searchrefr = searchrefr.next;
	    	}
	    	return false;  //data not found
	    }
	    
//==========================================================
 public static void main(String[] args)
 {
	 lab09_Q2SearchList mylist = new lab09_Q2SearchList();

     mylist.push(9);
	 mylist.push(3);
	 mylist.push(3);
	 mylist.push(5);
	 mylist.push(6);
	 mylist.push(7);
	 mylist.push(3);
	 mylist.push(3);

  
     int key = 3; // the item occurence to delete

     System.out.println("The items in linked list are : ");
     mylist.printList();

     mylist.deleteKey(key);

     System.out.println(
         "\nAnd these are the items after deleting all the occurence : ");
     mylist.printList();
 }
}