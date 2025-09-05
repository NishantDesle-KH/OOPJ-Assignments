class Customer {
    private String name;
    private String ticketType;
    private static int totalTickets = 0;  // static counter

    public Customer(String name) {
        this.name = name;
        this.ticketType = "Normal";
        totalTickets++;
    }
    public Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTickets++;
    }
    public void showDetails() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }
    public static void showTotalTickets() {
        System.out.println("Total Tickets Sold: " + totalTickets);
    }
}
public class MovieTicketBooking {
    public static void main(String[] args) {
       
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        System.out.print("Customer1: ");
        c1.showDetails();

        System.out.print("Customer2: ");
        c2.showDetails();

        System.out.print("Customer3: ");
        c3.showDetails();

        Customer.showTotalTickets();
    }
}
