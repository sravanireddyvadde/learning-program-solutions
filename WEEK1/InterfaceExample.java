package WEEK1;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Printable doc = new Document();
        doc.print();
    }
}
