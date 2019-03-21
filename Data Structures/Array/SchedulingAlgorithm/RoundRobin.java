class RoundRobin{
	/*Processes  Burst time  Waiting time  Turn around time
		 1        10    		 13         23
		 2        5     		 10         15
		 3        8     		 13         21
		Average waiting time = 12
		Average turn around time = 19.6667
	*/
	public static void main(String[] args) {
		 // process id's
        int processes[] = { 1, 2, 3};
        int n = processes.length;
      
        // Burst time of all processes
        int burstTime[] = {10, 5, 8};
      
        // Time quantum
        int quantum = 2;
        findAverageTime(processes, n, burstTime, quantum);
	}



	private static void findAverageTime(int[] processes, int n, int[]  burstTime, int q){
		int[] waitingTime = new int[n];
		int[] turnAroundTime = new int[n];
		int totalWaitingTime = 0;
		int totalTurnAroundTime = 0;

		// Function to find waiting time of all processes
		findWaitingTime(processes, n, burstTime,  waitingTime, q);

		// Function to find turn around time for all processes
		findTurnArounTime(processes, n, burstTime, waitingTime, turnAroundTime);

		// Display processes along with all details
        System.out.println("Processes " + " BurstTime " +" Waiting" + " TAT");

        // Calculate total waiting time and total turn around time
        for (int i=0; i<n; i++)
        {
            totalWaitingTime = totalWaitingTime + waitingTime[i];
            totalTurnAroundTime = totalTurnAroundTime + turnAroundTime[i];
            System.out.println(" " + (i+1) + "\t\t\t\t" + burstTime[i] +"\t\t " + waitingTime[i] +"\t\t " + turnAroundTime[i]);
        }

        System.out.println("Average waiting time = " + (float)totalWaitingTime / (float)n);
        System.out.println("Average turn around time = " + (float)totalTurnAroundTime / (float)n);

	}







	private static void findWaitingTime(int[] processes, int n, int[]  burstTime, int[]  waitingTime, int q){

		int[] remBurstTime = new int[n];
		
		int time = 0;
		int j = 0;			//the jth pointer on the remBurstTime array.

		for (int i=0; i<n; i++) {	//Make a copy of the burst time
			remBurstTime[j++] = burstTime[i];
		}



		while(true){
			boolean done  = true;

			// Traverse all processes one by one repeatedly
			for (int i=0; i<n; i++) {
				
				if(remBurstTime[i] > 0){
					done = false;		// There is a pending process		

					
					if(remBurstTime[i]  > q){	//eg 10 > 2

						// Increase the value of t i.e. shows how much time a process has been processed
						time  = time + q;	//now time is 2

						//Decrease the burst_time of current process by the quantum
						remBurstTime[i] = remBurstTime[i] - q;	
					
					
					}else{		//If burst time is smaller than or equal to q, Last cycle for this process
						
						time  = time + remBurstTime[i];

						//Waiting time is current time minus time used by this process
						waitingTime[i] = time - burstTime[i];

						//As the process gets fully executed make its remaining burst time = 0
						remBurstTime[i] = 0;	//This process is while
					}

				}

			}	
			//if all the process r done
			if(done == true)
				break;
		}

	}


	private static void findTurnArounTime(int processes[], int n, int burstTime[], int waitingTime[], int turnAroundTime[]){
		 // calculating turnaround time by adding burstTime[i] + waitingTime[i]
        for (int i = 0; i < n ; i++)
            turnAroundTime[i] = burstTime[i] + waitingTime[i];
	}
}