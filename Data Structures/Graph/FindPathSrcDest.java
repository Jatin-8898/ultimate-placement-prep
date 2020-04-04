// JAVA program to print all paths from a source to destination. 
import java.util.ArrayList; 
import java.util.List; 

// A directed graph using adjacency list representation 
class Graph { 

	// No. of vertices in graph 
	private int v; 
	
	// adjacency list 
	private ArrayList<Integer>[] adjList; 
	
	//Constructor 
	public Graph(int vertices){ 
		
		//initialise vertex count 
		this.v = vertices; 
		
		// initialise adjacency list 
		initAdjList(); 
	} 
	
	// utility method to initialise 
	// adjacency list 
	@SuppressWarnings("unchecked") 
	private void initAdjList() 
	{ 
		adjList = new ArrayList[v]; 
		
		for(int i = 0; i < v; i++) 
		{ 
			adjList[i] = new ArrayList<>(); 
		} 
	} 
	
	// add edge from u to v 
	public void addEdge(int u, int v) 
	{ 
		// Add v to u's list. 
		adjList[u].add(v); 
	} 
	
	// Prints all paths from 's' to 'd' 
	public void printAllPaths(int s, int d) 
	{ 
		boolean[] isVisited = new boolean[v]; 
		ArrayList<Integer> pathList = new ArrayList<>(); 
		
		//add source to path[] 
		pathList.add(s); 
		
		//Call recursive utility 
		printAllPathsUtil(s, d, isVisited, pathList); 
	} 

	// A recursive function to print all paths from 'u' to 'd'. isVisited[] keeps track of 
	// vertices in current path.localPathList<> stores actual vertices in the current path 
    private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, 
                                                                    List<Integer> localPathList) { 
		// Mark the current node 
		isVisited[u] = true; 
		
		if (u.equals(d))        //When we finally got a path from src to dest
		{ 
            System.out.println(localPathList); 
            
			// if match found then no need to traverse more till depth 
			isVisited[u]= false; 
			return ; 
		} 
		
		// Recur for all the vertices adjacent to current vertex 
		for (Integer i : adjList[u]) 
		{ 
			if (!isVisited[i]) 
			{ 
				// store current node in path[] 
                localPathList.add(i); 
                //System.out.println(localPathList +" ADDED");
				printAllPathsUtil(i, d, isVisited, localPathList); 
				
				// remove current node in path[] eg 2 0 1 3 not remove 3 and recursively check path
                localPathList.remove(i); 
                //System.out.println(localPathList +" REMOVED");
			} 
		} 
		
		// Mark the current node 
		isVisited[u] = false; 
	} 
} 

public class FindPathSrcDest{
    public static void main(String[] args) 
	{ 
		// Create a sample graph 
		Graph g = new Graph(4); 
		g.addEdge(0,1); 
		g.addEdge(0,2); 
		g.addEdge(0,3); 
		g.addEdge(2,0); 
		g.addEdge(2,1); 
		g.addEdge(1,3); 
	
		// arbitrary source 
		int s = 2; 
	
		// arbitrary destination 
		int d = 3; 
	
		System.out.println("Following are all different paths from "+s+" to "+d); 
		g.printAllPaths(s, d); 

	} 
}

