/*You are given a string consisting of alphanumeric letters.,The problem is to find the good number. A good number is a number divisible by itself and one(Prime number), so you have to count all the good numbers and in that set of good number you have to find the maximum good number.

Input: The first line of input contains an integer T denoting the number of test cases. Each line of test case contains a string consisting of lowercase letters and digits.

Output: For each test case, print two space separated integers, denoting the count, all the primes and the maximum prime number in the string.

Constraints:

1 ≤ T ≤ 100

1 ≤ string length ≤ 10^5

0 ≤ value of numbers in string ≤ 10^7

If the number is not a good number print "-1"

SAMPLE INPUT 
2
sd5f7a9s4d2fas2                                                  
dr15t17rq7tu29lu11yk4
SAMPLE OUTPUT 
4 7
4 29
Explanation
Test case 1: The numbers hiding in string are [5,7,9,4,2,2]. Count of good number: 4, Maximum good number: 7

Test case 2: the numbers hiding in string are [15,17,7,29,11,4]. Count of good number:4, Maximum good number : 29*/

import java.util.*;
 
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
 
class FastScanner {
    
    private InputStream mIs;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
 
    public FastScanner() {
        this(System.in);
    }
 
    public FastScanner(InputStream is) {
        mIs = is;
    }
 
    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = mIs.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }
 
    public String nextLine() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndOfLine(c));
        return res.toString();
    }
 
    public String nextString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
 
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public int nextInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    public boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    
    }   
 
}
class DecodeString {
    static long x,y;
    static final int max=10000002;
    static boolean[] sieve;
    
    DecodeString(){ 
    
        x=1;y=0;
        sieve= new boolean[max+1];
        Arrays.fill(sieve ,true);
        
    }
    
    static void Sieve()
    {
        //False means not a prime ,true means is a prime
        sieve[0]=sieve[1]=false;
        int limit=max-1;
        for(int i=2;i<=limit;i++)
        {
            if(sieve[i]==true)
            {
                for(int j=2;j<=limit;j++)
                {
                     if(j*i>limit)   break;
                     else  sieve[i*j]=false;
                    
                }
            }
        }
        
        
    }
    static boolean isPrime()
    {
        return true;
    }
    static int legendre(int n ,int p)
    {
        //Exponenet of prime p in n!
        int exp=0,pr=p;
        while(pr<=n)
        {
            exp+=n/pr;
            pr=pr*p;
            
        }
        return exp;
        
    }
    static long gcd(long a ,long b)
    {
        if(b==0)
            return a;
        return gcd(b ,a%b);
    }
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a;
            a = b;
            b = c % b;
        }
        return a;
    }
    static long expo(long x ,long n ,long mod)
    {
        long res=1;
        while(n>0)
        {
            if(n%2==1)
                res=(res*x)%mod;
            x=(x*x)%mod;
            n=n/2;
        }
        return res%mod;
    }
    
    static long fermat(long a ,long m)
    {
        return expo(a,m-2,m)%m;
    }
    
    static void extendedEuclidean(long a ,long m)
    {
        if(m==0)
        {
            x=1;
            y=0;
        }
        else
        {
            extendedEuclidean(m,a%m);
            long temp=x;
            x=y;
            y=temp-(a/m)*y;
        }
        
    }
    
    static long EuclidInverse(long a ,long m)
    {
        extendedEuclidean(a ,m);
        return (x%m+m)%m;
    }
    static void fun(String f)
    {
        char[] c= f.toCharArray();
        int number=0,count=0,max=0;
        int ten=1;
        for(int i=c.length-1;i>=0;i--)
        {
            if(!(c[i]>='0'&&c[i]<='9'))
            {
              //  System.out.println(number+" n");
                //if(number<=1000*1000*10) 
                if(sieve[number]) 
                {
                count++;
                max=Math.max(max ,number);
                }
                number=0;ten=1;
            }
            else
            {
                if(number>1000*1000*10) continue;
                number+=ten*(c[i]-48);
                ten=ten*10;
            }
        }
        if(sieve[number])
        {
                count++;
                max=Math.max(max ,number);
        }
        if(count==0)System.out.println("0 -1");
        else
        System.out.println(count+" "+max);
    }
    public static void main(String args[] ) throws Exception {
        FastScanner s = new FastScanner();
        DecodeString test= new DecodeString();
        Sieve();
        int mod=1000000007;
        int t=s.nextInt();
        //s.nextLine();
        while(t-- >0)
        {
            String f=s.nextString();
            fun(f);
        }
      //  System.out.println('5'-48);
    }
}