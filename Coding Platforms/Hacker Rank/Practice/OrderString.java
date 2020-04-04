import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
3
122
12
13
1 false lexicographic
Sample Output 0

12
122
13
Explanation 0

There is only 1 key, reversal is false and the order of comparison is lexicographic. Therefore, the output is 12, 122 and 13.

Sample Input 1

3
122
12
13
1 true lexicographic
Sample Output 1

13
122
12
Explanation 1

There is only 1 key, reversal is true and comparison is lexicographic. The lexicographic order is 12, 122, 13. Therefore, the output is the reverse of this which is 13, 122, 12.

Sample Input 2

3
92 022
82 12
77 13
2 false numeric
Sample Output 2

82 12
77 13
92 022
Explanation 2

The key for ordering is 2, reversal is false and ordering is numeric. Therefore, the keys 022, 12 and 13 should be ordered as 12, 13 and 022. Therefore, the final output is 82 12, 77 13 and 92 022.
*/

public class OrderString {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<List<String>> ss = new ArrayList<>(n);
        in.nextLine();
        
        for (int i = 0; i < n; i++)
        {
            List<String> pair = new ArrayList<>(2);
            pair.add(in.nextLine());
            ss.add(pair);
        }
        
        int key = in.nextInt();
        boolean reverse = in.nextBoolean();
        String comparison = in.next();
        final boolean numeric = comparison.equals("numeric");
        
        for (List<String> pair : ss)
        {
            String s = pair.get(0);
            StringTokenizer tokenizer = new StringTokenizer(s);
            
            for (int i = 1; i < key; i++)
            {
                tokenizer.nextToken();
            }
            
            String keyString = tokenizer.nextToken();
            
            if (numeric)
            {
                int i = 0;
                
                while (i < keyString.length() - 1 && keyString.charAt(i) == '0')
                {
                    i++;
                }
                
                keyString = keyString.substring(i);
            }
            
            pair.add(keyString);
        }
        
        Collections.sort(ss,new Comparator<List<String>>()
            {
                public int compare(List<String> a, List<String> b)
                {
                    if (numeric && a.get(1).length() != b.get(1).length())
                    {
                        return Integer.compare(a.get(1).length(), b.get(1).length());
                    }
                    
                    return a.get(1).compareTo(b.get(1));
                }
             });
        
        if (reverse)
        {
            Collections.reverse(ss);
        }
        
        for (List<String> pair : ss)
        {
            System.out.println(pair.get(0));
        }
    }
}