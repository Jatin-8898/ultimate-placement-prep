#include<bits/stdc++.h>
typedef long long intg;
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int i,j,n;
		cin>>n;
		intg a[n],sum1,sum2,ans=0,tot=0;
		for(i=0;i<n;i++)
			cin>>a[i];
		for(i=0;i<31;i++)
		{
			sum1=0;
			sum2=0;
			for(j=0;j<n;j++)
				if(a[j] & (1<<i))
					sum1++;
				else
					sum2++;
			if(sum1>sum2)
				tot+=1<<i;
		}
		for(i=0;i<n;i++)
			ans+=a[i]^tot;
		cout<<ans<<"\n";
	}
}