#include <iostream>
#include <bits/stdc++.h>
#define ll              long long
#define ull             unsigned long long
#define fn(i,n)         for(int i=0; i<n; ++i)
#define fa(i,a,n)       for(int i=a; i<n; ++i)
#define rfn(i,n,a)      for(int i=n; i>=a; --i)
#define fll(i,a,n)      for(ll i=a; i<=n; ++i)
#define rfll(i,n,a)     for(ll i=n; i>=a; --i)
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
#define D(X)            cout <<"  "<<#X": "<< X << endl;
#define flash   ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
using namespace std;

int main() {
	flash;
	int t, n;
	cin >> t;
	
	while(t--){
	    string s;
		cin >> s;
		int n = s.length();
		int ans=0;
		fn(i,n)
			if(s[i] == '1')
				ans++;

        //answer is always WIN if number of 1's in the string is odd. 
        //Else theanswer is always LOSE.
		
		if(ans & 1)
			cout << "WIN" << endl;
		else
			cout << "LOSE" << endl;

	}
	return 0;
}