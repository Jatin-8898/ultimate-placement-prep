#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    ll t;
    cin>>t;
    while(t--)
    {
        ll n,a,b,c;
        cin>>n>>a>>b>>c;
        ll ar[3];
        ar[0]=a;
        ar[1]=b;
        ar[2]=c;
        sort(ar,ar+3);
        cout<<ar[2]<<endl;
    }
    return 0;
}
