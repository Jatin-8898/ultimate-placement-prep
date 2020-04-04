/*
The basic idea to solve the problem is to do a preorder traversal of the given tree. We also need a container (vector) to keep track of the path that led to that node. At each node we check if there are any path that sums to k, if any we print the path and proceed recursively to print each path.
*/
// C++ program to print all paths with sum k.
#include <bits/stdc++.h>
using namespace std;
 
struct Node{
	int data;
	Node *left,*right;
	
	Node(int x){
		data = x;
		left = right = NULL;
	}
};



//A utility function to print the vector from i to the end
void printVector(const vector<int> &v, int i){
	for(int j=i; j<v.size(); j++)
		cout << v[j] << " ";
	cout<<endl;
}



//This function prints all the print with sum k
void printKPathUtil(Node *root, vector<int> &path, int k){

	if(root == NULL)
		return;

	//add the current node to the path
	path.push_back(root->data);

	//Check if there is k path sum in the left sub tree
	printKPathUtil(root->left, path , k);

	//Check if there is k path sum in the right sub tree
	printKPathUtil(root->right, path , k);

	//Check if there is any k path sum that terminates at this node
	//Traverse the entire path as there can be negative values too
	int f = 0;
	for (int j = path.size()-1; j>=0; j--){

		f +=  path[j];

		//if the path sum is k print the path
		if(f == k)
			printVector(path, j);

	}

	// Remove the current element from the path
    path.pop_back();

}



//A wrapper over the printkpathUtil
void printKPath(Node *root,int k){
	vector<int> path;
	printKPathUtil(root ,path , k);
}


int main(){
	Node *root = new Node(1);
	
	root->left = new Node(3);
	root->left->left = new Node(2);
    root->left->right = new Node(1);
    root->left->right->left = new Node(1);
    root->right = new Node(-1);
    root->right->left = new Node(4);
    root->right->left->left = new Node(1);
    root->right->left->right = new Node(2);
    root->right->right = new Node(5);
    root->right->right->right = new Node(2);

     int k = 5;
     printKPath(root,k);

     return 0;
}

