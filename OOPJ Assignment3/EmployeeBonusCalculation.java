import java.util.Scanner;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
	
    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}
 class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Manager input
        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine();
        Manager manager = new Manager(mName, mSalary);

        // Developer input
        System.out.print("Enter Developer Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double dSalary = sc.nextDouble();
        Developer developer = new Developer(dName, dSalary);

        System.out.println();
        manager.calculateBonus();
        developer.calculateBonus();

        sc.close();
    }
}
