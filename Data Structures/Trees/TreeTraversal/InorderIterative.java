import java.util.Stack;

class Node{
	int data;
	Node left,right;

	Node (int x){
		data = x;
		left = right = null;
	}
}


class InorderIterative{
	public static void main(String[] args) {
		InorderIterative tree = new InorderIterative();
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
        tree.iterativeInorder();
	}

	void iterativeInorder(){
		iterativeInorderUtil(root);
	}

	void iterativeInorderUtil(Node node){
		
	}
}