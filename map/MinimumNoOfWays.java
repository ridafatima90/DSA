package map;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumNoOfWays {
    static class Node {
        int value;
        int steps;

        public Node(int value, int steps){
            this.value = value;
            this.steps = steps;
        }
    }

    public static int minimumStepsToReachNumber(int target){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0,0));

        while(!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.value == target) {
                return current.steps;
            }

            queue.offer(new Node(current.value * 2, current.steps + 1));

            queue.offer(new Node(current.value + 1, current.steps + 1));

        }
        return -1;

    }

    public static void main(String[] args) {
        int target = 7;

        int result = minimumStepsToReachNumber(target);
        System.out.println(result);
    }
}
