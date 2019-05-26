#include<iostream>
using namespace std ;

int main()
{
    long long int t ;
    cin>>t ;
    while(t--)
    {
        long long int l,r,g  ,i, j , k , ans=0 ;
        cin>>l>>r>>g ;
        
        k = r / g ;
        
        j = (l-1)/g ;
    
        ans = k - j ;
        
        if(ans==1 && g < l ) 
            cout<< 0 <<endl ;
        else
            cout<<ans<<endl ;
    }
    return 0 ;
}