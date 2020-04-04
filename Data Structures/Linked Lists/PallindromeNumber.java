/* Java program to check if linked list is palindrome recursively */
import java.util.*; 

class Node { 
    int data; 
    Node next; 
    Node(int d) 
    { 
        next = null; 
        data = d; 
    } 
} 

class PallindromeNumber { 

    /* O(n) complexity */
	static boolean isPalindrome(Node head)  // 1 2 3 4 3 2 1
	{ 
		Node slow = head; 
		boolean ispalin = true; 
		Stack<Integer> stack = new Stack<Integer>(); 

		while (slow != null) { 
			stack.push(slow.data); 
			slow = slow.next; 
		} 

		while (head != null) { 

			int i = stack.pop(); 
			if (head.data == i) { 
				ispalin = true; 
			} 
			else { 
				ispalin = false; 
				break; 
			} 
			head = head.next; 
		} 
		return ispalin; 
    }
    

    /* efficient coz traverses only till n/2 ie logn complexity */
    static boolean isPalindrome2(Node head) 
    {
        if (head == null) return false;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(head != null) {
            list.add(head.data);
            head = head.next;
        }
        
        Integer listSize = list.size();
        Boolean result = true;
        for (int i = 0; i < listSize/2; i++) {
            if (list.get(i) != list.get(listSize-1-i)) {
                result = false;
                break;
            }
        }
        
        return result;
    }    
    public static void main(String args[]) 
	{ 
		Node one = new Node(1); 
		Node two = new Node(2); 
		Node three = new Node(3); 
		Node four = new Node(4); 
		Node five = new Node(3); 
		Node six = new Node(2); 
		Node seven = new Node(1); 
		one.next = two; 
		two.next = three; 
		three.next = four; 
		four.next = five; 
		five.next = six; 
		six.next = seven; 
		boolean condition = isPalindrome(one); 
		System.out.println("isPalidrome :" + condition); 
	}  
} 
