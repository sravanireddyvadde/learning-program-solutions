package WEEK3;

final class FinalClass {
    final void show() {
        System.out.println("This is a final method in a final class");
    }
}

public class FinalMethodClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
