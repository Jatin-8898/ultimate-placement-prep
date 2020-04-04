class NthFibonacci{
    public static void main(String[] args) {
        int n  = 56;
        System.out.println(getNth(n));
        
    }

    public static int getNth(int n) {
        int[] lastTwo = {0,1};
        int counter = 3;

        while(counter<=n){
            int nextFib = lastTwo[0]+lastTwo[1];
            
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n>1   ? lastTwo[1]   : lastTwo[0];
    }
}