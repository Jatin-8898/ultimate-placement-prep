#include<bits/stdc++.h>
using namespace std;

long long solve (vector<long long> A, int Q, long long K, int R, int L) {
   // Write your code here
   
    long long check = L-1;

    if(A[check] % K != 0){
        return -1;
    }else{

        for(check=L-1;   (check<=R-1) && ((A[check] % K) == 0);   check++){
            continue;
        }
    }
    return check;
 
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    vector<long long> A(N);
    for(int i_A=0; i_A<N; i_A++)
    {
    	cin >> A[i_A];
    }
    int Q;
    cin >> Q;
    while(Q--)
    {
         int L;
         cin >> L;
         int R;
         cin >> R;
         long long K;
         cin >> K;

         long long out_;
         out_ = solve(A, Q, K, R, L);
         cout << out_ << "\n";
    }
}