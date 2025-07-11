package WEEK4;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sravani");
        list.add("Anusha");
        list.add("Meghana");
        System.out.println("ArrayList: " + list);
        list.remove("Anusha");
        System.out.println("After removal: " + list);
    }
}
