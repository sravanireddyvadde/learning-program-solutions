package WEEK4;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);

        System.out.println("Head of queue: " + queue.peek());

        queue.poll();
        System.out.println("After polling: " + queue);

        for (int num : queue) {
            System.out.println(num);
        }
    }
}
