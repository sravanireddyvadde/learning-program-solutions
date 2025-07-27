package WEEK6;
public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int result = 20 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
