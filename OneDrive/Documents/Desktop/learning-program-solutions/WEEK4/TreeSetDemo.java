package WEEK4;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("TreeSet elements: " + numbers);

        numbers.remove(20);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
