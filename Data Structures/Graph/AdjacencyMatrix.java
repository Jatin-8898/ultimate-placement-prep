public class AdjacencyMatrix {
    private boolean adjMatrix[][];
    private int numVertices;

    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public boolean isEdge(int i, int j) {
        return adjMatrix[i][j];
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0 ) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    public static void main(String args[])
    {
        AdjacencyMatrix g = new AdjacencyMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        System.out.print(g.toString());
        /* Outputs
            0: 0 1 1 0 
            1: 1 0 1 0 
            2: 1 1 0 1 
            3: 0 0 1 0 
            */
    }
}