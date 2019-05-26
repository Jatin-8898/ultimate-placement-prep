#include <bits/stdc++.h>
#include <iostream>
using namespace std;
#define MAX 10000000
#define ll long long int
#define NIL -1


ll Prime(ll n)
{
    ll product = 1;
 
    // Handle prime factor 2 explicitly so that can optimally handle other prime factors.
    if (n % 2 == 0) {
        product *= 1;
        while (n % 2 == 0)
            n = n / 2;
    }
 
    // n must be odd at this point. So we can skip one element (Note i = i + 2)
    for (int i = 3; i <= sqrt(n); i = i + 2) {
        // While i divides n, print i and divide n
        if (n % i == 0) {
            product = product * (i-1);
            while (n % i == 0)
                n = n / i;
        }
    }
 
    // This condition is to handle the case when n is a prime number greater than 2
    if (n > 2)
        product = product * (n-1);
 
    //cout <<" PRODUCT " << product << endl;
    return product;
}


//This recursive function simply returns the prime number + 1
ll specialFun(ll n){
    
    ll r = Prime(n);
    
    if(r==0) 
        return 1;
    if(r==1) 
        return 2;
    else
        return specialFun(r)+1;
}

int main() {
	// your code goes here
	ll q;
	cin >> q;
	while(q--){
        ll n;
	    cin >> n;
        ll result= specialFun(n);
        cout<< result << endl;    
	}
	return 0;
}


