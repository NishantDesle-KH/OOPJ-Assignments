import java.util.Scanner;

 class FriendsAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int f1 = sc.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int f2 = sc.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int f3 = sc.nextInt();

        int oldest, youngest;

        if (f1 > f2 && f1 > f3) {
            oldest = 1;
        } else if (f2 > f1 && f2 > f3) {
            oldest = 2;
        } else {
            oldest = 3;
        }

        if (f1 < f2 && f1 < f3) {
            youngest = 1;
        } else if (f2 < f1 && f2 < f3) {
            youngest = 2;
        } else {
            youngest = 3;
        }

        System.out.println("Oldest: Friend " + oldest);
        System.out.println("Youngest: Friend " + youngest);

        sc.close();
    }
}
