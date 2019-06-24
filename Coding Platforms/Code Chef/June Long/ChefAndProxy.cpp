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
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		int l;
		cin>>l;
		cin>>s;
		int a[l]={0};

		int c1=0,c2=0;  // c1=count of days of actual presence || c2=days on which proxy marked
		
        int r=(0.75 * l); // r=required days for 75%
		
        if(l % 4 != 0)
			r+=1;
		
        for(int i=0; i<l; i++)
		{
			if (s[i]=='P')
			{
				a[i]=1;
				c1++;
			}
		}

		if (c1>=r)
			cout<<0<<endl;
		else
		{
			for (int i=2; i<l-2; i++)
			{
				if ((a[i-1]==1||a[i-2]==1) && (a[i+1]==1||a[i+2]==1) && (a[i]==0) && (c1<r))
				{
					s[i]='P';
					c1++;
					c2++;
				}
				if (c1==r)
					break;
			}
			if (c1>=r)
				cout<< c2 <<endl;
			else 
				cout<<-1<<endl;
		}
	}
} 