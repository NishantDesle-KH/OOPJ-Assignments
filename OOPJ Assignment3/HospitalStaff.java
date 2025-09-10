import java.util.Scanner;

class Staff {
    String name;
    int staffId;

    Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}
class Doctor extends Staff {
    String specialization;

    Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}
class Nurse extends Staff {
    String shift;

    Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}
class HospitalStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Doctor Name: ");
        String docName = sc.nextLine();
        System.out.print("Enter Doctor Staff ID: ");
        int docId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        Doctor doctor = new Doctor(docName, docId, specialization);

        System.out.print("\nEnter Nurse Name: ");
        String nurseName = sc.nextLine();
        System.out.print("Enter Nurse Staff ID: ");
        int nurseId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Shift: ");
        String shift = sc.nextLine();
        Nurse nurse = new Nurse(nurseName, nurseId, shift);

        System.out.println();
        doctor.displayDetails();
        nurse.displayDetails();

        sc.close();
    }
}
