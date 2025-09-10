import java.util.*;
import java.io.*;
public class Que3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
			String str=sc.nextLine();
			Integer num=Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.out.println("Invalid number format");
		}
	}
}