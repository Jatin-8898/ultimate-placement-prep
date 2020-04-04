/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GroupAnagrams {
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int t=Integer.parseInt(st.nextToken());
		
		while(t-->0){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            
            String s[]=new String[n];
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                s[i]=st.nextToken();
            }
            
            
            HashMap<String,Integer> h = new HashMap<>();
            for(int i=0;i<n;i++){
            
            char ch[] = s[i].toCharArray();
                Arrays.sort(ch);
                String str=new String(ch);
            
                if(!h.containsKey(str)){
                    h.put(str,1);
                }else{
                    h.put(str,h.get(str)+1);
                }
            }
		     
            ArrayList<Integer> ans=new ArrayList<>();
            for(String i : h.keySet()){
                ans.add(h.get(i));
            }
		     
		    Collections.sort(ans);
		    for(int i : ans){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}