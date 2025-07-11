package WEEK4;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sravani");
        students.put(102, "Anusha");
        students.put(103, "Deepika");

        System.out.println("Student Map: " + students);

        students.remove(102);
        students.put(103, "Meghana");

        System.out.println("Updated Map: " + students);

        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }
    }
}
