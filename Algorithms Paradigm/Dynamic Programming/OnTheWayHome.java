public class OnTheWayHome {
    
    // Assusming the dimensions m and n are non-negative integers
    private int numWays(int m, int n){
        int[][] ways = new int[m][n];
        
        // Number of ways to reach bottom right corner from last column of grid is 1
        for(int i = 0; i <= m - 1; i++){
            ways[i][n - 1] = 1;
        }
        
        // Number of ways to reach bottom right from corner last row of grid is 1 too
        for(int j = 0; j <= n - 1; j++){
            ways[m - 1][j] = 1;
        }
        
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                ways[i][j] = ways[i][j + 1] + ways[i + 1][j];
            }
        }
        
        return ways[0][0];
    }

    public static void main(String[] args) {
        OnTheWayHome otwh = new OnTheWayHome();
        System.out.println("The number of unique ways to reach our home in a 4X3 grid is: " + otwh.numWays(4, 3));
    }

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        