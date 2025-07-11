package WEEK3;

class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println(super.type);
        System.out.println(this.type);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printType();
    }
}
