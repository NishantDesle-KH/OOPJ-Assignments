class Employee {
    private String name;
    private double salary;
    private int yearsOfService;

    private static int totalEmployees = 0;

    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;   
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double calculateBonus() {
        if (yearsOfService > 5) {
            return 0.05 * salary;  // 5% bonus
        } else {
            return 0.0;
        }
    }
    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

public class EmployeeSalaryManager {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee("Ravi", 150000, 6);
        Employee emp2 = new Employee("Anita", 120000, 3);
        Employee emp3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee " + emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getName() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getName() + " Bonus: " + emp3.calculateBonus());

        Employee.showTotalEmployees();
    }
}