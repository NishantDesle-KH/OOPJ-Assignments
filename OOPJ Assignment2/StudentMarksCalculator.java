class Student {
    private String name;
    private int marks;

    private static int totalStudents = 0;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++; 
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public boolean isPassed() {
        return marks >= 35;
    }
    public String getName() {
        return name;
    }
    public static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }
}

public class StudentMarksCalculator {
    public static void main(String[] args) {
       
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

        Student.showTotalStudents();
    }
}
