package WEEK6;
import java.io.*;
public class ListFilesInDirectoryDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] files = dir.list();
        System.out.println("Files in directory:");
        for (String file : files) {
            System.out.println(file);
        }
    }
}