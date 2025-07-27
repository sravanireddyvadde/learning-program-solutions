package WEEK6;
import java.io.*;
public class CountCharactersDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("sample.txt");
        int count = 0;
        while (fr.read() != -1) {
            count++;
        }
        fr.close();
        System.out.println("Total characters: " + count);
    }
}