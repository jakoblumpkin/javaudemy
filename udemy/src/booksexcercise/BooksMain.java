package booksexcercise;

public class BooksMain {

	public static void main(String[] args) {
		Book book1 = new Book(10, "OOP", "Jakob");
		
		book1.addReview(new Reviews(10, "Great book", 5));
		book1.addReview(new Reviews(101, "Awesome", 5));
	}

}
