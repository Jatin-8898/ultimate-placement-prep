#include<bits/stdc++.h>
using namespace std;

struct comp{
    bool operator() (string l, string r){
        if(l+r > r+l){
            return true;
        }else
        {
            return false;
        }      
    }
};

int main(){
    string a[10001];
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a[i];
    }
    sort(a, a+n , comp());

    for (auto &&i : a){
        cout <<  i;
    }
    
}