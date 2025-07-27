package WEEK6;
import java.io.*;
public class FileCopyDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during copying.");
            e.printStackTrace();
        }
    }
}