 package WEEK1;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context1 = new PaymentContext(new CreditCardPayment());
        context1.pay(200);

        PaymentContext context2 = new PaymentContext(new PayPalPayment());
        context2.pay(400);
    }
}
