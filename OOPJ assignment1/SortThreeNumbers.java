import java.util.Scanner;
import java.util.Arrays;

class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        System.out.println("Ascending order: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        sc.close();
    }
}
