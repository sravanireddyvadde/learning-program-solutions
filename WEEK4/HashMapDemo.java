package WEEK4;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Sravani");
        map.put(102, "Anusha");
        map.put(103, "Deepika");
        System.out.println("Student Map: " + map);
        map.remove(102);
        map.put(103, "Meghana");
        System.out.println("Updated Map: " + map);
        for (Integer id : map.keySet()) {
            System.out.println("ID: " + id + ", Name: " + map.get(id));
        }
    }
}
