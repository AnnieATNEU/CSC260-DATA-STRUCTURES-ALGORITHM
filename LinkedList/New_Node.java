package LinkedList;

import LinkedList.Lec_10Linkedlist.Node;

public class New_Node {
	
	
   public void addNodeAtTheBeginning(int data){
	   //create a new node
	   Node newNode = new Node(data);
	   
	   //check if the list is empty
	   if (this.head == null)
	   {
		   //make the new node as head
		   this.head = newNode;
		   
	   }
	   else
	   {
		   Node cur = this,head;
		   while(cur.next != null) {
			   cur = cur.next;
		   }
		   cur.next = newNode;
		   }
		   //Point the new node's next to head
		   newNode.next = this.head;
		   
		   //make the new node as head
		   this.head = newNode;
	   }
   }
   
   public static void main(String [] args) {
		addNodeAtTheBeginning(int data);
	}
	
}
