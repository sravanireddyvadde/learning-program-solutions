package WEEK1;

class StaticBlock {
    static {
        System.out.println("Static block executed");
    }
    StaticBlock() {
        System.out.println("Constructor executed");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        new StaticBlock();
    }
}

