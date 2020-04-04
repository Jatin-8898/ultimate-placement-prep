#include<bits/stdc++.h>
using namespace std;


int fact(int n) 
{ 
	if (n <= 1) 
		return 1; 
	return n * fact(n - 1); 
} 

int nPr(int n, int r) 
{ 
	return fact(n) / fact(n - r); 
}


int cal(int n, int k){
    int res = 1;
    
    if(k > n-k){
        k = n-k;  
    }
    
    for(int i=0; i<k; ++i){
        res *= (n-i);
        res /= (i+1);
    }
    return res;
}

int solve (int M, int N) {
   // write your code here
   //int ans  = (3!) / (M!) * ((3 - M)!);
   //int val = (3!)/(N!)(3-N)!;
   //int res = ans * ans - val;
   


    int ans  = nPr(3, N);
    if(N == 1){
        int ans  = nPr(3, N) - nPr(3, M);
        return (ans * 2)  % 10000000;
    }
    else if(N==M){
        return ans + 1  % 10000000;
    }
    else if(N>M){
        return ans + M  % 10000000;    
    }
    return ans  % 10000000;
   
   
   
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    int M;
    cin >> M;

    int out_;
    out_ = solve(M, N);
    cout << out_;
}
