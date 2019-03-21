import java.util.*;
public class IsOneArrayRotationOfOther{

	public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // isRotation(array1) should return 3.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array2) should return 3.
        int[] array2 = {4, 5, 6, 7, 1, 2, 3};

        //IsOneArrayRotationOfOther obj = new IsOneArrayRotationOfOther();
        if( isRotation(array1 , array2)){
        	System.out.println("true");	
        }else{
        	System.out.println("false");	
        }
        
    }

    // Implement your solution below.
    public static boolean isRotation(int[] A, int[] B) {

        if(A.length != B.length)        //base case
        	return false;
 

        int key = A[0];
        int key_index = -1;

        for(int i=0;  i<B.length-1;  i++){
        	if(B[i] == key){
        		key_index = i;
        		break;
        	}
        }

        if(key_index == -1) //means not found so return falsse
        	return false;

        for(int i=0; i<A.length-1; i++){    //1, 2, 3, 4, 5, 6, 7     A[] array
                                            //4, 5, 6, 7, 1, 2, 3     B[]        	           
            int j = (key_index + i) % A.length;

        	if(A[i]  !=  B[j]){
        		return false;
        	}
        }

       	return true;

    }
}