import java.util.Scanner;

 class GradePlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade = "";

        if (marks >= 85 && marks <= 100) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "A−";
        } else if (marks >= 65) {
            grade = "B+";
        } else if (marks >= 50) {
            grade = "B";
        } else if (marks >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
