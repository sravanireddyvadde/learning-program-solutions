package WEEK6;
import java.io.*;
import java.util.*;
public class CountLinesDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("sample.txt"));
        int count = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
        sc.close();
        System.out.println("Total lines: " + count);
    }
}
