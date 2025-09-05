import java.util.Scanner;

 class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (Red/Yellow/Green): ");
        String color = sc.next().toLowerCase();   

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready to go");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }

        sc.close();
    }
}
