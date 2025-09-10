 class Que1{

static void divideSal(int amount, int employees){
	try{
		int bonus = amount / employees;
		System.out.println("\nEach employee gets bonus of Rs. "+bonus);
	}
	catch(ArithmeticException e){
		System.out.println("\nError: Division by zero not allowed");
	}
}
public static void main(String args[]){
	
	divideSal(10000, 0);
	
}
}