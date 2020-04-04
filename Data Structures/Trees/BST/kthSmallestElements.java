/*
	NOT WORKING
*/


class Node{
		
	int data;
	Node left,right;
	int lCount;
	int sum ;

	Node(int item){
		data = item;
		left = right = null;
		lCount = 0;
		sum = 0;
	}

}

class kthSmallestElements{
	
	Node root;

	// function return sum of all element smaller than and equal to Kth smallest element 
	void ksmallestElementSumRec(Node root, int k , int temp_sum) 
	{ 
	    if (root == null) 
	        return ; 
	  
	    // if we fount k smallest element then break the function 
	    if ((root.lCount + 1) == k) 
	    { 
	        temp_sum += root.data + root.sum ; 
	        return ; 
	    } 
	  
	    else if (k > root.lCount) 
	    { 
	        // store sum of all element smaller than current root ; 
	        temp_sum += root.data + root.sum; 
	  
	        // decremented k and call right sub-tree 
	        k = k -( root.lCount + 1); 
	        ksmallestElementSumRec(root.right , k , temp_sum); 
	    } 
	    else // call left sub-tree 
	        ksmallestElementSumRec(root.left , k , temp_sum ); 
	} 




	// Wrapper over ksmallestElementSumRec() 
	int ksmallestElementSum(Node root, int k) 
	{ 
	    int sum = 0; 
	    ksmallestElementSumRec(root, k, sum); 
	    return sum; 
	} 


	public static void main(String[] args) {
		/* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
 		kthSmallestElements tree = new kthSmallestElements(); 
 		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        int k = 3;

        System.out.println(" kth Smallest Element Sum: "); 
        System.out.println(tree.ksmallestElementSum(tree.root,  k)); 	
	}
}