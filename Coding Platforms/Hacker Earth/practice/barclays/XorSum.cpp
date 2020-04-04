#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	
	ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	
	int t, n;
    cin >> n;

    int temp = 0;

    for(int i=1; i<=n; i++){
        for (int j = 1 ; j <= n; j++){
            temp += i | j;
            //cout << "TEMP " << temp << "\n";
            //cout << "i and  j" << i  << " "<< j;
        }
    }
    //int res =  2* temp;
    //res = ( n * (n+1))/2;
    int res = temp;
    //cout << "RES " << res;
    res = res % 1000000007;
    cout << res;
	return 0;
}
