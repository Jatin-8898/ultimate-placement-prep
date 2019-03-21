class MergeSortedArrays{
    
    public static void main(String[] args) {
        int a[] = {20, 30, 40, 90, 110};
        int b[] = {10, 50, 60, 70};
        int[] res = merge(a,b);
        for(int i:res)
            System.out.print(i + " ");
    }


    public static int[] merge(int[] arr1, int[] arr2){
        int N = arr1.length + arr2.length;
        int[] merged = new int[N];

        int i = 0;
        int j = 0;

        for(int k = 0; k < N; k++){
            
            if(i >= arr1.length){               //When i gets exhauted then simply copy from 2nd array
                merged[k] = arr2[j++];
            }

            else if(j >= arr2.length) {         //When j gets exhauted then simply copy from 1st array
                merged[k] = arr1[i++];

            }
            
            else if(arr1[i] < arr2[j]){      //When the element in 1st array is smaller so put in merged
                merged[k] = arr1[i++];

            }    
            
            else{                           //When the element in 2nd array is smaller so put in merged 
                merged[k] = arr2[j++];
            }
        }

        return merged;
	}
    
}    