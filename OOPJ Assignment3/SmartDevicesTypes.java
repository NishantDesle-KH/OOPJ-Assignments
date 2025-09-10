import java.util.Scanner;

interface Callable {
    void makeCall(String number);
}

interface Messaging {
    void sendMessage(String number, String message);
}

interface Internet {
    void browse(String website);
}
class SmartPhone implements Callable, Messaging, Internet {
    
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }
}
class SmartDevicesTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to call: ");
        String callNumber = sc.nextLine();

        System.out.print("Enter number to send message: ");
        String msgNumber = sc.nextLine();
        System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.print("Enter website to browse: ");
        String website = sc.nextLine();

        SmartPhone phone = new SmartPhone();
        phone.makeCall(callNumber);
        phone.sendMessage(msgNumber, message);
        phone.browse(website);

        sc.close();
    }
}
