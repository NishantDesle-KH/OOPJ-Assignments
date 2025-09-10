abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}
class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    public double calculateSalary() {
        return basicSalary + hra;
    }

    public double calculateBonus() {
        return 0.10 * calculateSalary();
    }
}
class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Amit", 1, 50000, 5000);
        Employee e2 = new PermanentEmployee("Raj", 2, 40000, 4000);
        Employee e3 = new ContractEmployee("Neha", 3, 300, 100);
        Employee e4 = new ContractEmployee("Vikas", 4, 250, 120);

        Employee[] employees = { e1, e2, e3, e4 };

        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            if (emp instanceof BonusEligible) {
                BonusEligible be = (BonusEligible) emp;
                double bonus = be.calculateBonus();
                System.out.println(emp.name + " Salary = " + (int) salary + ", Bonus = " + (int) bonus);
            } else {
                System.out.println(emp.name + " Salary = " + (int) salary);
            }
        }
    }
}
