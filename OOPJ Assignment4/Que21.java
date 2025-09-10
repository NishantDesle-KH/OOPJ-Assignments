class Que21{

    public static void main(String[] args) {
        try {
            // Simulate an exception (e.g., invalid input)
            throw new Exception("Invalid input");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Always runs — even if exception is thrown
            System.out.println("Data processing completed");
        }
    }
}