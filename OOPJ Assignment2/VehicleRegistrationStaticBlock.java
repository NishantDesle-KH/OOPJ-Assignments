class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 1;  

    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount; 
        vehicleCount++;
    }
    public String getRegNo() {
        return regNo;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public void showDetails() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}
public class VehicleRegistrationStaticBlock {
    public static void main(String[] args) {
   
        Vehicle v1 = new Vehicle("Nishant", "Car");
        Vehicle v2 = new Vehicle("Virat", "Bike");
        Vehicle v3 = new Vehicle("Anjali", "Scooter");

        v1.showDetails();
        v2.showDetails();
        v3.showDetails();
    }
}
