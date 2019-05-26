#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	
	ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
	
	int t, n;
	cin >> t;
	
	int count[26], odd = 0, even= 0, odd_one = 0;
    char s[10000 + 2];
	
	while(t--){
	    cin >> s;
	    
	    odd = odd_one = even = 0;
	    
	    for(int i=0; i<26; i++){    //Fill the array with values a 0
	        count[i] = 0;
	    }
	    
	    for (int i = 0; s[i] != '\0'; i++) {    //Subtract from a & store
	        count [ s[i] - 'a']++;
	    }
	    
	    for(int i = 0; i < 26; i++){        
            
            if(count[i] == 0)               //if count 0 proceed ahead
                continue;
            
            if(count[i] % 2 == 0)           //if count 2 , even++
                even++;
            else{
                odd++;                      
                
                if(count[i] == 1)           //if count 1, odd_one++
                    odd_one++;
            }    
	    }
	    
	    if(odd > 3 || odd == 0)             //Eg code, if odd > 3 or 0 its !DPS 
	        cout<<"!DPS";
	        
        else if(odd == 1 || odd == 2)       //If it has Max 2 odds, its DPS
            cout<<"DPS";
        
        else
            cout<<"DPS";                    //if 3 odds, then also its DPS
        
        cout<<"\n";
	    
	}
	return 0;
}
