package WEEK6;
import java.io.*;
public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("delete_me.txt");
        if (file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("File not found.");
        }
    }
}