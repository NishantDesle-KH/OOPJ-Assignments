class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal!");
        }
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
public class BankDepositWithdrawal {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Rohan", 10000);
        BankAccount acc2 = new BankAccount("Prita", 20000);

        acc1.deposit(5000);
        acc1.withdraw(3000);

        acc2.deposit(2000);
        acc2.withdraw(25000);  

        System.out.println("\nFinal Account Details:");
        acc1.showDetails();
        acc2.showDetails();
    }
}
