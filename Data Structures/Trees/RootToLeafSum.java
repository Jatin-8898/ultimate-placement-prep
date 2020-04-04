class Node{
	int data;
	Node left,right;

	//Constructor
	Node(int item){
		data = item;
		left = right = null;
	}

}
/*This only returns true or false depedning on whether the path exists or not*/

class RootToLeafSum{
	
	/*
     Given a tree and a sum, return true if there is a path from the root
     down to a leaf, such that adding up all the values along the path
     equals the given sum.
   
     Strategy: subtract the node value from the sum when recurring down,
     and check to see if the sum is 0 when you run out of tree.
     */

	Node root;

	boolean hasPathSum(Node node , int sum){
		if(node == null)
			return false;

		boolean ans = false;

		int diff  =  (sum - node.data);	// 21 -10 = 11 

		if(node.left != null)		                //Go to left with diff 11
			ans = ans || hasPathSum(node.left, diff); //then 11-8 = 3     //3-3 = 0 

		if(node.right != null)
			ans = ans || hasPathSum(node.right, diff);

		if(diff == 0   &&   node.left==null   && node.right == null)
			return true;

		return ans;

	}





	public static void main(String[] args) {
		int sum  = 21;
		/* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
		RootToLeafSum tree = new RootToLeafSum();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
	}
}