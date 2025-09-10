import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void displaySalary() {
        double total = salary + (salary * 0.20);
        System.out.println(name + " Total Salary = " + (int)total);
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void displaySalary() {
        double total = salary + (salary * 0.10);
        System.out.println(name + " Total Salary = " + (int)total);
    }
}
class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine();
        Manager manager = new Manager(mName, mSalary);


        System.out.print("Enter Developer Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double dSalary = sc.nextDouble();
        Developer developer = new Developer(dName, dSalary);

        System.out.println();
        manager.displaySalary();
        developer.displaySalary();

        sc.close();
    }
}
