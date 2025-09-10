import java.util.Scanner;

class Member {
    String name;
    int id;

    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id);
    }
}
class Teacher extends Member {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Subject=" + subject);
    }
}
class Student extends Member {
    int grade;

    Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }
    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Grade=" + grade);
    }
}
class Staff extends Member {
    String department;

    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Department=" + department);
    }
}
class SchoolMembers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Teacher Name: ");
        String tName = sc.nextLine();
        System.out.print("Enter Teacher ID: ");
        int tId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(tName, tId, subject);

        System.out.print("\nEnter Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Student ID: ");
        int sId = sc.nextInt();
        System.out.print("Enter Grade: ");
        int grade = sc.nextInt();
        sc.nextLine(); 
        Student student = new Student(sName, sId, grade);

        System.out.print("\nEnter Staff Name: ");
        String stName = sc.nextLine();
        System.out.print("Enter Staff ID: ");
        int stId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Staff staff = new Staff(stName, stId, department);

        System.out.println();
        teacher.displayInfo();
        student.displayInfo();
        staff.displayInfo();

        sc.close();
    }
}
