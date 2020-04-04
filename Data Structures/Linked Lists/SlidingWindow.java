import java.util.LinkedList;
import java.util.Deque;

class SlidingWindow{
	
	/*Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.*/
	
	public static void main(String[] args) {
		int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        /*
           12   1   78  print 78
		   1   78   90  print 90
		   78  90   57  print 90
        */
        printMax(arr, arr.length,k);		
	}

	private static void printMax(int arr[],int n, int k){
		/*Create a Double Queue that will store the indexes of the array elemnets.The queue will also store indexes of the useful elements and it will maintain the Decreasing order of the values from the front to the rear.
		arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order   */

		Deque<Integer> queue = new LinkedList<Integer>();
		int i;
		for (i=0; i<k; ++i) {
			
			//If the element is smaller remove it
			while(!queue.isEmpty()   &&   arr[i] > queue.peekLast()){
				queue.removeLast();		//Remove from rear
			}

			//Add new element at the rear of the queue
			queue.addLast(i);

		}
		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
		for (; i<n; ++i) {
			// The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[queue.peek()]+ " ");

            // Remove the elements which are out of this window
            while(!queue.isEmpty()   &&    queue.peek()  <= i-k){
            	queue.removeFirst();
            }

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while((!queue.isEmpty()) && arr[i] >= arr[queue.peekLast()])
                queue.removeLast();
             
 
            // Add current element at the rear of Qi
            queue.addLast(i);
             
        }
         
        // Print the maximum element of last window
        System.out.print(arr[queue.peek()]);
		}
	
}