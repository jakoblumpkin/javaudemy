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
		//jakob.printSquaresUptoLimit();
		//jakob.printCubesUptoLimit();
		
		//String Excercise -------------
		
		String someString = "This is a lot of text again";
		
		for (int h = 0; h < someString.length(); h++) {
		     System.out.println(someString.charAt(h));
		}
		
		//Methods for strings
		someString.indexOf("lot");
		someString.lastIndexOf('i');
		
		//true of false methods
		someString.contains("text");
		someString.startsWith("This");
		someString.endsWith("again");
		someString.isEmpty();
		"true".equals("true");
		"True".equalsIgnoreCase("trUe");
		
		//aaddd two strings together
		
		someString.concat(" .");
		
		String str2 = "   in28minutes is aewsome  ";
		System.out.println(str2.trim().toUpperCase());
		str2.toLowerCase();
		
		System.out.println("abcd".replace("ab", "xyz"));
		
		
	}
}
