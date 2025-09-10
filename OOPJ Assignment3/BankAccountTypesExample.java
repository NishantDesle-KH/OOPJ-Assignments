import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println(accountHolder + " → Balance=" + balance + ", Interest=" + (int)interest);
    }
}
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Overdraft Limit=" + (int)overdraftLimit);
    }
}
 class BankAccountTypesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Savings Account Number: ");
        int sAccNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Savings Account Holder Name: ");
        String sHolder = sc.nextLine();
        System.out.print("Enter Savings Account Balance: ");
        double sBalance = sc.nextDouble();
        System.out.print("Enter Interest Rate (%): ");
        double sInterest = sc.nextDouble();
        SavingsAccount savings = new SavingsAccount(sAccNo, sHolder, sBalance, sInterest);

        sc.nextLine(); // consume newline

        System.out.print("\nEnter Current Account Number: ");
        int cAccNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Current Account Holder Name: ");
        String cHolder = sc.nextLine();
        System.out.print("Enter Current Account Balance: ");
        double cBalance = sc.nextDouble();
        System.out.print("Enter Overdraft Limit: ");
        double cOverdraft = sc.nextDouble();
        CurrentAccount current = new CurrentAccount(cAccNo, cHolder, cBalance, cOverdraft);

        System.out.println();
        savings.calculateInterest();
        current.checkOverdraft();

        sc.close();
    }
}
