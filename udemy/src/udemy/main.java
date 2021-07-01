package udemy;

public class main {

	public static void main(String[] args) {
		int [] marks = {43, 45, 100, 70, 50};
		Student jakob = new Student("jakob", marks);
		
		jakob.getNumberOfMarks();
		jakob.getTotalSumOfMarks();;
		jakob.getMax();
		jakob.getMin();
		System.out.println(jakob.getAverage());
	}

}
