import java.util.Scanner;

public class Que11NotificationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalText = sc.nextLine();
        String textToFind = sc.nextLine();
        String replacementText = sc.nextLine();

        StringBuilder sb = new StringBuilder(originalText);

        int startIndex = sb.indexOf(textToFind);
        if (startIndex != -1) {
            sb.replace(startIndex, startIndex + textToFind.length(), replacementText);
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
