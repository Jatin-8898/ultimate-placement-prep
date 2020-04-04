/*
We can solve this in O(n) time and with a single traversal of the given BST. Since inorder traversal of BST is always a sorted array, the problem can be reduced to a problem where two elements of a sorted array are swapped. There are two cases that we need to handle:

1. The swapped nodes are not adjacent in the inorder traversal of the BST.

 For example, Nodes 5 and 25 are swapped in {3 5 7 8 10 15 20 25}. 
 The inorder traversal of the given tree is 3 25 7 8 10 15 20 5 
If we observe carefully, during inorder traversal, we find node 7 is smaller than the previous visited node 25. Here save the context of node 25 (previous node). Again, we find that node 5 is smaller than the previous node 20. This time, we save the context of node 5 ( current node ). Finally swap the two node’s values.

2. The swapped nodes are adjacent in the inorder traversal of BST.

  For example, Nodes 7 and 8 are swapped in {3 5 7 8 10 15 20 25}. 
  The inorder traversal of the given tree is 3 5 8 7 10 15 20 25 
Unlike case #1, here only one point exists where a node value is smaller than previous node value. e.g. node 7 is smaller than node 8.
*/
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Node { 
  
    int data; 
    Node left, right; 
  
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
} 

class FixSwappedNodes{

	Node first, middle, last, prev; 
	
	void correctBST( Node root ) 
    { 
        // Initialize pointers needed  for correctBSTUtil() 
        first = middle = last = prev = null; 
  
        correctBSTUtil( root ); 
  
        
        if( first != null && last != null ) 	// CASE 1:  Fix (or correct) the tree 
        { 
            int temp = first.data; 
            first.data = last.data; 
            last.data = temp;  
        } 

        
        else if( first != null && middle !=  null )  //CASE 2: Adjacent nodes swapped 
        { 
            int temp = first.data; 
            first.data = middle.data; 
            middle.data = temp; 
        } 
  
        // else nodes have not been swapped,  passed tree is really BST. 
    } 

   	void correctBSTUtil( Node root) 
    { 
        if( root != null ) 
        { 
            // Recur for the left subtree 
            correctBSTUtil( root.left); 
  
            // If this node is smaller than the previous node, it's  
            // violating the BST rule. 
            if (prev != null && root.data <  prev.data) 
            { 
                // If this is first violation,  mark these two nodes as 
                // 'first' and 'middle' 
                if (first == null) 
                { 
                    first = prev;		//mark prev as first 
                    middle = root; 		//and current ie root as middle
                } 
  
                // If this is second violation,  mark this node as last 
                else
                    last = root; 
            } 
            prev = root; 	 // Mark this node as previous 

            correctBSTUtil( root.right);  // Recur for the right subtree 
        } 
    } 


    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(" " + node.data); 
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		 /*   6 
            / \ 
           10  2 
          / \ / \ 
         1  3 7 12 
          
        10 and 2 are swapped 
        */
  
        Node root = new Node(6); 
        root.left = new Node(10); 
        root.right = new Node(2); 
        root.left.left = new Node(1); 
        root.left.right = new Node(3); 
        root.right.right = new Node(12); 
        root.right.left = new Node(7); 
  
        System.out.println("Inorder Traversal of the original tree"); 
        FixSwappedNodes tree = new FixSwappedNodes(); 
        tree.printInorder(root); 
        tree.correctBST(root); 

        System.out.println("\nInorder Traversal of the fixed tree"); 
        tree.printInorder(root); 
	}
}