import java.util.Scanner;

 class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage marks: ");
        int percentage = sc.nextInt();

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 76) {
            System.out.println("Grade: A");
        } else if (percentage >= 66) {
            System.out.println("Grade: B+");
        } else if (percentage >= 51) {
            System.out.println("Grade: B");
        } else if (percentage >= 36) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
