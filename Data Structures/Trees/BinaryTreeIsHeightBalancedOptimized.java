/*This runs in O(n) time*/

class Node{
	int data;
	Node left,right;

	//Constructor
	Node(int item){
		data = item;
		left = right = null;
	}

}

// A wrapper class used to modify height across  recursive calls. 
class Height { 
    int height = 0; 
} 


class BinaryTreeIsHeightBalancedOptimized{


	Node root;

	boolean isBalanced(Node root, Height height){
		
		if (root == null) { 
            height.height = 0; 		//height is the passsed argument and .height is its member.
            return true; 			//if height 0 its balanced.
        }

        /*GEtting the height of the left and the right subtress*/
        Height leftHeight = new Height();
        Height rightHeight = new Height();

        boolean left = isBalanced(root.left, leftHeight);
        boolean right = isBalanced(root.right, rightHeight);


        int lHeight  = leftHeight.height;
        int rHeight  = rightHeight.height;

        /* Height of current node is max of heights of left and right subtrees plus 1*/
        height.height = (lHeight > lHeight? lHeight: rHeight) + 1; 

        /* If difference between heights of left and right subtrees is more than 2 then this node is not balanced so return 0 */
        if ((lHeight - lHeight >= 2) || (lHeight - lHeight >= 2)) 
            return false; 
        else 
         	return left && right; 
	}



	int height(Node node) { 
        if (node == null) 
            return 0; 
  
        //If tree is not empty then height = 1 + max of left height and right heights 
        return 1 + Math.max(height(node.left), height(node.right)); 
    } 






	public static void main(String[] args) {
		Height height = new Height(); 
        /* Constructed binary tree is 
                   1 
                 /   \ 
                2      3 
              /  \    / 
            4     5  6 
            / 
           7         */
        BinaryTreeIsHeightBalancedOptimized tree = new BinaryTreeIsHeightBalancedOptimized(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        //tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
        //tree.root.right.right = new Node(6); 
        tree.root.left.left.left = new Node(7); 
  
        if (tree.isBalanced(tree.root, height)) 
            System.out.println("Tree is balanced"); 
        else
            System.out.println("Tree is not balanced"); 
	}
}