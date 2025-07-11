package WEEK3;

class Bird {
    void sound() {
        System.out.println("Bird makes sound");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

class Crow extends Bird {
    void sound() {
        System.out.println("Crow caws");
    }
}

public class DispatchDemo {
    public static void main(String[] args) {
        Bird b;
        b = new Sparrow();
        b.sound();
        b = new Crow();
        b.sound();
    }
}
