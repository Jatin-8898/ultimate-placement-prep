public class Suffix  {
	public static void main(String args[]) {
		String[] a = {"asdfc", "asfc", "vdsfc", "trgfds", "egregds", "tertdfc", "rtyergds"};
		int q = 3;
		String[] p = {"dfc", "fc" , "ds"};
		int[] result = new int[q];
        int index = 0;
        for(String c : p){
           int count = 0;
            for(String s : a)
                if(c.equals(s.substring(s.length() - c.length(), s.length())))
                    count++;
            result[index++] = count;    
        }
        for(int i: result)
            System.out.print(i+ " ");
	}
}