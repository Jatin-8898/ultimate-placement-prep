
// Java program to get intersection point of two linked list 
import java.util.*; 
class Node { 
	int data; 
	Node next; 
	Node(int d) 
	{ 
		data = d; 
		next = null; 
	} 
} 
class IntersectUsingHashSet { 

    public static int intersectPoint(Node n1, Node n2) 
	{ 
		HashSet<Node> set = new HashSet<Node>(); 
      
        while (n1 != null) {    //keep Inserting in Set
            set.add(n1); 
            n1 = n1.next; 
        } 
      
        while (n2 != null) { 
            if (set.contains(n2)) {     //If found same return that element
                return n2.data; 
            } 
            n2 = n2.next; 
        } 
      
        return 0; 
    } 
    
	public static void main(String[] args) 
	{ 
		// list 1 
		Node n1 = new Node(1); 
		n1.next = new Node(2); 
		n1.next.next = new Node(3); 
		n1.next.next.next = new Node(4); 
		n1.next.next.next.next = new Node(5); 
		n1.next.next.next.next.next = new Node(6); 
		n1.next.next.next.next.next.next = new Node(7); 
		// list 2 
		Node n2 = new Node(10); 
		n2.next = new Node(9); 
		n2.next.next = new Node(8); 
		n2.next.next.next = n1.next.next.next; 
		Print(n1); 
		Print(n2); 
		System.out.println(intersectPoint(n1, n2)); 
	} 

	// function to print the list 
	public static void Print(Node n) 
	{ 
		Node cur = n; 
		while (cur != null) { 
			System.out.print(cur.data + " "); 
			cur = cur.next; 
		} 
		System.out.println(); 
	} 

	
} 
