#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	
	ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	
	int t, n, a, b;
	cin >> t;
	while(t--){
	    
	    cin >> a >> b;
	    
	    int min = 0, 
	        max = 0;
	        
	    max = abs(a+b) - 1;
        min = abs(a-b) + 1;
	    
	    cout << max << " " << min << "\n";
	    
	}
	return 0;
}
