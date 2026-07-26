package design_pattern.behavioural;

public class Strategy {
    public static void main(String[] args) {

        PaymentStrategy paymentStrategy = new UPIPayment();
        PaymentService paymentService = new PaymentService(paymentStrategy);
        paymentService.processPayment(500);

    }
}

interface PaymentStrategy {
    void pay(double amount);
}

class UPIPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid through UPI:- " + amount);
    }
}


class PaymentService {

    private final PaymentStrategy paymentStrategy;

    PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}




