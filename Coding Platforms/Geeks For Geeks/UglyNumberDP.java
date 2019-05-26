import java.lang.Math; 
class UglyNumberDP{
/*
1 Declare an array for ugly numbers:  ugly[n]
2 Initialize first ugly no:  ugly[0] = 1
3 Initialize three array index variables i2, i3, i5 to point to 
   1st element of the ugly array: 
        i2 = i3 = i5 =0; 
4 Initialize 3 choices for the next ugly no:
         next_mulitple_of_2 = ugly[i2]*2;
         next_mulitple_of_3 = ugly[i3]*3
         next_mulitple_of_5 = ugly[i5]*5;
5 Now go in a loop to fill all ugly numbers till 150:
For (i = 1; i < 150; i++ ) 
{
    // These small steps are not optimized for good 
      readability. Will optimize them in C program 
    next_ugly_no  = Min(next_mulitple_of_2,
                        next_mulitple_of_3,
                        next_mulitple_of_5); 

    ugly[i] =  next_ugly_no       

    if (next_ugly_no  == next_mulitple_of_2) 
    {             
        i2 = i2 + 1;        
        next_mulitple_of_2 = ugly[i2]*2;
    } 
    if (next_ugly_no  == next_mulitple_of_3) 
    {             
        i3 = i3 + 1;        
        next_mulitple_of_3 = ugly[i3]*3;
     }            
     if (next_ugly_no  == next_mulitple_of_5)
     {    
        i5 = i5 + 1;        
        next_mulitple_of_5 = ugly[i5]*5;
     } 
     
}// end of for loop 
6.return next_ugly_no
*/

	/*initialize
   ugly[] =  | 1 |
   i2 =  i3 = i5 = 0;

First iteration
   ugly[1] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
            = Min(2, 3, 5)
            = 2
   ugly[] =  | 1 | 2 |
   i2 = 1,  i3 = i5 = 0  (i2 got incremented ) 

Second iteration
    ugly[2] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
             = Min(4, 3, 5)
             = 3
    ugly[] =  | 1 | 2 | 3 |
    i2 = 1,  i3 =  1, i5 = 0  (i3 got incremented ) 

Third iteration
    ugly[3] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
             = Min(4, 6, 5)
             = 4
    ugly[] =  | 1 | 2 | 3 |  4 |
    i2 = 2,  i3 =  1, i5 = 0  (i2 got incremented )

Fourth iteration
    ugly[4] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
              = Min(6, 6, 5)
              = 5
    ugly[] =  | 1 | 2 | 3 |  4 | 5 |
    i2 = 2,  i3 =  1, i5 = 1  (i5 got incremented )

Fifth iteration
    ugly[4] = Min(ugly[i2]*2, ugly[i3]*3, ugly[i5]*5)
              = Min(6, 6, 10)
              = 6
    ugly[] =  | 1 | 2 | 3 |  4 | 5 | 6 |
    i2 = 3,  i3 =  2, i5 = 1  (i2 and i3 got incremented )

Will continue same way till I < 150*/
	
	public static void main(String[] args) {
		int n = 10; 
        System.out.println(getNthUglyNo(n)); 
	}

	static int getNthUglyNo(int n){
		  int ugly[] = new int[n]; //create a new table to store the values
		  int i2 = 0, i3 = 0, i5 = 0; 
		  int next_multiple_of_2 = 2;
		  int next_multiple_of_3 = 3;
		  int next_multiple_of_5 = 5;
		  int next_ugly_no = 1; 


		  ugly[0] = 1;    //coz by default the 1st ugly number is 1

		  for(int i = 1; i < n; i++) { 

		  	//get min from 3 and 5 then from 2 and min we got.
            next_ugly_no = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5)); 
            

            ugly[i] = next_ugly_no; 	//store it in the table

            if (next_ugly_no == next_multiple_of_2) {		//if it was multiple of 2 incr 2 by 1 
               i2 = i2+1; 
               next_multiple_of_2 = ugly[i2]*2; 
            } 

            if (next_ugly_no == next_multiple_of_3) { 
               i3 = i3+1; 
               next_multiple_of_3 = ugly[i3]*3; 
            } 

            if (next_ugly_no == next_multiple_of_5) { 
               i5 = i5+1; 
               next_multiple_of_5 = ugly[i5]*5; 
            } 
        } 

        return next_ugly_no;
	}

}