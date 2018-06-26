package graphs;

import graphs.GraphUtils.GraphUtils;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static void main(String[] args){
        int[][] graph = GraphUtils.getGraphAsAdjacencyMatrix();
        breadthFirstTraversal(graph);
    }

    private static void breadthFirstTraversal(int[][] graph){
        if(graph == null){
            return;
        }
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        System.out.print("Breadth First Search: ");
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");
            for(int i = 0; i < graph.length; i++){
                if(graph[currentNode][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
