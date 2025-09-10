interface Notifyable{
	public void sendNotification(String message);
}

abstract class LibraryMember{
	int memberId;
	String name;
	LibraryMember(int memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	abstract public void borrowBook(int count);
}

class Book{
	private int bookId;
	private String title;
	private String author;
	Book(int bookId, String title, String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	public void setBookId(int bookId){
		this.bookId=bookId;
	}
	public int getBookId(){
		return bookId;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
}

class StudentMember extends LibraryMember implements Notifyable{
	int borrowed=0;
	final int limit=3;
	
	StudentMember(int memberId,String name){
		super(memberId,name);
	}
	@Override
	public void borrowBook(int count){
		if(borrowed + count > limit){
			System.out.println("StudentMember " + name + "cannot borrow more than " + limit + " books");
		}
		else{
			borrowed+=count;
			System.out.println("StudentMember " + name + " borrowed " + borrowed + " books");
		}
	}
	public void sendNotification(String message){
		System.out.println("Notification sent to " + name + ": " + message);
	}
}

class FacultyMember extends LibraryMember implements Notifyable {
    private int borrowed = 0;
    private final int limit = 5;

    FacultyMember(int memberID, String name) {
        super(memberID, name);
    }

    @Override
    public void borrowBook(int count) {
        if (borrowed + count > limit) {
            System.out.println("FacultyMember " + name + " cannot borrow more than " + borrowed + " books.");
        } else {
            borrowed += count;
            System.out.println("FacultyMember " + name + " borrowed " + borrowed + " books");
        }
    }
		@Override
		public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}
class LibraryManagementSystem{
	public static void main(String args[]){
		StudentMember student = new StudentMember(001, "Amit");
        FacultyMember faculty = new FacultyMember(001, "Prof. Singh");
		student.borrowBook(2);
        faculty.borrowBook(4);
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
