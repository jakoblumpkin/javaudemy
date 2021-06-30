package excercise;

public class Book {

	private int noOfCopies;

	Book(int speed) {
		this.noOfCopies = speed;
	}
	public void addBook(int quanity) {
		this.noOfCopies = this.noOfCopies + quanity;
		System.out.println("After adding " + this.noOfCopies);
	}

	public void removeBook(int quanity) {
		this.noOfCopies = this.noOfCopies - quanity;
		System.out.println("After removing: " + this.noOfCopies);
}
}
