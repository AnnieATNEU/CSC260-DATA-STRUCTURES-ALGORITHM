package Assignment2;

public class QuestionThree {
	
	    private Node head;
	    public QuestionThree() 
	    { this.head = new Node("head");
	    }   
	    
	    public Node head() 
	    { return head;
	    }
	   
	    public void appendTotail(Node node) {
	    	
	        Node current = head;
	        
	        //find last element of LinkedList tail
	        while(current.next() != null){
	            current = current.next();
	          
	        }
	        //appending new node to tail in LinkedList
	        current.setNext(node);
	        System.out.println(current);
	    }
	    
	   
	     // if singly LinkedList contains Cycle 	
	    public boolean isCyclic(){
	        Node fast = head;
	        Node slow = head;
	       
	        while(fast!= null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	            
	         if(fast == slow ){
	                return true;
	            }
	        }
	        return false;
	    }
	   
	    @Override
	    public String toString(){
	        StringBuilder sb = new StringBuilder();
	        Node current = head.next();
	        while(current != null){
	           sb.append(current).append("-->");
	           current = current.next();
	        }
	        sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
	       return sb.toString();
	    }

	    public static class Node {
	        private Node next;
	        private String data;

	        public Node(String data) {
	            this.data = data;
	        }

	        public String data()
	        { return data; 
	        }
	        
	        public String setData(String data) 
	        { return this.data = data;
	        }
	        public void getData(String data) 
	        { this.data = data;
	        }
	        public Node next() 
	        { return next; 
	        }
	        public void setNext(Node next)
	        { this.next = next; 
	        }

	        @Override
	        public String toString() {
	            return this.data;
	        }
	    }
	
	  //====================================
	  	public static void main(String args[]) {


	      	//creating LinkedList with 5 elements and head
	      	QuestionThree mylist = new QuestionThree();
	      	Node nodelist = new Node("");
	      	
	      	mylist.appendTotail(new QuestionThree.Node("101"));
	      	QuestionThree.Node cycle = new QuestionThree.Node("201");
	      	mylist.appendTotail(cycle);
	      	mylist.appendTotail(new QuestionThree.Node("301"));
	      	mylist.appendTotail(new QuestionThree.Node("401"));
	      	mylist.appendTotail(cycle);
	      	
	        System.out.println("The top one is the starting node of the cycle, starting from head");
	        
	      	if(mylist.isCyclic()){
	      	   System.out.println("Yes, the LinkedList is cyclic, it contains cycles");
	      	}else{
	      	   System.out.println("No, the LinkedList is not cyclic, no cycle found");
	      	}    
	   

	      } 
	     
	  }



