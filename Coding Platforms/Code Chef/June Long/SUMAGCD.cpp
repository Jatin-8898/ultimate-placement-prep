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
#define flash ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;


int main() {
	flash;
	int t, n;
	cin >> t;
	
	while(t--){
	    cin >> n;
	    
	    int arr[n];
	    for(int i=0; i<n; i++){
	        cin >> arr[i];
	    }
	
    	int first=INT_MIN,second=INT_MIN;
        for (int i = 0; i < n ; i ++) 
        { 
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        }
        if(second == INT_MIN)
            cout << first * 2 << endl;
        else
        {
            int g=0,
                gsec=0,
                gfi=0;
                
            for(int i=0; i<n; i++)
            {
                if(arr[i] != first && arr[i] != second)
                    g = __gcd(g, arr[i]);
            }
            
            gfi = __gcd(g, first);
            gsec = __gcd(g, second);
            
            
            int res = max( (first + gsec),  (second + gfi));
            cout << res << endl;
        }
	}
	return 0;
}
	    
/* ANOTHER APPROACH

    - Use set to store the unique elements from all the given elements.
    - Find the GCD of all the unique elements(say X) except the last two elements i.e. maximum and second maximum elements.
    - now find max from GCD (X, second maximum)+ maximum and GCD (X, maximum)+ second maximum.
    - That’s it, you have got the maximum element as the ans


#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,x;
		cin>>n;
		set<int> s;
		for(int i=0; i<n; i++)
		{
			cin>>x;
			s.insert(x);
		}
		vector<int> v;
		int l=s.size();
		for(auto it=s.begin(); it!=s.end(); it++)
		{
			v.push_back(*it);
		}
		if (l==1)
			cout<< 2*v[0] <<endl;
		else if (l==2)
			cout<< v[0] + v[1] <<endl;
		else
		{
			int max1 = v[l-1],
                max2 = v[l-2];

			int rgcd=v[0]; // rgcd=gcd of no. except max1 & max2
			
            for(int i=1; i<l-2; i++)
			{
				rgcd=__gcd(rgcd,v[i]);
			}
			cout<< max(__gcd(rgcd,max1)+max2, __gcd(rgcd,max2)+max1)<<endl;
		}
	}
}


 */