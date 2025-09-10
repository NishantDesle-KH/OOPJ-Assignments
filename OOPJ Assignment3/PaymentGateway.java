import java.util.Scanner;

interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}
class PayPalPayment implements Payment {
   
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}
class PaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount for Credit Card Payment: ");
        double ccAmount = sc.nextDouble();
        System.out.print("Enter amount for PayPal Payment: ");
        double ppAmount = sc.nextDouble();

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(ccAmount);

        payment = new PayPalPayment();
        payment.pay(ppAmount);

        sc.close();
    }
}
