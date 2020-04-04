class Node{
		
	int data;
	Node left,right;
	
	Node(int item){
		data = item;
		left = right = null;
	}

}


class RangeQueries{

	 Node root; 

	void Print(Node node, int k1, int k2) { 
          
        if (node == null) { 	/* base case */
            return; 
        } 
  
        //Since value is less than the root go left
        if (k1 < node.data) { 
            Print(node.left, k1, k2); 
        } 
  

        /* if root's data lies in range, then prints root's data */
        if (k1 <= node.data && k2 >= node.data) { 
            System.out.print(node.data + " "); 
        } 
  


       //Value greater go right
        if (k2 > node.data) { 
            Print(node.right, k1, k2); 
        } 
    } 




	public static void main(String[] args) {
		/* Constructed binary tree is
              20
             /  \
           8     22
          / \   
         4   12 
        */
        RangeQueries tree = new RangeQueries(); 
        int k1 = 10, k2 = 25;

        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
  	}


}