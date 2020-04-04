#include <iostream>
#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int mmax(int a[], int  n){
	int k =0;
	
	for(int i=1; i<n; i++){
		if(a[i] > a[k])
			k = i;
	}
	return k;
}

int main() {
	// your code goes here
	int n,k;
	cin>>n>>k;
	int a[n];
	
	for(int i=0; i<n; i++){
		cin>>a[i];
	}
	
	int sum = 0;
	
	for(int i=0; i<k; i++){
		int j = mmax(a,n);
        cout << j << ":j " << endl;
		a[j] = ceil(double(a[j])/2);
        cout << a[j] << ":a[j] "<< endl;
	}
	
	for(int i=0; i<n; i++){
		sum += a[i];
        cout << "sum " << sum;
	}
	
	cout << sum << endl;
	
	return 0;
}