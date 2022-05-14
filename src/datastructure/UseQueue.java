package datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(52);
        queue.add(96);
        queue.add(42);
        queue.add(52);

        System.out.println(queue);

    }
}
