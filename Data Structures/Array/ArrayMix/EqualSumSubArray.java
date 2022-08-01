public class EqualSumSubArray { 
	static int findPivot(int[] arr) {
	  int l = 0;
	  int r = arr.length-1;
	  int lsum = arr[l];
	  int rsum = arr[r];
   
	  while(l < r) {
		//System.out.println("l: "+ l + " "+ r);	
		if(lsum == rsum && l+2==r){
		  return l+1;
		}	
		if(lsum < rsum){
		  lsum += arr[++l];
		  //System.out.println("lsum "+lsum);	
		}else{
		  rsum += arr[--r];
		 // System.out.println("rsum "+rsum);
		}
	  }
   
	  return -1;  
	}
	   
	//main function
	public static void main(String args[]) 
	{ 
	  int arr[] = {2, 4, 5, 1, 2, 3}; 
	  System.out.println(findPivot(arr)); 
	} 
  }