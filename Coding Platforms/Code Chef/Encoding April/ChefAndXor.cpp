#include<bits/stdc++.h>
using namespace std;
int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long long t;
    cin>>t;
    while(t--)
    {
    	int n;
    	cin>>n;
    	long long a=0,b=0;
    	for(int i=0;i<n;i++)
    	{
    		int x;
    		cin>>x;
    		if(x%2==0)
    			a++;
    		else
    			b++;
		}
		long long ans=0,mod=1000000007;
		cout<<(a*b)%mod<<endl;
	}
}