#include <bits/stdc++.h>
#define mod 1000000007
using namespace std;
typedef long long ll;

int main()
{
    ll t;
    cin>>t;
    while(t--){
        ll n,a,b;
        cin>>n;
        vector<ll> v;
        for(int i=0;i<n;i++) { 
            cin>>a;
            v.push_back(a); 
        }
        
        sort(v.begin(),v.end());
        
        if(v[v.size()-1]==3)// if 3 occurs at end rev the arr 
            reverse(v.begin(),v.end());
            //sort(ar, ar+n, greater<int>() );
        
        for(int i=0;i<v.size();i++) //normal case
            if(v[i] > 1) 
                cout << v[i] << " ";
        
        for(int i=0;i<v.size();i++) // corner case if a[i]==1 then print all 1
            if(v[i] == 1) 
                cout << v[i] << " ";

        cout << endl;
   }
}

















