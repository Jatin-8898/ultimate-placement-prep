import java.util.*;

class AgainPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int a = s.nextInt();
            if (isNumberPrime(a)) {
                System.out.println(a);

            } else if(!isNumberPrime(a)){
                Integer rev[] = intToArray(a);
                List<Integer> l = Arrays.asList(rev);
                Collections.shuffle(l);

                System.out.println(l);

                Integer isPrime[] = new Integer[a];
                isPrime[0] = 0;
                isPrime[1] = 0;
                for (int i = 0; i < a; i++) {
                    isPrime[i] = 1;
                }
                sieve(a, isPrime);
                
                for (int i = 1; i < a; i++) {
                    if (isPrime[i] == 1) {
                        System.out.print(i + " ");
                    }
                }
            }

            t--;
        }
        s.close();
    }

    private static Integer[] intToArray(int n){

        int j = 0;
        int len = Integer.toString(n).length();
        Integer[] arr = new Integer[len];

        while(n!=0){
            arr[len-j-1]=n%10;
            n=n/10;
            j++;
        }
        return arr;
    }

    private static boolean isNumberPrime(int n) {
        // Assumes that n is a positive natural number
        // We know 1 is not a prime number
        if (n == 1) {
            return false;
        }

        int i = 2;
        // This will loop from 2 to int(sqrt(x))
        while (i * i <= n) {
            // Check if i divides x without leaving a remainder
            if (n % i == 0) {
                // This means that n has a factor in between 2 and sqrt(n)
                // So it is not a prime number
                return false;
            }
            i += 1;
        }
        // If we did not find any factor in the above loop,
        // then n is a prime number
        return true;
    }

    private static void sieve(int n, Integer[] isPrime) { // eg 10
        int i = 2;

        while (i * i <= n) {
            // If we already crossed out this number, then continue
            if (isPrime[i] == 0) {
                i++;
                continue;
            }

            int j = 2 * i;

            while (j < n) {
                // Cross out this as it is composite
                isPrime[j] = 0;
                // j is incremented by i, because we want to cover all multiples of i
                j += i;
            }
            i++;
        }
    }
}