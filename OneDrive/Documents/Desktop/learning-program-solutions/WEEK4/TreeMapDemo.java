package WEEK4;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> departments = new TreeMap<>();

        departments.put(103, "Mechanical");
        departments.put(101, "CSE");
        departments.put(104, "Civil");
        departments.put(102, "ECE");

        System.out.println("TreeMap: " + departments);

        departments.remove(104);

        for (Integer key : departments.keySet()) {
            System.out.println("Dept Code: " + key + ", Name: " + departments.get(key));
        }
    }
}
