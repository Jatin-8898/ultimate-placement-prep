import java.util.ArrayList;
import java.util.List;
/*
Given a directed graph, a source vertex ‘s’ and a destination vertex ‘d’, print all paths from given ‘s’ to ‘d’.
*/
class AllPathFromSourceToDestination{
	/*
	The idea is to do Depth First Traversal (DFS) of given directed graph. Start the traversal from source. Keep storing the visited vertices in an array say ‘path[]’. If we reach the destination vertex, print contents of path[]. The important thing is to mark current vertices in path[] as visited also, so that the traversal doesn’t go in a cycle.
	*/
	public static void main(String[] args) {
		AllPathFromSourceToDestination g = new AllPathFromSourceToDestination(4);
		g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(1,3);

        //arbitary source
        int s = 2;

        //arbitray destination
        int d = 3;

        System.out.println("Following are all different paths from "+s+" to "+d);
        g.printAllPaths(s, d);
	}


	// No. of vertices in graph
    private int v; 

    private ArrayList<Integer>[] adjList;

    //Constructor
    public AllPathFromSourceToDestination(int vertices){

    	//initialise vertex count
        this.v = vertices;
         
        // initialise adjacency list
        initAdjList(); 
    }

    @SuppressWarnings("unchecked")
    private void initAdjList(){
    	//this make arraylist of size v
    	adjList = new ArrayList[v];	//eg array of size 4 

    	//Initialise each element in arraylist
    	for (int i=0; i<v; i++) {
    		adjList[i] = new ArrayList<>();	//Inside it arraylist
    	}

    }


    public void addEdge(int u, int v){
    	//Add v to u's list
    	adjList[u].add(v);
    }





    //print all the paths from source to destination
    public void printAllPaths(int s, int d){
    	
    	boolean[] isVisited = new boolean[v];
    	ArrayList<Integer> pathList = new ArrayList<>();

    	//add the source to the path
    	pathList.add(s);	//eg 2 here

    	//Call the recursive utility
    	printAllPathUtil(s , d, isVisited, pathList);

    }


    //A rec fun to print all the path from u to d where isVisited[] keeps tracks of
    //vertices in curr path and pathList stores the actual vertices in curr path
    void printAllPathUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList){

    	//Mark the current nnode
    	isVisited[u] = true;

    	if(u.equals(d))
    		System.out.println(localPathList);

    	//Recur for all the vertices
        //adjacent to current vertex

        for(Integer i : adjList[u]){
        	
        	//if its not visited
        	if(!isVisited[i]){
        		// store current node  in path[]
        		localPathList.add(i);	//eg 0 here 
        		printAllPathUtil(i, d, isVisited, localPathList);


        		// remove current node in path[]
                localPathList.remove(i);
        	}
        }

        // Mark the current node
        isVisited[u] = false;
    }









}