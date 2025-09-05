class Student {
    private String name;
    private String className;
    private static int tuitionFee;

    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }

    public static int getTuitionFee() {
        return tuitionFee;
    }
	
    public void showDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

public class SchoolFeeSystem {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("Anjali");
        s1.setClassName("10th");
        Student s2 = new Student();
        s2.setName("Vikram");
        s2.setClassName("12th");
		
        System.out.print("Student1: ");
        s1.showDetails();
        System.out.print("Student2: ");
        s2.showDetails();
    }
}
