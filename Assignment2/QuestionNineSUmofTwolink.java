package Assignment2;

import java.util.Stack;

public class QuestionNineSUmofTwolink {

	private class ListNode {
		int value;
		ListNode next;

		ListNode(int value) {
			this.value = value;
		}
	}

	ListNode head;
	ListNode tail;

	// appends node at the end of the list
	private void appendNode(int value) {
		if (head == null) {
			head = new ListNode(value);
			tail = head;
			return;
		}

		ListNode n = new ListNode(value);
		tail.next = n;
		tail = n;
	}

	// creates and returns a new list with node values taken from the stack 's'
	private ListNode createLinkedList(Stack<Integer> s) {
		if (head != null) {
			head = null;
		}

		while (!s.isEmpty()) {
			appendNode(s.pop());
		}
		return head;
	}
//================================================
	// to create and return a new list with node values taken from number[] array
	public ListNode createLinkedList(int[] number) {
		if (head != null) {
			head = null;
		}

		for (int i = 0; i < number.length; i++) {
			appendNode(number[i]);
		}
		return head;
	}

//====================================================		     
	public void printList(ListNode head) {
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}

//======================================================	     
	public ListNode addLists(ListNode node1, ListNode node2) {
		if (node1 == null) {
			return node2;
		}
		if (node2 == null) {
			return node1;
		}

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();

		// push list1 into the first stack
		ListNode temp = node1;
		while (temp != null) {
			stack1.push(temp.value);
			temp = temp.next;
		}

		// push list2 into the second stack
		temp = node2;
		while (temp != null) {
			stack2.push(temp.value);
			temp = temp.next;
		}

		int sum = 0, carry = 0, value1, value2;

		// then keep adding the popped digits to the sum until one of the stacks becomes empty sum itself is stored in a stack
		while ((!stack1.empty()) && (!stack2.empty())) {
			value1 = stack1.pop();
			value2 = stack2.pop();

			sum = (value1 + value2 + carry) % 10;
			carry = (value1 + value2 + carry) / 10;

			stack3.push(sum);
		}

		// if stack1 still has some digits left, add those digits to the sum
		while (!stack1.isEmpty()) {
			value1 = stack1.pop();

			sum = (value1 + carry) % 10;
			carry = (value1 + carry) / 10;

			stack3.push(sum);
		}

		// if stack2 still has some digits left, add those digits to the sum
		while (!stack2.isEmpty()) {
			value2 = stack2.pop();

			sum = (value2 + carry) % 10;
			carry = (value2 + carry) / 10;

			stack3.push(sum);
		}

		// then after adding digits from both the stack, if the remaining carry is greater than 0 add that carry to the sum
		if (carry > 0) {
			stack3.push(carry);
		}

		
		// return this newly created linked list
		return createLinkedList(stack3);
	}

	public static void main(String[] args) {
		QuestionNineSUmofTwolink solution = new QuestionNineSUmofTwolink();

		int[] firstNumber = { 3, 1, 1, 2, 2 };
		int[] secondNumber = { 2, 6, 2, 5, 4 };

		ListNode head1 = solution.createLinkedList(firstNumber);

		ListNode head2 = solution.createLinkedList(secondNumber);

		ListNode result = solution.addLists(head1, head2);

		System.out.print("Result sum of two linked list is: \n");
		solution.printList(result);
	}
}