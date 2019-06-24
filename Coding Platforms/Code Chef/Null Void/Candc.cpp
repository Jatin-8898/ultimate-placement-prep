#include <iostream>
#include <bits/stdc++.h>
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
using namespace std;


int main() {
	
	ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	
    int t,n;
    int ans[(int)1e7+1];
    
    ans[0] = ans[1] = 1;
    
    for(int i=2; i<=1e7; i+=2){ //eg the array becomes 1 1 3 3 15 15
        ans[i] = ans[i+1] = (ll)ans[i-1] * (i + 1) % MOD;
    }
    
    cin >> t;
    
    while(t--){
        cin >> n;
        cout << ans[n-1] << "\n";   //Return index-1 value
    }
	return 0;
}