package WEEK3;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();
    }
}
