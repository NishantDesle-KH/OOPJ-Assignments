import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class Que6 {
    
    static void register(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be ≥ 18");
        } else {
            System.out.println("Registration Successful!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            register(age);
        } catch (AgeNotValidException e) {
            System.out.println("AgeNotValidException: " + e.getMessage());
        }
        sc.close();
    }
}
