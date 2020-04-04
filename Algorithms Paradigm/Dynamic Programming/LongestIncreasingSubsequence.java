public class LongestIncreasingSubsequence {

    // Considering 'n' is not equal to 0
    private int longestIncreasingSubsequence(int[] nums, int n){

        int maxLength = 0;

        // Initializing LIS array and filling them all with 1
        int[] LIS = new int[n];
        for(int i = 0; i < n; i++){
            LIS[i] = 1;
        }

        // This double loop fills the LIS array
        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= i - 1; j++){
                if (nums[i] > nums[j] && LIS[i] < LIS[j] + 1) {
                    LIS[i] = LIS[j] + 1;
                }
            }
        }

        // This loop just finds the maximum value among all the LIS[i] values
        for(int i = 0; i <= n - 1; i++){
            if(maxLength < LIS[i]){
                maxLength = LIS[i];
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {11, 23, 10, 37, 21};
        int size = 5;
        System.out.println("The length of longest increasing subsequence for the array [11, 23, 10, 37, 21] is : " + lis.longestIncreasingSubsequence(nums, size));
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       