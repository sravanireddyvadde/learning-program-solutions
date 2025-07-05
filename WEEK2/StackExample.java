package WEEK2;

import java.util.Scanner;

public class StackExample {
    private int[] stack;
    private int top;
    private int size;

    public StackExample(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top Element: " + stack[top]);
    }

    public void isEmpty() {
        System.out.println(top == -1 ? "Stack is empty" : "Stack is not empty");
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackExample stack = new StackExample(5);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.isEmpty();
                    break;
                case 5:
                    stack.display();
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
