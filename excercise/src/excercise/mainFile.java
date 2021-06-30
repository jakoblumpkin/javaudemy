package excercise;

public class mainFile {

	public static void main(String[] args) {
		//Book artOfComputerPrograming = new Book(100);
		//Book effectiveJava = new Book(100);
		Book cleanCode = new Book(1000);

		cleanCode.addBook(40);

		cleanCode.addBook(100);

		cleanCode.removeBook(50);
		
		WhileNumberPlayer jakob = new WhileNumberPlayer(10);
		jakob.printSquaresUptoLimit();
		jakob.printCubesUptoLimit();
	}
}
