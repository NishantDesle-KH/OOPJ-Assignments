import java.util.Scanner;

 class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();

        if (amount > 1000) {
            amount = amount - (amount * 0.10); // 10% discount
        }

        System.out.println("Final cost after discount: " + amount);

        sc.close();
    }
}
