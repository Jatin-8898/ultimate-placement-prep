class FlipZeroToMaximizeOne{
	/*
	The main steps are: 
	- While nZero is no more than m: expand the window to the right (wR++) and update the count nZero; 
	- While nZero exceeds m, shrink the window from left (wL++), update nZero; 
	- Update the widest window along the way. The positions of must-flip zeros are inside the best window. 

	This solution assumes we can use m or less number of flips. 
	Time complexity = O(n), space = O(1). 


	PSEUDO CODE

	wL = 0; wR = 0; 
	nZero = 0;
	bestWindowWidth = -1;

	while(wR < A.length()){	
		//expand to the right, update '0' count:
		if (nZero <= m){
			wR++;
			if (A[wR] == '0') nZero++; 
		};

		//shrink from left, update '0' count:
		if (nZero > m){ 
			if (A[wL] == '0') nZero--;
			wL++;
		};
		
		//update best window:
		if (wR - wL > bestWindowWidth){
			bestWindowWidth = wR - wL;
			bestWR = wR;
			bestWL = wL;
		};	
	};

	*/
	public static void main(String[] args) {
		int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1}; 
		int m = 2; 
        System.out.println("Indexes of zeroes to be flipped are "); 
        findZeroes(arr, m); 
	}


	static void findZeroes(int arr[], int m) 
    { 
        // Left and right indexes of current window 
        int wL = 0, wR = 0;  
       
        // Left index  rght index and size of the widest window  
        int bestWR = 0, bestWindowWidth = 0 , bestWL = 0;  
       
        // Count of zeroes in current window 
        int zeroCount = 0;  
       
        // While right boundary of current window doesn't cross  right end 
        while (wR < arr.length) 
        { 

            // If zero count of current window is less than m, widen the window toward right 
            if (zeroCount <= m){

                if (arr[wR] == 0) 
                  zeroCount++; 
               
                wR++; 
                System.out.println("WINDOW RIGHT "+ wR);
            }

       
            // If zero count of current window is more than m, reduce the window from left 
            if (zeroCount > m) { 

                if (arr[wL] == 0)   //if found 0 at left dec the count coz we discard element from left
                  zeroCount--; 
                
                wL++; 
                System.out.println("WINDOW SHRINK "+ wL);
            } 
       

            // Update widest window if this window size is more 
            if (wR - wL > bestWindowWidth) 
            { 
                bestWindowWidth = wR - wL; 
                bestWL = wL; 
                bestWR = wR;
                System.out.println("LEFT "+ bestWL + " RIGHT " + bestWR + " BESTWINDOW "+ bestWindowWidth);
            } 
        } 
       


        // Print positions of zeroes in the widest window 
        for (int i=0; i<bestWindowWidth; i++) { 
            
            if (arr[ bestWL+i ] == 0) 		//Wen found Zero print it coz we need to flip zeroes only
               System.out.print(bestWL+i + " "); 
        } 
        
    } 
}