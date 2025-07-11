package WEEK4;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("ArrayList elements: " + list);

        list.remove("Banana");
        list.set(1, "Grapes");

        System.out.println("After modifications: " + list);

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
