
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

	/*An efficient solution is to one by one insert elements in a set (A self balancing binary search tree). After inserting into set, we search elements. After we find iterator of the searched element, we move iterator to next (note that set stores elements in sorted order) to find element which is just greater.*/


 
void smallestGreater(int arr[], int n)
{
    set<int> s;
    for (int i = 0; i < n; i++) 
       s.insert(arr[i]);
 
    for (int i = 0; i < n; i++) 
    {
       auto it = s.find(arr[i]);
       it++;
       if (it != s.end())           
          cout << *it << " ";       
       else
          cout << "_ ";
     }
}
 
// Driver code
int main()
{
    int ar[] = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };
    int n = sizeof(ar) / sizeof(ar[0]);
    smallestGreater(ar, n);
    return 0;
}