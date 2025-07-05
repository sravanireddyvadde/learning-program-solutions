package WEEK2;

import java.util.Scanner;

public class QueueExample {
    private int[] queue;
    private int front, rear, size, capacity;

    public QueueExample(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void front() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front Element: " + queue[front]);
    }

    public void rear() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Rear Element: " + queue[rear]);
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueExample q = new QueueExample(5);

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Front\n4. Rear\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.front();
                    break;
                case 4:
                    q.rear();
                    break;
                case 5:
                    q.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
