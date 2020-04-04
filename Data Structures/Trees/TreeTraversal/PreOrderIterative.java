import java.util.Stack;

class Node{
	int data;
	Node left,right;

	Node(int x){
		data = x;
		left = right = null;
	}
}



class PreOrderIterative{
	public static void main(String[] args) {
		PreOrderIterative tree = new PreOrderIterative();
		/*
			  10
			/	 \
		   8      2
		  / \      \
		 3 	 5      2

		*/	
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iterativePreorder();
	}

	Node root;

	void iterativePreorder(){
		iterativePreorderUtil(root);
	}

	void iterativePreorderUtil(Node node){

		//Base case
		if(node == null)
			return;

		//Create and empty stack and push the root to it.
		Stack<Node> nodeStack = new Stack<Node>();

		nodeStack.push(root);

		/* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first
         so that left is processed first becuase its a stack LIFO order
         and we want root,left,right so we first print root put right,left and then pop */

         while(!nodeStack.isEmpty()){

         	 // Store the top item and print it and then pop
         	Node myNode = nodeStack.peek();	//return top element

         	System.out.print(myNode.data + " ");
         	nodeStack.pop();

         	 // Push right and left children of the popped node ie Current node to stack
         	if(myNode.right != null)
         		nodeStack.push(myNode.right);

         	if(myNode.left != null)
         		nodeStack.push(myNode.left);

         }


	}

}