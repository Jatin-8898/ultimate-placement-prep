class FindNthElementFromLast{

	/*The problem is that you r given a singly linked list and your given the head node and a value n You have to find the element from the end*/

    static Node head;

    static class Node{
		int data;
		Node next;
		
		Node(int item){
			data = item;
			next = null;
		}
	}

	private static void findTheNthElement(Node node,int n){ // 10  20 35 42 60
		if(node == null || node.next == null)
			return;

		//Create 2 pointers current and follow pointing to the first node in the LL
		Node current  = node;
		Node ahead = node;

		//The idea is to move the ahead pointer 'n' times ahead in this case //35 pe aake ruka
		int i=0;
		while(i < n){
			ahead = ahead.next;	//in this case ahead moves till 42
			i++;
		}

		//Now move both the pointers one by one until the ahead reaches null
		while(ahead != null){
			current = current.next;
			ahead = ahead.next;
		}

		//When the ahead reaches null it means current is at the nth element from the last
		if(ahead == null){
			System.out.println("The Element from the End is  " + current.data);
		}
    }
    
    int getNthFromLast(Node head, int n)
	{
		int len = 0;
        Node temp = head;

        // Traverse temp throught the linked list and find the length
		while(temp != null) {
			temp = temp.next;
			len++;
        }
        
		if(len < n)
            return -1;
            
		//System.out.println(count);
		//int r = count - n;
        temp = head;
        
        // Traverse the node till the position from begining:   length - n +1.
		for(int i=1; i<len-n+1; i++)
			temp = temp.next;
        
        return temp.data;
		
	}

	public static void main(String[] args) {

		FindNthElementFromLast.head =  new Node(10);
		FindNthElementFromLast.head.next =  new Node(20);
		FindNthElementFromLast.head.next.next =  new Node(35);
		FindNthElementFromLast.head.next.next.next =  new Node(42);
		FindNthElementFromLast.head.next.next.next.next =  new Node(60);

		int n = 3;
		FindNthElementFromLast.findTheNthElement(head,n);
	}
}