package design_pattern.structural;

public class Adapter {
    public static void main(String[] args) {

        Payment payment = new StripeAdapter(new StripePayment());
        payment.pay(100);
    }

}

class StripeAdapter implements Payment {
    private final StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(double amount) {
        stripePayment.makePayment(amount);
    }
}

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through Credit Card");

    }
}

class StripePayment {

    public void makePayment(double amount) {
        System.out.println("Stripe Payment Successful: ₹" + amount);
    }
}
