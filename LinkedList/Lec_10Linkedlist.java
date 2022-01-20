package LinkedList;

import java.util.LinkedList;

public class Lec_10Linkedlist {

	Node head = null;

	static class Node {
		int Data;
		Node next;

		// constructor
		public Node(int userdata) { // assigned userdata to Data and make next null
			this.Data = userdata;
			this.next = null;
		}
	}

	public void addtoBeginning(int data) {
		System.out.println("The node has been inserted in the front : " + data);
		 //create a new node
		Node newnode = new Node(data);
		  //check if the list is empty
		if (this.head == null)
		{
		    //make the new node as head
           this.head= newnode;
		}
		else {
			   //Point the new node's next to head
			newnode.next = this.head;
			this.head = newnode;
		}

	}

//=====================================================
	public void addtoEnd(int data) {
		System.out.println("The node has been inserted in the end : " + data);
		// Create a new node
		Node newnode = new Node(data);
		if(head==null)
		{
			this.head = newnode;
		}
		else // Init the cur and prev nodes to the head
		{     
			Node curr = this.head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=newnode;
		}

	}

//=====================================================
	public void addtoPosition(int position, int data) {
		System.out.println("The node " + data + " has been inserted at the position " + position);
		//. create a new node
		Node newnode= new Node(data);
		Node curr = this.head;
		Node prev=this.head;
		if(position==1) 
		{
			newnode.next = this.head;
			this.head = newnode;
			return;
		}
		while(curr.next!=null && --position>0)
		{
			prev= curr;
			curr =curr.next;
		}
		
		prev.next=newnode; //connecting with node before
		newnode.next=curr; //connecting with node after
	}

//=====================================================
		public void printList() {
			if (this.head==null) {
				System.out.println("The list has no node>>>>>>>");
			}
			else {
				System.out.print("The nodes are >>>");
			Node curr = head;
			
			while(curr!=null) {
				System.out.print(curr.Data+">>>");
				curr = curr.next;
			}
			}
		}
//=====================================================
	public static void main(String[] args) {
		// this class
		Lec_10Linkedlist mylist = new Lec_10Linkedlist();
		System.out.println();
		
		mylist.addtoBeginning(100);
		mylist.addtoBeginning(200);
		mylist.addtoBeginning(300);
		System.out.println();
		mylist.addtoEnd(800);
		mylist.addtoEnd(500);
		mylist.addtoEnd(600);
		mylist.printList();
		
		System.out.println();
		
		mylist.addtoPosition(3,900);
		
		System.out.println();
		mylist.printList();
		
             	

	}
}
