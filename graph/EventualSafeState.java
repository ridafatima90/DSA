package graph;
import java.util.*;

public class EventualSafeState {
    public static List<Integer> eventualSafeNode(int[][] graph){
        int n= graph.length;
        ArrayList<Integer> result = new ArrayList<>();

        int[] state = new int[n];  //0: unvisited, 1: visiting, 2: visited

        for(int i = 0;  i < n; i++){
            if(isSafeNode(i, graph, state))
                result.add(i);
        }

        Collections.sort(result);
        return result;
    }
    public static boolean isSafeNode(int node, int[][] graph, int[] state){
        if(state[node] != 0){
            return state[node] == 2;
        }

        state[node] = 1;

        for(int neighbor: graph[node]){
            if(!isSafeNode(neighbor, graph, state)){
               return false;
            }
        }

        state[node] = 2;
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};

        System.out.println(eventualSafeNode(graph));
    }
}
