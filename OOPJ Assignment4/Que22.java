class Student{
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	@Override
	public void finalize() throws Throwable{
		System.out.println("Student object for "+name+" is being garbage collected");
	}
}

class Que22{
	
	public static void main(String args[]){
		
		Student s = new Student("Amit");
		s = null;
		
		System.gc();
		
	}
}