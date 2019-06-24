#include <iostream>
#include<bits/stdc++.h>
#define ll long long
#define ull unsigned long long
#define FI(i,a,n) for(int i=a; i<=n; i++)
#define RFI(i,n,a) for(int i=n; i>=a; i--)
#define FLL(i,a,n) for(ll i=a; i<=n; i++)
#define RFLL(i,n,a) for(ll i=n; i>=a; i--)
#define vi vector<int>
#define vll vector<ll>
#define all(v) v.begin(),v.end()
#define pll pair<ll,ll>
#define pi pair<int, int>
#define GCD(a,b) __gcd(a,b)
#define MP make_pair
#define PB push_back
#define PF push_front
#define LB lower_bound
#define UB upper_bound
#define debug(x) cout << x << endl
#define MOD 1000000007
#define INF LLONG_MAX
#define PI 3.14159265
#define endl "\n"
using namespace std;


int main() {
	
	ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	
	int t, n, k, x, sum, newSum;
	cin >> t;
	
	while(t--){
	    cin >> n;
	    
	    int a[n];
	    for(int i=0; i<n; i++){
	        cin >> a[i];
	        sum += a[i];
	    }
	    
	    cin >> k >> x;
	    
	    for (int i = 0; i < n; i++) {
	        
            while(k--){

                newSum = a[i] ^ x;

                if( newSum+sum > sum)
                    sum = newSum+sum;
            }

	    }
	
	    cout << sum << endl;
	}
	return 0;
}