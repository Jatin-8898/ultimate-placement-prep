#include <iostream>

using namespace std;

int main()
 {
	//code
	int test;
	cin >> test;
	
	while(test--){
	    
	    int n, ans = 0, curr = 1;
	    cin >> n;       //eg 10
	    
	    while(curr <= n){
	        n = n - curr;  // 9     // now 9-2 =  7     //7-3 = 4   //4-4=0   
	        curr++;         // now 2  // 3  //4
	        ans++;          //count is 1 now  //2 //3  // 4
	    }
	    
	    cout << ans << endl;        //return 4
	}
	
	return 0;
}