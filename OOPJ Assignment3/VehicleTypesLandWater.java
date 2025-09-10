import java.util.Scanner;

interface LandVehicle {
    void driveOnLand();
}

interface WaterVehicle {
    void driveOnWater();
}
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    String name;

    AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void driveOnLand() {
        System.out.println(name + " → Driving on Land");
    }
    public void driveOnWater() {
        System.out.println(name + " → Driving on Water");
    }
}
class VehicleTypesLandWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amphibious Vehicle Name: ");
        String vehicleName = sc.nextLine();
        AmphibiousVehicle vehicle = new AmphibiousVehicle(vehicleName);

        System.out.println();
        vehicle.driveOnLand();
        vehicle.driveOnWater();

        sc.close();
    }
}
