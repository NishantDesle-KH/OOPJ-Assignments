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
    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
public class BankAccountBasicInfo {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Nishant", 100000);

        acc1.showDetails();
    }
}
