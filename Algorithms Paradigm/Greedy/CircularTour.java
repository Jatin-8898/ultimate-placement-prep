public class CircularTour{
	/*Find the first circular tour that visits all petrol pumps
	Suppose there is a circle. There are n petrol pumps on that circle. 
	You are given two sets of data.

	1. The amount of petrol that every petrol pump has.
	2. Distance from that petrol pump to the next petrol pump.

	Calculate the first point from where a truck will be able to complete the circle 
	(The truck will stop at each petrol pump and it has infinite capacity). 
	Expected time complexity is O(n). Assume for 1 litre petrol, the truck 
	can go 1 unit of distance.
	*/


	static class petrolPump{
		int petrol;
		int distance;

		//Constructor
		petrolPump(int petrol,int distance){
			this.petrol = petrol;
			this.distance = distance;
		}

	}

	//This functions returns the Starting Point if there is soln else returns -1
	static int printTour(petrolPump a[],int n){
		int start = 0;
		int end = 1;
		int current_petrol = a[start].petrol - a[start].distance;
		

		// If current amount of petrol in truck becomes less than 0, then
        // remove the starting petrol pump from tour
		while(end!=start || current_petrol < 0){

			// If current amount of petrol in truck becomes less than 0, then
            // remove the starting petrol pump from tour
			while(current_petrol < 0 && start!=end){

				// Remove starting petrol pump. Change start
				current_petrol -=a[start].petrol - a[start].distance;
				start = (start+1) % n;

				 // If 0 is being considered as start again, then there is no
                // possible solution
				if(start==0)
				return -1;			
			}

			//Add a petrol pump to current tour
			current_petrol +=a[end].petrol -a[end].distance;
			end = (end+1)%n;
		}
		return start;		
	}




	public static void main(String[] args) {
		petrolPump[] arr = {new petrolPump(6, 4),
                            new petrolPump(3, 6),
                            new petrolPump(7, 3)};

        int start = printTour(arr,arr.length);
        System.out.println( start==-1 ? "NO Solution" :"Start = "+start);                    
	}
}