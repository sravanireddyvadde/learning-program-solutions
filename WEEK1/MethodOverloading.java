package WEEK1;

public class MethodOverloading {
    void display() {
        System.out.println("No arguments");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display();
        obj.display("Sravani");
        obj.display(21);
    }
}
