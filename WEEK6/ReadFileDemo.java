package WEEK6;
import java.io.*;
import java.util.*;
public class ReadFileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("sample.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}