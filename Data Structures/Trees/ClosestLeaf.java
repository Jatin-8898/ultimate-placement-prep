import java.util.*;

class Node{
	int data;
	Node left, right;

	Node(int x){
		data = x;
		left = right = null;
	}
}

class ClosestLeaf{
	
	
	Node root;

	int closestDown(Node n){

		if(n == null)								//base case
			return 0;

		if(n.left == null && n.right == null)		//if its leaf return distance as 0
			return 0;

		// Return minimum of left and right, plus one 
		return ( 1 + Math.min(closestDown(n.left) , closestDown(n.right)) );
	}

	 int findClosestUtil(Node node, char key, Node ancestors[], int index) {

	 	if(node == null)
	 		return Integer.MAX_VALUE;

	 	if(node.data == key){

	 		int res = closestDown(node);

	 		//Traverse all ancestors and update result if any parent node  gives smaller distance 
	 		for (int i=index-1; i>=0; i--) {
	 			res = Math.min(res, index - i + closestDown(ancestors[i])); 	
	 		}

	 		return res;
	 	}

	 	// If key node found, store current node and recur for left and  right childrens 
	 	ancestors[index] = node;
	 	return Math.min(findClosestUtil(node.left , key, ancestors, index + 1) , 
	 					findClosestUtil(node.right , key, ancestors, index + 1) );
	 }


	int findClosest(Node node, char key)  
    { 
        // Create an array to store ancestors 
        Node ancestors[] = new Node[100]; 				// Assumptiom: Maximum height of tree is 100 
        return findClosestUtil(node, key, ancestors, 0); 
    } 

	public static void main(String[] args) {
		ClosestLeaf tree = new ClosestLeaf(); 

        tree.root = new Node('A'); 
        tree.root.left = new Node('B'); 
        tree.root.right = new Node('C'); 
        tree.root.right.left = new Node('E'); 
        tree.root.right.right = new Node('F'); 
        tree.root.right.left.left = new Node('G'); 
        tree.root.right.left.left.left = new Node('I'); 
        tree.root.right.left.left.right = new Node('J'); 
        tree.root.right.right.right = new Node('H'); 
        tree.root.right.right.right.left = new Node('H'); 
   
        char k = 'H'; 
        System.out.println("Distace of the closest key from " + k + " is " +tree.findClosest(tree.root, k)); 
        k = 'C'; 
        System.out.println("Distace of the closest key from " + k + " is "+ tree.findClosest(tree.root, k)); 
        k = 'E'; 
        System.out.println("Distace of the closest key from " + k + " is "+ tree.findClosest(tree.root, k)); 
        k = 'B'; 
        System.out.println("Distace of the closest key from " + k + " is "+ tree.findClosest(tree.root, k)); 
	}
}