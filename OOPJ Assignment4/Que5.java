import java.util.Scanner;
public class Que5{
   
    public static void main(String args[]){
	
	Scanner sc = new scanner(System.in);
	int qua=sc.nextInt();
	int n=sc.nextInt();
	double arr[]=new double[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextDouble();
	}
	int index=sc.nextInt();
	try{
	    if(qua==0){
		    throw new ArithmeticException();
		}
        else{
		    double total_price=qua*arr[1];
		}
	}catch(ArithmeticException e){
	    System.out.println(x:"ArithmeticException Caught");
		System.out.println(x:"or");
		try{
		    double j=arr[index];
		}catch(ArrayIndexOutofBoundException e1){
		    System.out.println(x:"Array IndexException");
		}
		
	}
 }

}