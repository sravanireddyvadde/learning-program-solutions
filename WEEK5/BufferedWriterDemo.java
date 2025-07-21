package WEEK5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_output.txt"));
            bw.write("First Line\n");
            bw.write("Second Line\n");
            bw.write("Week 5 Task 4 Complete!");
            bw.close();
            System.out.println("Data written using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
