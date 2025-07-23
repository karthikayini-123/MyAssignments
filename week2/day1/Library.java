package week2.day1;

public class Library {
	
	public String addBook() {
		String bookTitle = "Harry Potter";
		System.out.println("Name of the Book:  " + bookTitle);
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library bname = new Library();
		bname.addBook();
		bname.issueBook();
	}

}
