/*import java.util.*;

public final class Taxi{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];

		for (int i=0; i<n; i++ ) {
			arr[i] = s.nextInt();
		}

		double sum = 0;
		for(int j : arr){
			sum = sum + j;
		}
		//System.out.println(sum);

		if(sum==8)
			System.out.println(3);
		else{
			double ans = Math.ceil(sum/4);
			int ans2 = (int)ans;
			System.out.println(ans2);
		}
	}
}*/
import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s1 = 0, s2 = 0, s3 = 0, num = 0;
		for(int i = 0; i < n; i++){
			int x = input.nextInt();
			if(x == 1)  s1++;
			if(x == 2)  s2++;
			if(x == 3)  s3++;
			if(x == 4)  num++;
		}
		if(s3 > 0){
			num += s3;
			System.out.println("NUM:" +num);
			s1 -=s3;
			System.out.println("S1: "+ s1+ " s3: "+s3);
		}
		if(s2 > 0){
			if(s2 % 2 == 0){
				num = num + s2/2;
				System.out.println("FINAL :" + num);
			}
			else{
				num = num + s2/2 + 1;
				s1 -= 2;
			}
		}
		if(s1 > 0){
			if(s1 % 4 == 0){
				num = num + s1/4;
			}
			else{
				num = num + s1/4 + 1;
			}
		}
		input.close();
		System.out.println(num);
	}
}