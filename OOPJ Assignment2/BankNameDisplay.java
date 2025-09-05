class BankAccount {
    private String accountHolder;
    private double balance;
    private static String bankName = "CDAC Bank";  // static variable

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
public class BankNameDisplay {
    public static void main(String[] args) {
       
        BankAccount.displayBankName();

        BankAccount acc1 = new BankAccount("Nishant", 15000);
        acc1.showDetails();
    }
}
