class BankAccount {
    // private balance field
    private double balance;

    // constructor to initialize balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // getter method for balance
    public double getBalance() {
        return balance;
    }

    // main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);

        // Sample Input
        account.deposit(5000);
        account.withdraw(2000);

        // Sample Output
        System.out.println("Updated Balance = " + account.getBalance());
    }
}
