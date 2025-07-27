package WEEK6;
import java.io.*;
public class CreateDirectoryDemo {
    public static void main(String[] args) {
        File dir = new File("NewFolder");
        if (dir.mkdir()) {
            System.out.println("Directory created.");
        } else {
            System.out.println("Directory not created.");
        }
    }
}