import java.util.Scanner;

class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            System.out.println("Deposit transaction.");
        } else if (amount < 0) {
            System.out.println("Withdrawal transaction.");
        } else {
            System.out.println("No transaction.");
        }

        sc.close();
    }
}
