package WEEK2;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;

        System.out.print("Enter number of elements (max 10): ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n || n == arr.length) {
            System.out.println("Insertion not possible.");
        } else {
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = element;
            n++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nEnter position to delete (0 to " + (n - 1) + "): ");
        int delPos = sc.nextInt();

        if (delPos < 0 || delPos >= n) {
            System.out.println("Deletion not possible.");
        } else {
            for (int i = delPos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
