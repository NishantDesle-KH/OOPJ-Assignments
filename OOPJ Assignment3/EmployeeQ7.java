class EmployeeQ7 {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double getNetSalary() {
        return basicSalary;
    }
}

class RegularEmployee extends Employee {
    RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    public double getNetSalary() {
        return basicSalary + (0.10 * basicSalary); // HRA 10%
    }
}

class ContractEmployee extends Employee {
    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    public double getNetSalary() {
        return basicSalary + (0.05 * basicSalary); // Allowance 5%
    }
}
class EmployeeHierarchy {
    public static void main(String[] args) {
        RegularEmployee e1 = new RegularEmployee("Nishant", 20000);
        ContractEmployee e2 = new ContractEmployee("Virat", 15000);

        System.out.println(e1.name + " Net Salary = " + (int)e1.getNetSalary());
        System.out.println(e2.name + " Net Salary = " + (int)e2.getNetSalary());
    }
}
