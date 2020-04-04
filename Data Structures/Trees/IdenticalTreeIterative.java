import java.util.*; 
class Node{
	int data;
	Node left, right;

	Node(int x){
		data = x;
		left = right = null;
	}
}

/*The idea is to use 2 queues and enqueue the elements in the queue
	
	If the front of q1 and front of q2 matches then poll the elements from q1,q2
	Continue doing this stuff until all the elements of the tree gets exhausted.

*/



class IdenticalTreeIterative{


	Node root1,  root2;

	private boolean identicalTrees(Node a, Node b){

		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();

		if(a == null && b == null)		//base Case
			return true;

		if(a == null || b == null)		//if 1 is empty and other is not
			return false;

		/*Push the root nodes of both trees in respective queues*/
		q1.add(a);
		q2.add(b);

		while(!q1.isEmpty() && !q2.isEmpty()){		//Until both  gets exhauted

			Node n1 = q1.peek();
			Node n2 = q2.peek();

			if(n1.data != n2.data){		//If the data doesnt matches
				return false;
			}

			q1.poll();
			q2.poll();

			/*FOR LEFT SUBTREE*/
			if(n1.left !=null && n2.left !=null){			/* Enqueue left children of both nodes */
				q1.add(n1.left);
				q2.add(n2.left);
			
			}else if (n1.left !=null || n2.left !=null)	/*If 1 of them is empty then return false*/ 
            	return false; 



			/*FOR RIGHT SUBTREE*/
            if(n1.right !=null  &&  n2.right !=null){			/* Enqueue right children of both nodes */
				q1.add(n1.right);
				q2.add(n2.right);
			
			}else if (n1.right !=null  ||  n2.right !=null)	/*If 1 of them is empty then return false*/ 
            	return false; 
	
		}
		return true;
				
	}



	public static void main(String[] args) {
		IdenticalTreeIterative tree = new IdenticalTreeIterative(); 
   
        tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(2); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(5); 
   
        if (tree.identicalTrees(tree.root1, tree.root2)) 
            System.out.println("Both trees are identical"); 
        else
            System.out.println("Trees are not identical"); 
	}
}