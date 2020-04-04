// C++ program to demonstrate sorting in  vector of pair according to 1st element of pair 
#include<bits/stdc++.h> 
using namespace std; 

int main() 
{ 
	
	vector< pair <int,int> > vect;              // Declaring vector of pairs 

	int arr[] = {1 , 3, 2, 3, 5}; 
	int arr1[] = {2,6,7,4,2}; 
	int n = sizeof(arr)/sizeof(arr[0]); 

	for (int i=0; i<n; i++)     // Entering values in vector of pairs 
		vect.push_back( make_pair(arr[i],arr1[i]) ); 

	// Printing the original vector(before sort()) 
	cout << "The vector before sort operation is:\n" ; 
	for (int i=0; i<n; i++) 
		cout << vect[i].first << " "<< vect[i].second << endl; 

	
    
	sort(vect.begin(), vect.end());         // Using simple sort() function to sort 

	
	cout << "The vector after sort operation is:\n" ; 
	for (int i=0; i<n; i++) 
		// "first" and "second" are used to access  1st and 2nd element of pair respectively 
		cout << vect[i].first << " "<< vect[i].second << endl; 

	return 0; 
} 
