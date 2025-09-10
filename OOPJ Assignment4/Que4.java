import java.util.Scanner;
public class Que4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int work=sc.nextInt();
		try{
			int k=arr[0]/work;
		}catch(ArithmeticException e){
			System.out.println("Division by zero");
			System.out.println("or");
			try{
				int j=arr[5];
			}
			catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("Invalid index");
			}
		}
	}
}