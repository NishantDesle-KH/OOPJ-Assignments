class BankAccount {
    private String name;
    private double balance;
    private static double interestRate;

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
	
    public double getBalance() {
        return balance;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public void showDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}
public class BankAccountInitialization {
    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount();
        account1.setName("Rohit");
        account1.setBalance(5000);

        BankAccount account2 = new BankAccount();
        account2.setName("Priya");
        account2.setBalance(15000);
		
        System.out.print("Account1: ");
        account1.showDetails();

        System.out.print("Account2: ");
        account2.showDetails();
    }
}
