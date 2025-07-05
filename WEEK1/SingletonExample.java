package WEEK1;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
