package WEEK1;

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student("Sravani");
        Student s2 = new Student("Anusha", 20);
        s1.show();
        s2.show();
    }
}
