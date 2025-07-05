package WEEK3;

class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String college;

    void setStudentDetails(String college) {
        this.college = college;
    }

    void displayStudentDetails() {
        System.out.println("College: " + college);
    }
}

class Graduate extends Student {
    String degree;

    void setGraduateDetails(String degree) {
        this.degree = degree;
    }

    void displayGraduateDetails() {
        System.out.println("Degree: " + degree);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Graduate g = new Graduate();
        g.setPersonDetails("Sravani", 21);
        g.setStudentDetails("Bhoj Reddy Engineering College");
        g.setGraduateDetails("B.Tech");

        g.displayPersonDetails();
        g.displayStudentDetails();
        g.displayGraduateDetails();
    }
}
