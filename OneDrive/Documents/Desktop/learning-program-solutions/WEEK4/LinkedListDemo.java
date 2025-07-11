package WEEK4;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Sravani");
        names.add("Anusha");
        names.add("Meghana");

        System.out.println("LinkedList: " + names);

        names.addFirst("Priya");
        names.addLast("Deepika");

        names.remove("Anusha");

        System.out.println("Updated LinkedList: " + names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
