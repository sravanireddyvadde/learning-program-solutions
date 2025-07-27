package WEEK6;
import java.io.*;
public class FileAppendDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt", true);
            fw.write("\nAppended line!");
            fw.close();
            System.out.println("File appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}