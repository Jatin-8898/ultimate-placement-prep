import java.util.LinkedList; 
import java.util.Queue; 

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
}

class PrintNodeBetGivenLevel{
	
	Node root;

	void printLevels(Node node , int low , int high){
		Queue<Node> Q = new LinkedList<>();

		Node marker = new Node(4);
		int level = 1;

		Q.add(node);		//enqueue the first node ie 20
		Q.add(marker);		//and enqueue the marker node.

		while(Q.isEmpty() == false){	//until the queue is empty check

			Node n = Q.	peek();		//Get the first element and 
			Q.remove();				//Remove from queue

			if(n == marker){		//Check if the end of level is reached.
				System.out.println("");
				level++;

				//Check if the marker was the last node and level is within limit
				if(Q.isEmpty() == true || level > high)
					break;


				Q.add(marker);		//Enqueue the marker for end of next level

				continue;	//if this is marker,then we dont print it and enqueue its children.

			}

			if(level >= low)		//if our level is at low or greater and low print data
				System.out.print(n.data + " ");

			if(n.left != null)		//If children exists in left subtree add it in queue
				Q.add(n.left);
			
			if(n.right != null)		//If children exists in right subtree add it in queue
				Q.add(n.right);



		}
	}


	public static void main(String[] args) {
		PrintNodeBetGivenLevel tree = new PrintNodeBetGivenLevel(); 
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
   
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14); 

        /*
					 20
					/  \
				   8	22				level 2
				  / \
				 4  12
				 	/ \
				   10  14				level 4
        */
   
        System.out.print("Level Order traversal between given two levels is "); 
        tree.printLevels(tree.root, 2, 4); 
	}


}