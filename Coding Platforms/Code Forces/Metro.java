import java.util.*;
class Metro{

	/*NOT WORKING*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();

		int startTrack[] = new int[start];
		int endTrack[] = new int[start];
		
		for (int i=0; i<start; i++ ) {
			startTrack[i] = s.nextInt();
		}

		for (int i=0; i<start; i++ ) {
			endTrack[i] = s.nextInt();
		}

		findWay(start, end, startTrack, endTrack);
	}

	static void findWay(int start, int end, int[] startTrack, int[] endTrack){
		
		if(startTrack[0] == 0){		//Base conditon
			System.out.println("NO");
			return;
		}
		else{

			if(startTrack[end-1] == 1){
				System.out.println("YES");
			
			}else{

				if(endTrack[end-1] == 0){
					System.out.println("NO");
					return;
				}
				else{

					boolean flag = false;
					for (int i = end-1; i <= start; i++){
	                    System.out.println(startTrack[i]);
	                    System.out.println(endTrack[i]);

	                    if (startTrack[i] == 1 && endTrack[i] == 1){
	                        flag = true;
	                    }
	                }
	                if(flag) 
	                	System.out.println("YES") ;
	                else 
	                	System.out.println("NO") ;

				}
			}			
		}
	}
}
/*
WORKING

#include <bits/stdc++.h>
using namespace std ;
const int Maxn = 1000 + 10 ;

int a[Maxn], b[Maxn] ;

int main (){
    int n, s;
    scanf("%d%d", &n, &s) ;
    for (int i = 1; i <= n; i++) cin >> a[i] ;
    for (int i = 1; i <= n; i++) cin >> b[i] ;
    if (a[1] == 0) {
        puts("NO") ;
        return 0 ;
    }
    else {
        if (a[s] == 1){
            puts("YES") ;
        }
        else {
            if (b[s] == 0){
                puts("NO") ;
                return 0 ;
            }
            else {
                int flag = 0 ;
                for (int i = s; i <= n; i++){
                    if (a[i] == 1 && b[i] == 1){
                        flag = 1 ;
                    }
                }
                if (flag) puts("YES") ;
                else puts("NO") ;
            }
        }
    }
    return 0 ;
}
*/