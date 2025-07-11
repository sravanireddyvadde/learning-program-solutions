package WEEK3;

class Grandparent {
    void show() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child class");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
        c.print();
    }
}
