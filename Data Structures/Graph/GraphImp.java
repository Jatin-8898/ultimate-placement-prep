import java.io.*;
import java.util.*;
class GraphImp
{
    private int vertices;
    private LinkedList<Integer> adjLists[];
 
    GraphImp(int vertices)
    {
        this.vertices = vertices;
        adjLists = new LinkedList[vertices];
        
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList();
    }
 
    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
        //adjLists[dest].add(src);              FOR UNDIRECTED GRAPH
    }

    void print(){
        
        int j = 0;
        for(LinkedList i : adjLists){
            System.out.println("Node " + (j++) +" has the edge with " + i);
        }
    }
 
    public static void main(String args[])
    {
        GraphImp g = new GraphImp(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.print();
        
    }
}