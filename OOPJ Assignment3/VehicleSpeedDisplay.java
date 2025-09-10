import java.util.Scanner;

class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}
class Car extends Vehicle {
   
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}
class Bike extends Vehicle {
 
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}
 class VehicleSpeedDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike): ");
        String type1 = sc.nextLine();
        System.out.print("Enter vehicle type (Car/Bike): ");
        String type2 = sc.nextLine();

        Vehicle v1, v2;

        if (type1.equalsIgnoreCase("Car")) {
            v1 = new Car();
        } else if (type1.equalsIgnoreCase("Bike")) {
            v1 = new Bike();
        } else {
            v1 = new Vehicle();
        }

        if (type2.equalsIgnoreCase("Car")) {
            v2 = new Car();
        } else if (type2.equalsIgnoreCase("Bike")) {
            v2 = new Bike();
        } else {
            v2 = new Vehicle();
        }

        System.out.println();
        v1.displaySpeed();
        v2.displaySpeed();

        sc.close();
    }
}
