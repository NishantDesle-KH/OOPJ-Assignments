 class HighestSalary {
    public static void main(String[] args) {
        int c1 = 45000;
        int c2 = 52000;
        int c3 = 50000;

        if (c1 > c2 && c1 > c3) {
            System.out.println("Company 1 offers the highest salary.");
        } else if (c2 > c1 && c2 > c3) {
            System.out.println("Company 2 offers the highest salary.");
        } else if (c3 > c1 && c3 > c2) {
            System.out.println("Company 3 offers the highest salary.");
        } else {
            System.out.println("Two or more companies offer the same highest salary.");
        }
    }
}
