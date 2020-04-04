#include<bits/stdc++.h>
using namespace std;

long long solve(vector<int> a,int n) {
   //Write your code here
   /*  int i;
    int largest1 = a[0];
   
    for (i = 0; i < n; i++) {
        if (a[i] > largest1) {
            largest1 = a[i];
            cout << largest1 << " L1 ";
        }
    }
    
    int largest2 = a[0];
    
    for (i = 1; i < n; i++) {
        if (a[i] > largest2 && a[i] < largest1)
            largest2 = a[i];
            cout << largest2 << " L2 ";
    } */

    for (int i = 0; i < n; i++)
    {
        for (int  j = 0; j < n; j++)
        {
            
            

        }
        
    }
    
   
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    
    for(int t_i=0; t_i<T; t_i++)
    {   int N;
        cin >> N;
        vector<int> A(N);
        for(int i_A=0; i_A<N; i_A++)
        {
        	cin >> A[i_A];
        }
        long long out_;
        out_ = solve(A,N);
        cout << out_;
        cout << "\n";
    }
}