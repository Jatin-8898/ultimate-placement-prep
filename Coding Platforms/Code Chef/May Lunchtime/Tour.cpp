#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t, n, m , k;
	cin >> t;
	
	while(t--){
	    
	    cin >> n >> m >> k;
        
        if (__gcd(n, k) == 1 && __gcd(m, k) == 1)
            cout << 1ll * n * m << '\n';
        else
            cout << "-1\n";
	}
	return 0;
}
