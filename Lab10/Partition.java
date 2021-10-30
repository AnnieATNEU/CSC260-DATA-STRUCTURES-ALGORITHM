package Lab10;

public class Partition
{

static class Node
{
	int data;
	Node next;
}

 static Node newNode(int data)
{
	Node new_node = new Node();
	new_node.data = data;
	new_node.next = null;
	return new_node;
}
//=========================================================
// Function to make two separate lists and return head after concatenating
public static Node partition(Node head, int x)
{	
	//initializing the first and last nodes of the linked list
	Node smallerHead = null, smallerLast = null;
	Node greaterLast = null, greaterHead = null;
	Node sameValueHead = null, equalLast =null;

	// iterating original list and connect nodes of appropriate linked lists.
	while (head != null)
	{
		// If the current node is equal to x, append it to the list of x values
		if (head.data == x)
		{
			if (sameValueHead == null)
				sameValueHead = equalLast = head;
			else
			{
				equalLast.next = head;
				equalLast = equalLast.next;
			}
		}

		// If current node is less than X, append
		// it to the list of smaller values
		else if (head.data < x)
		{
			if (smallerHead == null)
				smallerLast = smallerHead = head;
			else
			{
				smallerLast.next = head;
				smallerLast = head;
			}
		}
		else // Append to the list of greater values
		{
			if (greaterHead == null)
				greaterLast = greaterHead = head;
			else
			{
				greaterLast.next = head;
				greaterLast = head;
			}
		}
		head = head.next;
	}

	// Fix end of greater linked list to NULL if this
	// list has some nodes
	if (greaterLast != null)
		greaterLast.next = null;

	//this is to connect three lists
	// If smaller list is empty
	if (smallerHead == null)
	{
		if (sameValueHead == null)
			return greaterHead;
		equalLast.next = greaterHead;
		return sameValueHead;
	}

	// If smaller list is not empty
	// and equal list is empty
	if (sameValueHead == null)
	{
		smallerLast.next = greaterHead;
		return smallerHead;
	}

	// If both smaller and equal list
	// or are non-empty
	smallerLast.next = sameValueHead;
	equalLast.next = greaterHead;
	return smallerHead;
}
//=========================================================
//===============================
public static void printList(Node head)
{
	Node temp = head;
	while (temp != null)
	{
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
}

//=========================================================
public static void main(String[] args)
{
	//starting from empty list
	Node head = newNode(11);
	head.next = newNode(3);
	head.next.next = newNode(6);
	head.next.next.next = newNode(9);
	head.next.next.next.next = newNode(12);
	head.next.next.next.next.next = newNode(43);

	int x = 10;
	System.out.println("x is " +x);
	head = partition(head, x);
	printList(head);
}
}

