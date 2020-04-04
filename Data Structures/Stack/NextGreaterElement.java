import java.util.*;
import java.io.*;
class NextGreaterElement {
    
    public static void printNGE(long[] arr, int n) { 
        Stack<Long> s = new Stack<>(); 
        long res[] = new long[n]; 

        for (int i = n - 1; i >= 0; i--) {   // iterating from n-1 to 0  

            if (!s.empty()) {/*We will pop till we get the  greater element on top or stack getsempty*/
                while (!s.empty() && s.peek() <= arr[i]) { 
                    s.pop(); 
                } 
            } 
             /*if stack gots empty means there  is no element on right which is greater  than the current element.  if not empty then the next greater  element is on top of stack*/
            res[i] = s.empty() ? -1 : s.peek(); 

            //We will push the arr[i] in stack
            s.push(arr[i]);
        } 

        for(int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    } 
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    printNGE(arr, n);
		}
	}
}