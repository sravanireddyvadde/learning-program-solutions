package WEEK3;

abstract class Language {
    abstract void printName();
}

class Java extends Language {
    void printName() {
        System.out.println("Java Programming");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Language lang = new Java();
        lang.printName();
    }
}
