package WEEK2;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        sb.insert(4, " is");
        sb.delete(4, 7);
        sb.reverse();
        System.out.println(sb);
    }
}
