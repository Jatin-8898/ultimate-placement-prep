import java.io.*; 
import java.util.*; 

class DetectCycleInGraph{

	private int V;		//No of vertices
	private LinkedList<Integer> adj[];			//Adj list

	//constrcutor
	DetectCycleInGraph(int v){
		V = v;
		adj = new LinkedList[v];

		for(int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
	}


	//for adding a edge in the graph
	void addEdge(int v,int w) { 
        adj[v].add(w); 
        adj[w].add(v); 
    } 

    boolean isCyclic(){
    	Boolean visited[] = new Boolean[V];	//create a bool array
    	for (int i=0; i<V; i++) {			
    		visited[i] = false;				//mark all as false
    	}

    	//call the recursive helper to check if cycle is there in dfs trees
    	for (int u=0; u < V; u++) {
    		
    		if(!visited[u]){		//dont recur for 'u' if already visited

    			if(isCyclicUtil(u, visited, -1))
    				return true;			//means cycle is present
    		}
    	}
    	return false;
    }

    
    // A recursive function that uses visited[] and parent to detect 
    // cycle in subgraph reachable from vertex v. 
    boolean isCyclicUtil(int v, Boolean visited[], int parent){

        visited[v] = true; 	// Mark the current node as visited 
        Integer i; 

        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()){
        	i = it.next();

        	// If an adjacent is not visited, then recur for that adjacent 
        	if(!visited[i]){
        		
        		if(isCyclicUtil(i, visited , v))
        			return true;
        	} 
			/*MAIN:IF an adjacent is visited and not parent of current vertex, then there is a cycle.*/
			else if( i != parent){
				return true;
			}
        }
        return false;
    }

	public static void main(String[] args) {
		DetectCycleInGraph g1 = new DetectCycleInGraph(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 0); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        System.out.println("FOR FIRST GRAPH: ");
        if (g1.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
        

        DetectCycleInGraph g2 = new DetectCycleInGraph(3); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        System.out.println("FOR SECOND GRAPH: ");

        if (g2.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
	}


}