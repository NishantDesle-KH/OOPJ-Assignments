import java.util.Scanner;

 class DaysInMonthLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        int days;
        if (month == 2) {
            days = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        } else if (month==4 || month==6 || month==9 || month==11) {
            days = 30;
        } else if (month >= 1 && month <= 12) {
            days = 31;
        } else {
            days = 0; 
        }

        if (days != 0)
            System.out.println(days + " days");
        else
            System.out.println("Invalid month number");

        sc.close();
    }
}
