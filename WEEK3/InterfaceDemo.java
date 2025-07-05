package WEEK3;

interface Animal {
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();

        a1.makeSound();
        a2.makeSound();
    }
}
