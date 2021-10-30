package Lab10;

class Node {
  Node next;
  int data;
}

public class LabSinglylinkedlist {
	
	class Node {
		  Node next;
		  int data;
		}
  //===========================================
   // to get Intersection of two linked list in sorted manner
  public Node getIntersection(Node A, Node B) {
    A = mergeSort(A);
    B = mergeSort(B);
    return mergeWithIntersection(A, B);
  }
  
  //===========================================
   // to get sort the linked list 
  public Node mergeSort(Node node) {
	  
    if(node == null || node.next == null) {
      return node;
    }
    
    Node middle = middleNode(node);
    Node secondHalf = middle.next;
    middle.next = null;
    
    return MergeLink(mergeSort(node), mergeSort(secondHalf));
  }
  
  //============================================
  // to return the middle node of Linked list
  public Node middleNode(Node node) {
    if(node == null) {
      return null;
    }
    
    Node A = node;
    Node B = node.next;
    
    while(B != null && B.next != null) {
      A = A.next;
      B = B.next.next;
    }
    
    return A;
  }
  
  //===================================
 //method to merge two linked list
  public Node MergeLink(Node A, Node B) {
    Node temp = new Node();
    Node finalList = temp;
    
    while(A != null && B != null) {
      if(A.data < B.data) {
        temp.next = A;
        A = A.next;
      } else {
        temp.next = B;
        B = B.next;
      }
      temp = temp.next;
    }
    temp.next = (A == null) ? B : A;
    return finalList.next;
  }
  
  //=============================================
   //and this is to merge the two linked list as intersection 
  private Node mergeWithIntersection(Node A, Node B) {
	  System.out.println("this is the point where the node intersects");
    if(A == null && B == null) {
      return null;
    }
    
    if(A != null && B == null) {
      return B;
    }
    
    if(A == null && B != null) {
      return B;
    }
    
    Node temp = new Node();
    Node finalList = temp;
    while(A != null && B != null) {
      if(A.data < B.data) {
        A = A.next;
      } else if(A.data > B.data) {
        B = B.next;
      } else {
        temp.next = A;
        temp = temp.next;
        A = A.next;
        B = B.next;
      }
    }
    temp.next = null;
    return finalList.next;
  }
    
//to make new node
  public Node getNewNode(int key) {
    Node A = new Node();
    A.next = null;
    A.data = key;
    return A;
  }

  //===========================================
  //to insert the element in Linkedlist
  public Node insert(int key, Node node) {

    if (node == null)
      return getNewNode(key);
    else
      node.next = insert(key, node.next);

    return node;
  }

  //===========================================
   // to print the complete linked list 
  public void printList(Node node) {
	
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printList(node.next);
  }
//===========================================
  public static void main(String[] args) {

    Node head1 = null;
    LabSinglylinkedlist mylist = new LabSinglylinkedlist();
  
    head1 = mylist.insert(24, head1);
    head1 = mylist.insert(6, head1);
    head1 = mylist.insert(11, head1);
    head1 = mylist.insert(13, head1);
    
    Node head2 = null;
    head2 = mylist.insert(13, head2);
    head2 = mylist.insert(19, head2);
    head2 = mylist.insert(6, head2);
    
    mylist.printList(head1);
    System.out.println();
    
    mylist.printList(head2);
    System.out.println();
    
    Node union = mylist.getIntersection(head1, head2);
    mylist.printList(union);
    
  }
}