import java.util.Scanner;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

        String result = (sum == original) ? original + " is an Armstrong number" 
                                         : original + " is not an Armstrong number";

        System.out.println(result);

        sc.close();
    }
}
