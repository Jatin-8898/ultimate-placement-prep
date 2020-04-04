// Java program to connect n ropes with minimum cost 
import java.util.*; 

class ConnectRopes { 
    
	public static void main(String args[]) 
	{ 
		int len[] = { 4, 3, 2, 6 }; 
		int size = len.length; 
		System.out.println("Total cost for connecting ropes is " + minCost(len, size)); 
    } 
	static int minCost(int arr[], int n) 
	{ 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // Create a priority queue 

		for (int i = 0; i < n; i++) {   // Adding items to the pQueue 
			pq.add(arr[i]); 
        }

		int res = 0; 

		while (pq.size() > 1) {     // While size of priority queue is more than 1 

            // Extract shortest two ropes from pq 
			int first = pq.poll(); 
			int second = pq.poll(); 

			// Connect the ropes: update result and insert the new rope to pq 
			res += first + second; 
			pq.add(first + second); 
		} 

		return res; 
	} 


    
    /* ANOTHER SOL in C++ 
    
    #include<iostream>
    #include<queue>
    using namespace std;
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        int t;
        cin>>t;
        while(t--)
        {
            int n;
            cin>>n;
            priority_queue<int, vector<int>, greater<int> >q;
            for(int i=0;i<n;i++)
            {
                int x;
                cin>>x;
                q.push(x);
            }
            int c=0;
            long long int sum=0,s=0;
            while(q.size()!=1)
            {
                c=0;
                while(c<2)
                {
                    sum+=q.top();
                    q.pop();
                    c++;
                }
                if(c==2)
                {
                    q.push(sum);
                    s+=(long long int)sum;
                    
                }
            sum=0;
                
            }
            cout<<s<<endl;
        }
        return 0;
    }
*/
} 
