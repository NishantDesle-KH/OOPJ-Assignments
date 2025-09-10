import java.util.Scanner;

public class Que10GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String initialText = sc.nextLine();
        String insertText = sc.nextLine();
        int insertIndex = sc.nextInt();
        sc.nextLine(); // consume newline
        String appendText = sc.nextLine();

        StringBuilder sb = new StringBuilder(initialText);
        sb.insert(insertIndex, " " + insertText);
        sb.append(" " + appendText);

        System.out.println(sb.toString());

        sc.close();
    }
}
