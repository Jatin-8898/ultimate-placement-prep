//An Iterative Java program to do DFS traversal from 
//a given source vertex. DFS() traverses vertices 
//reachable from s. 

import java.util.*; 

public class IterativeDFS 
{ 
	// This class represents a directed graph using adjacency 
	// list representation 
	static class Graph 
	{ 
		int V; //Number of Vertices 
		
		LinkedList<Integer>[] adj; // adjacency lists 
		
		//Constructor 
		Graph(int V) 
		{ 
			this.V = V; 
			adj = new LinkedList[V]; 
			
			for (int i = 0; i < adj.length; i++) 
				adj[i] = new LinkedList<Integer>(); 
			
		} 
		
		//To add an edge to graph 
		void addEdge(int v, int w) 
		{ 
			adj[v].add(w); // Add w to v’s list. 
		} 
		
		// prints all not yet visited vertices reachable from s 
		void DFSUtil(int s, Vector<Boolean> visited) 
		{ 
			// Create a stack for DFS 
			Stack<Integer> stack = new Stack<>(); 
			
			// Push the current source node 
			stack.push(s); 
			
			while(stack.empty() == false) 
			{ 
				// Pop a vertex from stack and print it 
				s = stack.peek(); 
				stack.pop(); 
				
				// Stack may contain same vertex twice. So 
				// we need to print the popped item only 
				// if it is not visited. 
				if(visited.get(s) == false) 
				{ 
					System.out.print(s + " "); 
					visited.set(s, true); 
				} 
				
				// Get all adjacent vertices of the popped vertex s 
				// If a adjacent has not been visited, then puah it 
				// to the stack. 
				Iterator<Integer> itr = adj[s].iterator(); 
				
				while (itr.hasNext()) 
				{ 
					int v = itr.next(); 
					if(!visited.get(v)) 
						stack.push(v); 
				} 
				
			} 
		} 
		
		// prints all vertices in DFS manner 
		void DFS() 
		{ 
			Vector<Boolean> visited = new Vector<Boolean>(V); 
			// Mark all the vertices as not visited 
			for (int i = 0; i < V; i++) 
				visited.add(false); 
	
			for (int i = 0; i < V; i++) 
				if (!visited.get(i)) 
					DFSUtil(i, visited); 
		}	 
	} 
	
	// Driver program to test methods of graph class 
	public static void main(String[] args) 
	{ 
		Graph g = new Graph(5); 
		g.addEdge(1, 0); 
		g.addEdge(2, 1); 
		g.addEdge(3, 4); 
		g.addEdge(4, 0); 
		
		System.out.println("Following is Depth First Traversal"); 
		g.DFS(); 
	} 
} 
