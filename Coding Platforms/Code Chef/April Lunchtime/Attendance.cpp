#include<iostream>
using namespace std;
struct name
{
    string fname;
    string lname;
};
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        name s[n];
        for(int i=0;i<n;i++)
        {
            cin>>s[i].fname;
            cin>>s[i].lname;
        }
        int a[n];

        for(int i=0;i<n;i++)
            a[i]=0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(s[i].fname == s[j].fname)
                a[i] = a[j] = 1;
            }
        }

        for(int i=0;i<n;i++)
        {    
            if (a[i]==1)
                cout<<s[i].fname<<" "<<s[i].lname<<endl;
            else 
                cout<<s[i].fname<<endl;       
        }   
    }
}