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



long long int parity(ll int y)
{
    int c = 0;
    while(y){
        c += y&1;
        y = y >> 1;
    }
    return c;
}

int main()
{   
    flash;
	ll t;
	cin >> t;
	
    while (t--)
    {
        ll int q, a[1000001] = {0};
        cin >> q;
        
        ll int E = 0, O = 0, i, x, l, j, num;
        vll s;
        
        for (i = 0; i < q; i++)
        {
        
            cin >> x;
            if(a[x] == 0)
            {
                s.push_back(x);
                a[x] = 1;
                
                if (parity(x) % 2 == 0)
                    E++;
                else 
                    O++;
        
          
                l = s.size() - 1;
                for (j = 0; j < l; j++)
                {
                
                    num = s[j] ^ x;
                    s.push_back(num);
                    a[num] = 1;
            
                    if (parity(num) % 2 == 0)
                        E++;
                    else 
                        O++;
                }
            }
            cout << E << " " << O << endl;
        }
    }

    return 0;
}