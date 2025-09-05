 class ExamEligibility {
    public static void main(String[] args) {
        int total = 100;
        int attended = 60;
        char medical = 'Y';

        double attendance = (attended * 100.0) / total;

        if (attendance >= 75 || medical == 'Y' || medical == 'y') {
            System.out.println("Student is allowed to sit for the exam");
        } else {
            System.out.println("Student is not allowed to sit for the exam");
        }
    }
}
