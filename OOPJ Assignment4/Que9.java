import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Que9 {
    
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        } else {
            System.out.println("Marks accepted: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try {
            validateMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
