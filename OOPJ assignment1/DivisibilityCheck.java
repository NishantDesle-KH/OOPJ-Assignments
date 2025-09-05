class DivisibilityCheck {
    public static void main(String[] args) {
        int num = 30;

        if (num % 2 == 0) {
            System.out.println("Divisible by 2");
            if (num % 3 == 0) {
                System.out.println("Divisible by 3");
                if (num % 5 == 0) {
                    System.out.println("Divisible by 5");
                }
            }
        } else {
            System.out.println("Not divisible by 2, 3, and 5 together");
        }
    }
}
