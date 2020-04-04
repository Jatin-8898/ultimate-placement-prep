#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
	struct Node *left,*right;
};

//utility function to create a new node
Node* newNode(int data){
	Node *temp = new Node;
	temp->data = data;
	temp->left = temp->right = NULL;
	return (temp);
}




void printPathsUtil(Node *current,int sum,int sum_so_far, vector<int> &path){

	if(current == NULL)
		return;

	sum_so_far = sum_so_far + current->data;

	//add the value to the path
	path.push_back(current->data);

	//print the required path
	if(sum_so_far == sum){
		cout<<"PATH FOUND:";
		for (int i = 0; i < path.size(); i++){

			cout << path[i] << " ";
		}
		cout<<endl;
	}


	//ifthe left child exists
	if(current->left != NULL)
		printPathsUtil(current->left,sum, sum_so_far, path);

	//ifthe right child exists
	if(current->right != NULL)
		printPathsUtil(current->right,sum, sum_so_far, path);

	// Remove last element from path
    // and move back to parent
    path.pop_back();
}



void printPaths(Node *root ,int sum){
	std::vector<int> path;
	printPathsUtil(root,sum,0,path);
}

// Driver program
int main ()
{
    /*   10
       /     \
     28       13
           /     \
         14       15
        /   \     /  \
       21   22   23   24 */
    Node *root  = newNode(10);
    root->left  = newNode(28);
    root->right = newNode(13);
 
    root->right->left   = newNode(14);
    root->right->right  = newNode(15);
 
    root->right->left->left   = newNode(21);
    root->right->left->right  = newNode(22);
    root->right->right->left  = newNode(23);
    root->right->right->right = newNode(24);
 
    int sum = 38;
 
    printPaths(root, sum);
 
    return 0;
}