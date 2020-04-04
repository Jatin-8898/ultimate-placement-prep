#include<bits/stdc++.h>
using namespace std;

long long solve(vector<int> A,int N) {
   //Write your code here
   
    long long prod = 0; 
    if (N < 2) 
		return (long long)A[0]; 

	if (N == 2) {
		prod =  A[0] * A[1];
		return prod; 
	} 
	int max_pos_a = INT_MIN, 
	    max_pos_b = INT_MIN; 

	int max_neg_a = INT_MIN, 
	    max_neg_b = INT_MIN; 

	for (int i = 0; i < N; i++) { 
		
		if (A[i] > max_pos_a) {     
			max_pos_b = max_pos_a; 
			max_pos_a = A[i]; 
		
		} else if (A[i] > max_pos_b) 
			max_pos_b = A[i]; 

		if (A[i] < 0 && abs(A[i]) > abs(max_neg_a)) { 
			max_neg_b = max_neg_a; 
			max_neg_a = A[i]; 

		} else if(A[i] < 0 && abs(A[i]) > abs(max_neg_b)) 
			max_neg_b = A[i]; 
	} 
	if (max_neg_a*max_neg_b > max_pos_a*max_pos_b) {
		prod =  max_neg_a * max_neg_b;
	    return prod;
	}else{
	    prod =  max_pos_a * max_pos_b;  
	    return prod;
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