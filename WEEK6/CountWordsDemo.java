package WEEK6;
import java.io.*;
import java.util.*;
public class CountWordsDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("sample.txt"));
        int count = 0;
        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        sc.close();
        System.out.println("Total words: " + count);
    }
}