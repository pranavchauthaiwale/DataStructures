package graphs;

import graphs.GraphUtils.GraphUtils;

import java.util.Stack;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        int[][] graph = GraphUtils.getGraphAsAdjacencyMatrix();
        GraphUtils.printAdjacencyMatrix(graph);
        depthFirstTraversal(graph);
    }

    public static void depthFirstTraversal(int[][] graph) {
        if (graph == null) {
            return;
        }
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        visited[0] = true;
        stack.push(0);
        System.out.print("Depth First Search: 0 ");
        while (!stack.isEmpty()) {
            int currentNode = stack.peek();
            int nextNode = -1;
            for (int i = 0; i < graph.length; i++) {
                if (graph[currentNode][i] == 1 && !visited[i]) {
                    nextNode = i;
                    break;
                }
            }
            if (nextNode != -1) {
                stack.push(nextNode);
                visited[nextNode] = true;
                System.out.print(nextNode + " ");
            } else {
                stack.pop();
            }
        }
    }
}
