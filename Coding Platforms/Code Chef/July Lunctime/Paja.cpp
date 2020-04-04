#include <iostream>
#include <bits/stdc++.h>
#define ll              long long
#define ull             unsigned long long
#define rep(i,n)        for(int i=0; i<n; ++i)
#define repa(i,a,n)     for(int i=a; i<n; ++i)
#define rrep(i,n,a)     for(int i=n; i>=a; --i)
#define repll(i,a,n)    for(ll i=a; i<=n; ++i)
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
	ll t, n, x, y, k;
	cin >> t;
	
	while(t--){
	    cin >> x >> y >> k;
	    
	    if(((x + y) / k) % 2 == 0){
	        cout << "Chef" << endl;
	    }else
	        cout << "Paja" << endl;
	
	}
	return 0;
}