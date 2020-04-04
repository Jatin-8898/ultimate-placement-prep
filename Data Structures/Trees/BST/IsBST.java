class IsBST{
	
	static Node root;

	static class Node{
		
		int data;
		Node left,right;
		
		Node(int item){
			data = item;
			left = right = null;
		}

	}

	private static boolean isBinarySearchTree(Node root, Integer low ,Integer high){
		/*The idea is to check if the root is greater than LEFT child
		and the root should be less than RIGHT child
	
		And to cover all the case we take 2 variables Lower Limit and Upper Limit
		the node we r examining should be BETWEEN the lower and the upper limit else return false
		Recursively do this for each node in the left and the right subtree.
		*/

		//These 2 ifs are way to restrict the node should be between low n high.
		if(low != null  &&  root.data < low)//wen low has some value & data < low means not a BST
			return false;

		if(high != null   &&  root.data > high)	//Wen high has some value & the data > high 
			return false;

		boolean isLeftBst = true;
		boolean isRightBst = true;

		if(root.left != null)		//Search in the left side and pass high as root.data
			isLeftBst = isBinarySearchTree(root.left , low, root.data);

		if(isLeftBst  && root.right != null)//Seach in right side and pass the low as root.data
			isRightBst = isBinarySearchTree(root.right , root.data, high);

		return isLeftBst && isRightBst;
	}

	/*
        Simplified version
    */    
   static boolean  isBSTSimplified(Node  root, Node l, Node r) 
	{ 
	    // Base condition 
	    if (root == null) 
	        return true; 
	  
	    // if left node exist then check it has 
	    // correct data or not i.e. left node's data should be less than root's data 
	    if (l != null && root.data <= l.data) 
	        return false; 
	  
	    // if right node exist then check it has 
	    // correct data or not i.e. right node's data should be greater than root's data 
	    if (r != null && root.data >= r.data) 
	        return false; 
	  
	    // check recursively for every node. 
	    return isBSTSimplified(root.left, l, root) && isBSTSimplified(root.right, root, r); 
	} 
	

	public static void main(String[] args) {
		/* Constructed binary tree is
              10
             /  \
           8     12
          / \   /
         3   9 11
        */
		IsBST.root = new Node(10);
		IsBST.root.left = new Node(8);
		IsBST.root.right = new Node(12);
        IsBST.root.right.left = new Node(11);
        IsBST.root.left.left = new Node(3);
        IsBST.root.left.right = new Node(9);

        
        if(IsBST.isBSTSimplified(root,null,null))
        	System.out.println("TRUE");
        else
            System.out.println("FALSE");
            
        if(IsBST.isBinarySearchTree(root,null,null))
        	System.out.println("TRUE");
        else
        	System.out.println("FALSE");
        
	}
}