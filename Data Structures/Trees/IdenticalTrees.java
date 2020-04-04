class Node{
	int data;
	Node left, right;

	Node(int x){
		data = x;
		left = right = null;
	}
}

/*The idea is to take 2 pointers and simultaneously check in both the trees and return true*/

class IdenticalTrees{
	
	Node root1, root2;

	private  boolean identicalTrees(Node a, Node b){

		if(a == null && b == null)		//Base case
			return true;

		if(a!= null  && b!= null){		//if something exists	

			//Check the data and check left and right simultaneously in both trees.
			return (a.data == b.data && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));

		}

		return false;			//Means trees are not identical

	}



	public static void main(String[] args)  
    { 
        IdenticalTrees tree = new IdenticalTrees(); 
   
        tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(2); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(5); 
   
        if (tree.identicalTrees(tree.root1, tree.root2)) 
            System.out.println("Both trees are identical"); 
        else
            System.out.println("Trees are not identical"); 
   
	}
}