package InheritancePolymorphism;

public class PaymentInterface {

    public static void main (String[] args) {

        PaymentMethod creditCardpayment = new CreditCard();
        creditCardpayment.pay(200);
        PaymentMethod payPalPayment = new PayPal();
        payPalPayment.pay(150);
    }
}

interface PaymentMethod {

     void pay(double amount);
}

class CreditCard implements PaymentMethod {


    @Override
    public void pay(double amount) {

        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {


    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}