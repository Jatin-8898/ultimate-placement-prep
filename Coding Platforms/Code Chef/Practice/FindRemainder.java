import java.util.*;
class FindRemainder{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t > 0){
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.println(a%b);
			t--;
		}
	}
}