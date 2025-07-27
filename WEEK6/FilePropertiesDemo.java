package WEEK6;
import java.io.*;
public class FilePropertiesDemo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Length: " + file.length());
        System.out.println("Exists: " + file.exists());
    }
}
