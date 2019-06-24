#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#include <list>
#include <queue>
#include <stack>
#include <map>
#include <ctime>
#include <utility>
#include <climits>
#include <cfloat>
#include <cassert>

using namespace std;
#define readint(n) scanf("%d",&n);
#define readll(n) scanf("%lld",&n);
#define readchar(n) scanf("%c",&n);
#define readf(n) scanf("%f",&n);
#define readd(n) scanf("%lf",&n);
#define readstr(s) scanf("%s",&s);
#define init(mem) memset(mem,0,sizeof(mem));
int pabs(int n){return (n>0?n:-n);}
int hcf(int a,int b){if(b==0){return a;} else{return hcf(b,a%b);}}

#define db

int main(){
    int n;
    readint(n);
    int* mem=new int[n];
    int* mem1=new int[n];


    string str;
    
    for(int i=0;i<n;i++){
        cin>>str;
        
        //Same logic of subtracting the element //eg 65-65 =  0
        mem[i] = 26*(str[0]-'A')  +   str[1]-'A';
        
        mem1[i] = mem[i];   //copy this to new array
    }

    sort( mem1,  mem1+n );

    int m,l;
    readint(m); //no of people to  be checked
    
    for(int i=0;i<m;i++){

        readint(l); //scan the people by the index

        if(mem[l]  ==  mem1[l]){    //if the index of the people in mem is == mem1 dont fine them
            printf("NO\n");
        }
        else{                       //else find them they r not sitting in the order.
            printf("YES\n");
        }
    }
    return 0;
}
