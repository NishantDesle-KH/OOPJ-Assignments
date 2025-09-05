class Student {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
	
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name +
                           ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Student s1 = new Student(117, "Nishant", 82);
        Student s2 = new Student(112, "John", 59);

        s1.showDetails();
        s2.showDetails();
    }
}
