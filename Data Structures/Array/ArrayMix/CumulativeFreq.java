// Java program to print the cumulativeative frequency 
// according to the order given 
class CumulativeFreq 
{ 
    static void countFreq(int a[], int n) 
    { 
        int map[] = new int[n]; 
        for (int i = 0; i < n; i++)           // Insert elements and their frequencies in hash map. 
            map[a[i]]++; 
        
        int cumulative = 0; 
        
        for(int i = 0; i < n; i++)  // traverse in the array 
        { 
            cumulative += map[a[i]];  // add the frequencies 
                
            if(map[a[i]] != 0)      // if the element has not been visited previously 
                System.out.println(a[i] + "->" + cumulative); 
                 
            map[a[i]] = 0;   // mark the hash 0 as the element's cumulative frequency has been printed 
            //System.out.println("HERE "+map[a[i]] + " "+i); 
        } 
    } 

    // Driver Code 
    public static void main(String[] args) 
    { 
        int a[] = {1, 3, 2, 4, 2, 1}; 
        int n = a.length; 
        countFreq(a, n); 
    } 
}