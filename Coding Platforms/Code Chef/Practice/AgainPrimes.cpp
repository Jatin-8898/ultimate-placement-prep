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
#define debug(x)        cout << x << endl
#define flash   ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define all(c) c.begin(),c.end()
using namespace std;

const int N=1e6+10;

vector<bool> isprime(N+1, 1);

vector<bool> calculate(){

	isprime[0] = isprime[1] = false;
	for (int i = 2; i * i <= N; ++i) {
		if (isprime[i]) {
			for (int j = i * i; j <= N; j += i) {
				isprime[j] = false;
			}
		}
	}

    for(int i=1;i<=100;i++)
        return isprime;
}


vector<bool> a = calculate();

int main() {
	flash;
	ll t, n, i, num=0;
	cin >> t;
	
	while(t--){
	    cin >> n;
        string s, s1;
        
        for(i=n; i>=2; i--)
        {
            s = to_string(i);
            int c = 0;
            
            sort(all(s));
        	
        	do{
            	for (auto c : s)
                    num = num * 10 + (c - '0');
        
                if(a[num])
                {
                    debug(i);
                    c = 1;
                    break;
                }
            
        	    
        	}while(next_permutation(all(s)));
        	
                
            if(c==1)
                break;
        }
    }
	return 0;
}
