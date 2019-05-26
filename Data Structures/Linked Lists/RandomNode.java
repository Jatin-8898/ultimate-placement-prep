import java.util.*; 
import java.util.UUID;

  
class RandomNode { 
  
    static Node head;  // head of list 
  
    /* Node Class */
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor to create a new node 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

    private static void printRandom(Node node){
    	if(node == null)
    		return;

    	// Use a different seed value so that we don't get same result each time we run this program
    	UUID uuid = UUID.randomUUID();

    	// Initialize result as first node 
        int result = node.data;

        Node current = node;
        for (int n=2; current != null; n++) {
        	
        	if(Math.random() % n == 0 ){
        		result = current.data;
        	}

        	current = current.next;
        }
         System.out.println("Randomly selected key is " + result); 

    }

	public static void main(String[] args) { 
  
        
        RandomNode.head = new Node(5); 
        RandomNode.head.next = new Node(20); 
        RandomNode.head.next.next = new Node(4); 
        RandomNode.head.next.next.next = new Node(3); 
        RandomNode.head.next.next.next.next = new Node(30); 
  
        RandomNode.printRandom(head.next); 
  
    } 
}