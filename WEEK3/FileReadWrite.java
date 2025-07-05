package WEEK3;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String content = "Hello Sravani, this is your Java file I/O task!";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader(fileName);
            int i;
            System.out.print("File content: ");
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

