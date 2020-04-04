#include <bits/stdc++.h>

using namespace std;

int main() 
{
    long long n,i,j,count,x;
    
    scanf("%lld",&n);
    
    count = 0;
    for(i=1; i<=sqrt(n); i++)
    {
        if((n % i) == 0)
        {
            count++;
            for(j=2; j<=sqrt(i); j++)
            {
                if((i % (j * j)) == 0)
                {
                    count--;
                    break;
                }
            }
            if(i == 1)
                count--;

            printf("%lld %lld\n",i,count);
            
            x = n / i;
            if(x != i)
            {
                count++;
                for(j=2; j<=sqrt(x); j++)
                {
                    if((x % (j*j))==0)
                    {
                        count--;
                        break;
                    }
                }
            }
            printf("%lld %lld\n",x,count);
        }
    }

    printf("%lld\n",count);

    return 0;
}