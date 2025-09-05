class Passenger {
    private String name;
    private int age;
    private String seatType;

    private static int totalPassengers = 0;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; // default seat type
        totalPassengers++;
    }

    public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }

    public static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}
public class TicketBooking {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        System.out.print("Passenger1: ");
        p1.showDetails();
        System.out.print("Passenger2: ");
        p2.showDetails();
        System.out.print("Passenger3: ");
        p3.showDetails();

        Passenger.showTotalPassengers();
    }
}
