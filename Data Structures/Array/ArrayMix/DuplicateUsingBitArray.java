import java.util.*;
import java.io.*;
import java.lang.*;

class DuplicateUsingBitArray{

	int[] arr;


	public DuplicateUsingBitArray(int n){
		// Divide by 32. To store n bits, we need n/32 + 1 integers 
		//(Assuming int is stored using 32 bits)
		arr = new int[(n>>5) + 1];
	}

	//get the valueof a bit at the given pos
	private  boolean get(int pos){
		//Divide by 32 to find position of integer.
        int index = (pos >> 5);

        // Now find bit number in arr[index]
        int bitNo  = (pos & 0x1F);
 
        // Find value of given bit number in arr[index]
        return (arr[index] & (1 << bitNo)) != 0;
	}


	// Sets a bit at given position
    void set(int pos)
    {
        // Find index of bit position
        int index = (pos >> 5);
 
        // Set bit number in arr[index]
        int bitNo = (pos & 0x1F);
        arr[index] |= (1 << bitNo);
    }

	private static void checkDuplicates(int[] arr){
		// create a bit with 32000 bits
        DuplicateUsingBitArray ba = new DuplicateUsingBitArray(320000);

        for (int i=0; i<arr.length; i++) {
        	
        	//Index in the bit array
        	int num = arr[i] - 1;	

        	//If num is already present in bit array
            if (ba.get(num))
                System.out.println("AT THIS POS THE NUM IS REPEATED: " +num +" ");
            else
            	ba.set(num);
        }
	}


	public static void main(String[] args) {
		int[] arr = {1, 5, 1, 10, 12, 10};
        checkDuplicates(arr);		
	}

}