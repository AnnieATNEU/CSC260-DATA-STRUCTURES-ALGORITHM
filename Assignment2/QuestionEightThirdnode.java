package Assignment2;

public class QuestionEightThirdnode {

		Node head; // head of the list
		
		class Node {
			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}
//=====================================
		public void getThirdNodefromlast(int n)
		{
			int len = 0;
			Node temp = head;

			// 1) count the number of nodes in Linked List
			while (temp != null) {
				temp = temp.next;
				len++;
			}

			// check if value of n is not more than length of
			// the linked list
			if (len < n)
				return;

			temp = head;

			for (int i = 1; i < len - n + 1; i++)
				temp = temp.next;

			System.out.println(temp.data);
		}

//======================================
		public void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}

public static void main(String[] args)
		{
	QuestionEightThirdnode mylist = new QuestionEightThirdnode();
			mylist.push(3);
			mylist.push(12);
			mylist.push(6);
			mylist.push(14);
 
			System.out.println("the third node from last is ");
			mylist.getThirdNodefromlast(3);
		}
	}