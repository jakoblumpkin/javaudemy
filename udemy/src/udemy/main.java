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
		sum(9, 3, 4);
	}
	
	//Add as any and outputs a array
	public static void sum(int... value) {
		String [] days = new String [7];
		days[0] = "Sunday";
		days[1] = "Monday";
		days[2] = "Tuesday";
		days[3] = "Wednesday";
		days[4] = "Thursday";
		days[5] = "Friday";
		days[6] = "Saturday";
		
		String current = "Monday";
		int Number = 0;
		
		for (int i = 0; i < days.length; i++) {
			int length = days[i].length();
			if( length  > Number ) {
				Number = length;
				current = days[i];
			};
		}
		System.out.println(current);
	}
 
}
