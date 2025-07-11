package WEEK2;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String[] names = {"Sravani", "Anusha", "Meghana", "Deepika"};
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
