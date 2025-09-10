import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displaySalary() {
        System.out.println(name + " Salary=" + salary);
    }
}
class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + (int)salary);
    }
}
class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}
class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}
class CollegeStaffHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Professor Name: ");
        String profName = sc.nextLine();
        System.out.print("Enter Professor Salary: ");
        double profSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String profSubject = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        Professor professor = new Professor(profName, profSalary, profSubject, specialization);

        System.out.print("\nEnter Lecturer Name: ");
        String lecName = sc.nextLine();
        System.out.print("Enter Lecturer Salary: ");
        double lecSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String lecSubject = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Lecturer lecturer = new Lecturer(lecName, lecSalary, lecSubject, department);

        System.out.println();
        professor.displaySalary();
        lecturer.displaySalary();

        sc.close();
    }
}
