public class Que8 {

    static void processPayment() {
        try {
            throw new Exception("Payment failed");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done");
        }
    }

    public static void main(String[] args) {
        processPayment();
    }
}
