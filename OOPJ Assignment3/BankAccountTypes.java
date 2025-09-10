import java.util.Scanner;
class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}
 class BankAccountTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saving Account Input
        System.out.print("Enter Saving Account No: ");
        int sAccNo = sc.nextInt();
        System.out.print("Enter Saving Account Balance: ");
        double sBalance = sc.nextDouble();
        System.out.print("Enter Interest Rate (%): ");
        double sInterest = sc.nextDouble();

        SavingAccount saving = new SavingAccount(sAccNo, sBalance, sInterest);

        // Current Account Input
        System.out.print("\nEnter Current Account No: ");
        int cAccNo = sc.nextInt();
        System.out.print("Enter Current Account Balance: ");
        double cBalance = sc.nextDouble();
        System.out.print("Enter Overdraft Limit: ");
        double cOverdraft = sc.nextDouble();

        CurrentAccount current = new CurrentAccount(cAccNo, cBalance, cOverdraft);

        System.out.println();
        saving.display();
        current.display();

        sc.close();
    }
}
