import java.util.Scanner;

 class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        sc.close();
    }
}
