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

    public void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentMarksChecker {
    public static void main(String[] args) {
       
        Student s1 = new Student(07, "Nishant", 80);

        s1.setMarks(85);
        s1.showDetails();
    }
}
