 class ArmstrongRange {
    public static void main(String[] args) {
        for (int num = 100; num <= 500; num++) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int sum = d1*d1*d1 + d2*d2*d2 + d3*d3*d3;

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
