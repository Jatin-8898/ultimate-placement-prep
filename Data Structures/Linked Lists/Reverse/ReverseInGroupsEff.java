
import java.util.*; 
class ReverseInGroupsEff 
{ 
    static class Node 
    { 
        int data; 
        Node next; 
    } 
    static Node head = null; 

    static Node Reverse(Node head, int k) 
    { 
        // Create a stack of Node* 
        Stack<Node> mystack = new Stack<Node> (); 
        Node current = head; 
        Node prev = null; 

        while (current != null) 
        { 
            // Terminate the loop whichever comes first either current == NULL or count >= k 
            int count = 0; 
            while (current != null && count < k) 
            { 
                mystack.push(current); 
                current = current.next; 
                count++; 
            } 

            // Now pop the elements of stack one by one 
            while (mystack.size() > 0) 
            { 

                // If final list has not been started yet. 
                if (prev == null) 
                { 
                    prev = mystack.peek(); 
                    head = prev; 
                    mystack.pop(); 
                } 
                else
                { 
                    prev.next = mystack.peek(); 
                    prev = prev.next; 
                    mystack.pop(); 
                } 
            } 
        } 

        // Next of last element will point to NULL. 
        prev.next = null; 
        return head; 
    } 

    /* UTILITY FUNCTIONS */
    /* Function to push a node */
    static void push( int new_data) 
    { 
        /* allocate node */
        Node new_node = new Node(); 

        /* put in the data */
        new_node.data = new_data; 

        /* link the old list off the new node */
        new_node.next = head; 

        /* move the head to point to the new node */
        head = new_node; 
    } 

    /* Function to print linked list */
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 

    /* Driver code*/
    public static void main(String[] args) 
    { 
        /* Created Linked list is 1->2->3-> 
        4->5->6->7->8->9 */
        push( 9); 
        push( 8); 
        push( 7); 
        push( 6); 
        push( 5); 
        push(4); 
        push(3); 
        push(2); 
        push( 1); 

        System.out.println("Given linked list "); 
        printList(head); 
        head = Reverse(head, 3); 
        System.out.println(); 

        System.out.println("Reversed Linked list "); 
        printList(head); 
    } 
} 
