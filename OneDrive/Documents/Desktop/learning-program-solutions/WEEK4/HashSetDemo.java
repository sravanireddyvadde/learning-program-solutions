package WEEK4;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Hyderabad");

        System.out.println("HashSet Elements: " + cities);

        cities.remove("Delhi");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
