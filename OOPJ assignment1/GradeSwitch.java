import java.util.Scanner;

class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;

        switch (marks / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
            case 5:
                if (marks >= 55)
                    grade = "C";
                else
                    grade = "D";
                break;
            case 4:
                grade = "D";
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                if (marks >= 25)
                    grade = "E";
                else
                    grade = "F";
                break;
            default:
                grade = "Invalid marks";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
