import java.util.*;

class SockMerchant{
	
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();		
	}

    /*The idea is to use Set and then add the elements one by one and if same found incr the pair 
    count and rmove the element since we want in pairs of 2*/
	static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        
        Set<Integer> color = new HashSet<Integer>();
        
        for(int i=0; i<ar.length; i++){
            
            if(!color.contains(ar[i])){         //When first time not in set add it.
                color.add(ar[i]);           
            
            }else{
                pairs++;                        //We found a pair so incr & rem that element
                color.remove(ar[i]);
            }
        }
        
        return pairs;

    }
}