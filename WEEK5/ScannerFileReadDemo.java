package WEEK5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileReadDemo {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Scanner Read: " + line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
