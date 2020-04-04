/*
  An empty tree is height-balanced. A non-empty binary tree T is balanced if:
  1) Left subtree of T is balanced
  2) Right subtree of T is balanced
  3) The difference between heights of left subtree and right subtree is not more than 1.

  The above height-balancing scheme is used in AVL trees
*/
class Node {
      int val;
      Node left;
      Node right;

      Node(int x) { 
        val = x; 
        left = right = null;
      }
  }

class BinaryTreeIsHeightBalanced {
    
    Node root;

    public boolean isBalanced(Node root) {
        int left;
        int right;
        
        if(root == null)
            return true;
        
        left = height(root.left);
        right = height(root.right);

        if(Math.abs(left-right) <=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        
        return false;
    }
    
    int height(Node node) { 
        if (node == null) 
            return 0; 
  
        /* If tree is not empty then height = 1 + max of left height and right heights */
        return 1 + Math.max(height(node.left), height(node.right)); 
    } 

    public static void main(String[] args) {
      BinaryTreeIsHeightBalanced tree = new BinaryTreeIsHeightBalanced();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
         if(tree.isBalanced(tree.root)){
            System.out.println("TRUE");
         }else
          System.out.println("FALSE");
    }
}