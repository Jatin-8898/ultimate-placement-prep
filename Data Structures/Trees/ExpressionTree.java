import java.util.Stack;

class Node{

	Node left,right;
	char value;

	Node(char item){
		value = item;
		left = right = null; 
	}
}


class ExpressionTree{


	private static boolean isOperator(char c){
		if(c == '+' || c == '*' || c == '-' || c == '/' || c == '^' ||c == '$' ||c == '#')
			return true;

		return false;
	} 



	private static void inorder(Node root){
		if(root == null)
			return;

		inorder(root.left);
			System.out.print(root.value  + " ");
		inorder(root.right);
	}




	private static Node constructTree(char[] exp){

		Stack<Node> stack = new Stack<>();
		Node t,t1,t2;

		for (int i=0; i<exp.length; i++) {
			
			if(!(isOperator(exp[i])) ){		//If the char is an operand

				t = new Node(exp[i]);		//Create a new node and push in stack
				stack.push(t);
			
			}else{							//Pop 2 char from the stack

				t = new Node(exp[i]);

				t1 = stack.pop();
				t2 = stack.pop();

				t.right = t1;			//Make them as the children of the created node
				t.left  = t2;

				stack.push(t);
			}		
		}

		//Only the last element will be the root of the expression tree
		t = stack.peek();
		stack.pop();

		return t;
	}




	public static void main(String[] args) {
		String postfix = "ab+ef*g*-";
		char[] charray = postfix.toCharArray();

		Node root = constructTree(charray);
		inorder(root);
	}
}