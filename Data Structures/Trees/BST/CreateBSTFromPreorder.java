class Node { 
  
    int data; 
    Node left, right; 
  
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
} 

class Index { 
    int index = 0; 
} 

class CreateBSTFromPreorder{

	Index index = new Index(); 

	// The main function to construct BST from given preorder traversal. 
    Node constructTree(int pre[], int size) { 
        return constructTreeUtil(pre, index, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size); 
    } 


	// A recursive function to construct BST from pre[]. preIndex is used to keep track of index in pre[]. 
    Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size) { 
  
        if (preIndex.index >= size) { // Base case and preIndex is obj of Index and .index value = 0
            return null; 
        } 
  
        Node root = null; 
  
        // If current element of pre[] is in range, then  only it is part of current subtree 
        if (key > min && key < max) { //eg 10 is at pre[0]
  
            root = new Node(key); 		//make 10 as root
            preIndex.index = preIndex.index + 1; //now increment the preIndex.index by 1
  
            if (preIndex.index < size) {	// now index is 2 and size is 6 so make left tree
  
                // All nodes which are in range {MIN..KEY} will go in left subtree, 
                root.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size); 
  
                // All nodes which are in range {KEY..MAX} will go in right subtree
                root.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size); 
            } 
        } 
  
        return root; 
    } 



	// A utility function to print inorder traversal of a Binary Tree 
    void printInorder(Node node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 


	


	public static void main(String[] args) {
		CreateBSTFromPreorder tree = new CreateBSTFromPreorder(); 
        int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
        int n = pre.length; 

        Node root = tree.constructTree(pre, n); 
        
        System.out.println("Inorder traversal of the constructed tree is "); 
        tree.printInorder(root); 
	}
}