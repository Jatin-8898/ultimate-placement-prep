import java.util.*; 
  
class Node { 
  
    int data; 
    Node left, right; 
  
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
}

class CreateBSTFromPreorderUsingStack{
	
	Node constructTree(int pre[], int size) { 	//it returns the root
  		
  		Node root  = new Node(pre[0]);	//make the first element as the root
  		Stack<Node> s = new Stack<>();
  		s.push(root);	//push the root ie 10

  		for (int i=1; i<size; ++i) {	//coz we have pushed 0th element alreayd.
  			
  			Node temp = null;			//this holds the structure for the tree.


  			//Keep on poping if the next value is greater than stack top ie s.peek().data
  			while(!s.isEmpty() && pre[i] > s.peek().data){
  				temp = s.pop();			//means this is greater element 
  			}

  			
  			if(temp != null){     //So,Make the greater value as the right child and push it on the stack
  				temp.right = new Node(pre[i]);		
  				s.push(temp.right);			
  			
  			}else{				//If the next value is less make it the left child and push it on stack
  				
  				temp = s.peek();	//get the left element eg 5
  				temp.left = new Node(pre[i]);	//put in temp.left
  				s.push(temp.left);				//push in stack
  			}
  			
  		}
  		return root; 

  	}

  	void printInorder(Node node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        	System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 



	public static void main(String[] args) {
		CreateBSTFromPreorderUsingStack tree = new CreateBSTFromPreorderUsingStack(); 
        int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
        int n = pre.length; 
        
        Node root = tree.constructTree(pre, n); 
        
        System.out.println("Inorder traversal of the constructed tree is "); 
        tree.printInorder(root); 
	}


}