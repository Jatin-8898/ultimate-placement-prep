#include<bits/stdc++.h>
using namespace std;

int main(){

	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	
	int t;
	cin>>t;

	while(t--){
		string s;
		cin>>s;

		int idx =-1;
		int flag = 0;
		bool change = false;
		
		
		if(s.length()==1)
			cout<< s << "\n";
	
		else{

			if( s[0] - '0' > 1){    // if greater than 1 eg 23
			    idx = 0;
				flag = 2;
			}

			for(int i=1; i<s.length(); ++i){ // eg 171
			
            	if(flag ==0){       // eg 604  if '0' skip it
					if(s[i]-'0'==0)
                        continue;
					
                    else if(i < s.length() - 1){ // first time it sets flag to 2
					 	idx = i;                // next time puts 179
						flag = 2;
						
					}else{
						flag = 1;
					}

				}else if(flag==2){      // eg 23 directly append 9 in place of 3
                    if(s[i]!='9'){
						s[i]='9';
						change = true;
					}
				}
			}
		
			
			if(flag==0){
				for(int i=0;i<s.length()-1;++i){
					cout << 9;
				}
				cout<<"\n";

			}else if( flag==4)
				cout<<s<<"\n";
			
            else{           //eg 23 directly put 1 in place of 2 ans is 19
                if(change)  // then finally substracts 1, becomes 169
                    s[idx] = char(s[idx]-1);
				cout<< s <<"\n";
			}
		}
		
	}
	

}