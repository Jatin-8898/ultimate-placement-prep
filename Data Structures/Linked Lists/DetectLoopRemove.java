class DetectLoopRemove{
	
	static Node head;

	static class Node{
		int data;
        Node next;
        
		Node(int d){
			data = d;
			next = null;
		}
	}

	static void detectAndRemoveLoop(Node node){
		
		if(node == null || node.next == null)
			return;

		//Creat both slow and fast as Node
		Node slow = node, fast = node;

		//Initialise slow for 1 steps and fast for 2 steps
		slow = slow.next;
		fast = fast.next.next;

		//Search for the loop using the slow and fast pointers
		while(fast != null && fast.next != null){

			//If loops exists
			if(slow == fast)
				break;

			slow = slow.next;
			fast = fast.next.next;
        }
        //Slow is at 4 & Fast at 7

		//wen out of while means loop exists in LL
		if(slow == fast){
			slow = node;		    //This moves the slow to the First node
                        
            while(slow.next != fast.next){      // 1 2 3 4 5
				slow = slow.next;               //     | 
				fast = fast.next;               //     8 7 6
            }

            //Now slow is at 2 & fast is at 8 so FAST->NEXT = NULL will remove the loop

			//Since fast->next is the looping point Remove it 
			fast.next = null;
		}
	}

	 static void printList(Node node){
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
    }
	public static void main(String[] args) {
		//DetectLoopRemove list = new DetectLoopRemove();
		DetectLoopRemove.head =  new Node(50);
		DetectLoopRemove.head.next =  new Node(20);
		DetectLoopRemove.head.next.next =  new Node(15);
		DetectLoopRemove.head.next.next.next =  new Node(4);
		DetectLoopRemove.head.next.next.next.next =  new Node(10);

		 // Creating a loop for testing 
        head.next.next.next.next.next = head.next.next;

        DetectLoopRemove.detectAndRemoveLoop(head);

        System.out.println("Linked List after removing loop : ");
        DetectLoopRemove.printList(head);

	}
}