import java.util.Scanner;

class Staff {
    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}
class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}
 class AcademicStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Teaching Staff input
        System.out.print("Enter Teaching Staff Name: ");
        String tName = sc.nextLine();
        System.out.print("Enter Teaching Staff Salary: ");
        double tSalary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        TeachingStaff tStaff = new TeachingStaff(tName, tSalary, subject);

        // Non-Teaching Staff input
        System.out.print("Enter Non-Teaching Staff Name: ");
        String ntName = sc.nextLine();
        System.out.print("Enter Non-Teaching Staff Salary: ");
        double ntSalary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        NonTeachingStaff ntStaff = new NonTeachingStaff(ntName, ntSalary, department);

        System.out.println();
        tStaff.display();
        ntStaff.display();

        sc.close();
    }
}
