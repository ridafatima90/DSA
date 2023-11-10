package graph;
import java.util.*;

public class EventualSafeStateOptimized {
    public static List<Integer> eventualSafe(int[][] graph){
        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> reversedGraph = new ArrayList<>();
        int[] inDegree = new int[n];

        for(int i = 0; i < n; i++){
            reversedGraph.add(new ArrayList<>());
        }

        for(int i = 0; i< n; i++){
            for(int neighbor: graph[i]){
                reversedGraph.get(neighbor).add(i);
                inDegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);

            for(int neighbor: reversedGraph.get(node)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};

        System.out.println(eventualSafe(graph));


        PriorityQueue pq = new PriorityQueue<>();
    }
}
