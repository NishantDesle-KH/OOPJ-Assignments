import java.util.Scanner;

class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        String result = (month == 1) ? "Month is January" :
                        (month == 2) ? "Month is February" :
                        (month == 3) ? "Month is March" :
                        (month == 4) ? "Month is April" :
                        (month == 5) ? "Month is May" :
                        (month == 6) ? "Month is June" :
                        (month == 7) ? "Month is July" :
                        (month == 8) ? "Month is August" :
                        (month == 9) ? "Month is September" :
                        (month == 10) ? "Month is October" :
                        (month == 11) ? "Month is November" :
                        (month == 12) ? "Month is December" :
                                        "Invalid month number";

        System.out.println(result);

        sc.close();
    }
}
