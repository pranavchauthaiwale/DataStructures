package graphs.GraphUtils;

public class GraphUtils {
    private static final int MAX_ELEMENTS = 9;
    public static int[][] getGraphAsAdjacencyMatrix(){
        int[][] adjMatrix = new int[MAX_ELEMENTS][MAX_ELEMENTS];

        addEdge(adjMatrix, 0, 1);
        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 1, 3);
        addEdge(adjMatrix, 2, 4);
        addEdge(adjMatrix, 3, 4);
        addEdge(adjMatrix, 3, 6);
        addEdge(adjMatrix, 4, 5);
        addEdge(adjMatrix, 4, 7);
        return adjMatrix;
    }

    private static void addEdge(int[][] adjMatrix, int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public static void printAdjacencyMatrix(int[][] graph) {
        int rows = graph.length;
        int cols = graph[0].length;
        // number of rows and columns will always be same

        for (int i = 0; i < rows; i++) {
            System.out.print(i + " [ ");
            for (int j = 0; j < cols; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
