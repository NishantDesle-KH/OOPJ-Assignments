class Ticket {
    private String passengerName;
    private int ticketNo;
    private static int counter = 5001;

    public Ticket(String passengerName) {
        this.passengerName = passengerName;
        this.ticketNo = counter++;
    }

    public void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Rahul");
        Ticket t2 = new Ticket("Priya");
        Ticket t3 = new Ticket("Amit");

        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
