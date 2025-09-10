import java.util.Scanner;

abstract class Payment {
    double amount;
    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}
 class PaymentProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.print("Enter Credit Card Number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter Amount for Credit Card Payment: ");
        double ccAmount = sc.nextDouble();
        sc.nextLine(); // consume newline
        p = new CreditCardPayment(cardNumber, ccAmount);
        p.pay();

        System.out.print("\nEnter UPI ID: ");
        String upiId = sc.nextLine();
        System.out.print("Enter Amount for UPI Payment: ");
        double upiAmount = sc.nextDouble();
        p = new UPIPayment(upiId, upiAmount);
        p.pay();

        sc.close();
    }
}
