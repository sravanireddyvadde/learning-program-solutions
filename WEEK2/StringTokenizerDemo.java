package WEEK2;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Java,Python,C++,C";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
