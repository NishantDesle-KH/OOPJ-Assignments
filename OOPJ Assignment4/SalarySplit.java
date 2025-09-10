 class 	Que1 {
    public static void main(String[] args) {
        int bonus = 10000;   
        int employees = 0;   

        divideBonus(bonus, employees);
    }

    static void divideBonus(int bonus, int employees) {
        try {
            if (employees == 0) {
                throw new ArithmeticException("Division by zero not allowed");
            }
            int share = bonus / employees;
            System.out.println("Each employee gets: " + share);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
