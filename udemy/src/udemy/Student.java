package udemy;

public class Student {
   private String name;
   private int [] marks;
   
   Student(String name, int [] marks) {
	   this.name = name;
	   this.marks = marks;
   }
   
   public int getNumberOfMarks() {
     return this.marks.length;
   }
   
   public int getTotalSumOfMarks() {
	   int total = 0;
	   for(int i: this.marks) {
		   total = total + i;
	   }
	   return total;
	}
   
   public int getMax() {
	   int total = 0;
	   for(int i: this.marks) {
		   if(i> total) {
			  total = i;
		   }
	   }
	   return total;
	}
   
   public int getMin() {
	   int number = this.marks[0];
	   for(int i: this.marks) {
		   if(i < number) {
			   number = i;
		   }
	   }
	   return number;
   }
   
   public int getAverage() {
	   return this.getTotalSumOfMarks()/this.marks.length;
   }

}
