package design_pattern.creational;

public class Factory {

    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.createPayment("Gpay");
        payment.pay();
    }
}

interface Payment {
    void pay();
}

class PhonePe implements Payment {

    @Override
    public void pay() {
        System.out.println("PhonePe");
    }
}

class GPay implements Payment {

    @Override
    public void pay() {
        System.out.println("GPay");
    }
}

class Cred implements Payment {

    @Override
    public void pay() {
        System.out.println("Cred");
    }
}

class PaymentFactory {
    public Payment createPayment(String type) {
        if (type.equalsIgnoreCase("gpay")) {
            return new GPay();
        } else if (type.equalsIgnoreCase("cred")) {
            return new Cred();
        } else if (type.equalsIgnoreCase("phonepe")) {
            return new PhonePe();
        } else {
            throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}