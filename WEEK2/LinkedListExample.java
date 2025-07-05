package WEEK2;

import java.util.Scanner;

public class LinkedListExample {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        curr.next = curr.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        System.out.print("Linked list: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListExample list = new LinkedListExample();

        while (true) {
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
