#include <iostream>
#include <bits/stdc++.h>
#define ll              long long
#define ull             unsigned long long
#define fn(i,n)         for(int i=0; i<n; i++)
#define fa(i,a,n)       for(int i=a; i<n; i++)
#define rfn(i,n,a)      for(int i=n; i>=a; i--)
#define fll(i,a,n)      for(ll i=a; i<=n; i++)
#define rfll(i,n,a)     for(ll i=n; i>=a; i--)
#define vi          vector<int>
#define vll         vector<ll>
#define all(v)      v.begin(),v.end()
#define pi          pair<int, int>
#define pll         pair<ll,ll>
#define GCD(a,b)    __gcd(a,b)
#define MP          make_pair
#define PB          push_back
#define PF          push_front
#define MOD         1000000007
#define INF         LLONG_MAX
#define PI          3.14159265
#define endl        "\n"
#define debug(x)    cout << x << endl
#define flash   ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;

int main() {
	flash;
	int t, n, k;
	cin >> t;
	
	while(t--){
	    cin >> n >> k;
	    int a[n];
	    
	    fn(i,n)
	        cin >> a[i];

        int curr=0;
        for(int i=0; i<k; i++)
        {
            curr = curr ^ a[i];
        }
        int maxx = curr;

        for(int i=k; i<n; i++)
        {
            curr = curr ^ a[i-k];
            debug(curr);
            
            curr = curr ^ a[i];
            cout << " a[i] " ; debug(curr);
            
            maxx = max(curr, maxx);	
        }
        debug(maxx);

	}
	return 0;
}
	