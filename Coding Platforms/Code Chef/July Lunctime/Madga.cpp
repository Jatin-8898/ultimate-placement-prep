#include <iostream>
#include <bits/stdc++.h>
#define ll              long long
#define ull             unsigned long long
#define rep(i,n)        for(int i=0; i<n; ++i)
#define repll(i,n)      for(ll i=0; i<n; ++i)
#define repa(i,a,n)     for(int i=a; i<n; ++i)
#define rrep(i,n,a)     for(int i=n; i>=a; --i)
#define repall(i,a,n)    for(ll i=a; i<=n; ++i)
#define rrepll(i,n,a)   for(ll i=n; i>=a; --i)
#define vi              vector<int>
#define vll             vector<ll>
#define all(v)          v.begin(),v.end()
#define pi              pair<int, int>
#define pll             pair<ll,ll>
#define GCD(a,b)        __gcd(a,b)
#define MOD             1000000007
#define INF             LLONG_MAX
#define PI              3.14159265
#define endl            "\n"
#define debug(x)        cout << x << endl
#define flash   ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;

int main() {
	flash;
	ll t, n;
	cin >> t;
	
	while(t--){
	    cin >> n;
	    
	    ll a, b;
	    ll i = 0;
	    ll sum = 0,
           odd = 0;

	    repll(i, n){
	        cin >> a;
	        sum += a;
            if(a % 2 == 1){
				odd++;
			}
	    }

	    repll(i, n){
	        cin >> b;
	        sum += b;
            if(b % 2 == 1){
				odd--;
			}
	    }

        odd = abs(odd);
		cout << (sum - odd) / 2 << endl;
	    
	}
	return 0;
}