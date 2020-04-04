// Java program to print the 
// left view of Binary Tree 
import java.util.*; 

/*The idea is to do Level order traversal of Tree using queue and print the first node at each level*/

class LeftView 
{ 

    // A Binary Tree Node 
    static class node 
    { 
        int data; 
        node left, right; 
    }; 

    // A utility function to create a new Binary Tree node 
    static node newNode(int item) 
    { 
        node temp = new node(); 
        temp.data = item; 
        temp.left = null; 
        temp.right = null; 
        return temp; 
    } 
    
    static Queue<node> q; 

    static void leftViewUtil( node root ) 
    { 
        if (root == null) 
            return; 

        q.add(root);     // add root 
        
        q.add(null); // Delimiter 

        while (q.size() > 0) 
        { 
            node temp = q.peek(); 
            if (temp != null) 
            { 
               // Prints first node of each level 
                System.out.print(temp.data + " "); 

                // add children of all nodes at current level 
                while (q.peek() != null) 
                { 
                    
                    if (temp.left != null)       // If left child is present add into queue 
                        q.add(temp.left); 
                    
                    if (temp.right != null)      // If right child is present add into queue
                        q.add(temp.right); 

                    q.remove(); // remove the current node 

                    temp = q.peek(); 
                    
                    
                } 

                // add delimiter for the next level 
                q.add(null); 
            } 

            // remove the delimiter of the previous level 
            q.remove(); 
            /* for(node i : q)
                System.out.println(i.data + " Queue is ");  */
        } 
    } 

    // Fucntion to print the leftView 
    // of Binary Tree 
    static void leftView( node root) 
    { 
        // Queue to store all 
        // the nodes of the tree 
        q = new LinkedList<node>(); 

        leftViewUtil(root); 
    } 

    // Driver Code 
    public static void main(String args[]) 
    { 
        node root = newNode(10); 
        root.left = newNode(12); 
        root.right = newNode(3); 
        root.left.right = newNode(4); 
        root.right.left = newNode(5); 
        root.right.left.right = newNode(6); 
        root.right.left.right.left = newNode(18); 
        root.right.left.right.right = newNode(7); 

        leftView(root); 
    } 
} 
