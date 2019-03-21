import java.util.ArrayList;


class Interval{
	int buy;
	int sell;
}


class MaxStockProfit{

	public static void main(String[] args) {		
		int[] a = {100, 180, 260, 310, 40, 535, 695};
		getMaxProfit(a,a.length);
	}

	private static void getMaxProfit(int[] price, int n){
		//If the array contains 1 element
		if(n == 1)
			return;

		int count = 0;
		int i = 0;
		ArrayList<Interval> sol = new ArrayList<Interval>();

		while(i<n-1){

			//Find the local minima
			while(  (i<n-1)  && (price[i+1] <= price[i]))
				i++;


			if(i  ==  n-1)		//Means we reached the end so break
				break;

			Interval e = new Interval();
			e.buy = i++;	// Store the index of minima





			//Find the Local Maxima
			while(  (i<n)  &&(price[i]  >=  price[i-1]))
				i++;

			e.sell = i-1;


			//Insert into the ArrayList
			sol.add(e);

			count++;		//Increment the count
		}
		
		if(count == 0)
			System.out.println("There is no day when buying the stock will give profit");	
		else
			for (int k=0; k<count; k++) {
				System.out.println("Buy on: "+ sol.get(k).buy + "   Sell on:" + sol.get(k).sell);
			}

		return;
	}


}

/*int minIndex = Integer.MAX_VALUE;
		int maxIndex = -1;
		int minElement=0 , maxElement=0;
		int i=0;
		int j = i+1;

		for (i=0; i<a.length-1; i++) {
			
			if(a[i] < a[i+1]){
				minIndex  = i;
				minElement  = a[i];

				if(a[j] < a[j+1]){
					j++;
				}else{
					maxIndex = j+1;
					maxElement = a[j+1];
				}

			}	

		}

		System.out.println("MIN INDEX: "+ minIndex + " MAX INDEX: "+ maxIndex);
		System.out.println("MIN Element: "+ minElement + " MAX ELE: "+ maxElement);*/