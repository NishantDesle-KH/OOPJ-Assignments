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

 class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Credit Card Payment
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter Amount for Credit Card Payment: ");
        double ccAmount = sc.nextDouble();
        sc.nextLine(); // consume newline
        CreditCardPayment ccp = new CreditCardPayment(cardNumber, ccAmount);

        // UPI Payment
        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();
        System.out.print("Enter Amount for UPI Payment: ");
        double upiAmount = sc.nextDouble();
        UPIPayment up = new UPIPayment(upiId, upiAmount);

        System.out.println();
        ccp.pay();
        up.pay();

        sc.close();
    }
}
