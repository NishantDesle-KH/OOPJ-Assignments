import java.util.Scanner;

 class LockerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int locker = sc.nextInt();

        if (locker % 2 == 0) {
            System.out.println("Even locker number.");
        } else {
            System.out.println("Odd locker number.");
        }

        sc.close();
    }
}
