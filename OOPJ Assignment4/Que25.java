import java.util.Scanner;

class Que25{

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount as String: ");
		String s1 = sc.nextLine();
		
		System.out.print("Additional amount to add: ");
		int n = sc.nextInt();
		int m = Integer.parseInt(s1);
		
		
		System.out.println(m+" "+n+" = "+(m+n));
    }
}