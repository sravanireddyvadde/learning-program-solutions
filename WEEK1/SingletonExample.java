package WEEK1;

class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        obj1.showMessage();
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
