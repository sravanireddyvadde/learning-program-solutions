package WEEK4;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("Queue: " + queue);
        queue.removeFirst();
        System.out.println("After polling: " + queue);
    }
}
