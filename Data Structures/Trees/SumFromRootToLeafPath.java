class Node{
	int data;
	Node left,right;

	Node(int item){
		data = item;
		left = right = null;
	}
}



class SumFromRootToLeafPath{
	/*   	  6
	      /      \
	    3          5
	  /   \          \
	 2     5          4  
	      /   \
	     7     4
  	There are 4 leaves, hence 4 root to leaf paths:
	   Path                    Number
	  6->3->2                   632
	  6->3->5->7               6357
	  6->3->5->4               6354
	  6->5>4                    654   
	Answer = 632 + 6357 + 6354 + 654 = 13997 
*/


	Node root;


	int treePathsSumUtil(Node node, int val){
		if(node == null)
			return 0;

		val = (val*10 + node.data);

		//if the current node is leaf then return the val
		if(node.left == null && node.right == null)
			return val;

		//else recur the sum values for the left and the right sub trees
		return treePathsSumUtil(node.left, val) + treePathsSumUtil(node.right,val);

	}





	 // A wrapper function over treePathsSumUtil()
    int treePathsSum(Node node) 
    {
        // Pass the initial value as 0 as there is nothing above root
        return treePathsSumUtil(node, 0);
    }


	public static void main(String[] args) {
		SumFromRootToLeafPath tree = new SumFromRootToLeafPath();
		tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(4);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(4);
        tree.root.left.right.left = new Node(7);
          
        System.out.print("Sum of all paths is " + tree.treePathsSum(tree.root));
	}
}