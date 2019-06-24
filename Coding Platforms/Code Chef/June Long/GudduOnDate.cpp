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

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll t, sum, i;
    string s;
    cin >> t;
    while(t--)
    {
        cin >> s;
        cout << s;
        
        for(i=0, sum=0; s[i]; i++) //eg '9' to 9
            sum += (s[i] - '0');//converts an int in charform into an actual int
            
        //debug(sum);
        
        cout << (10 - sum % 10) % 10 << "\n";
    }
    return 0;
}
