package WEEK6;
public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = new int[5];
                arr[10] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Index out of bounds");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General exception");
        }
    }
}