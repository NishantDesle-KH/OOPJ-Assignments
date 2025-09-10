import java.util.Scanner;

class Employee {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}
public class EmployeeAgeValidation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        int age = sc.nextInt();
        emp.setAge(age);

        if (age >= 18) {
            System.out.println("Age = " + emp.getAge());
        }
    }
}
