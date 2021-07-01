package inheritance;

public class Employee extends Person{
     private String title;
     private String employer;
     private String employeeGrade;
     private String salary;
     
     public Employee(String title, String employer, String employeeGrade, String salary) {
    	 super("john", "3464440138", "lumpkinjakobr@gmail.com");
    	 this.title = title;
    	 this.employer = employer;
    	 this.employeeGrade = employeeGrade;
    	 this.salary = salary;
     }
     
     public void toString() {
    	 System.out.println("Person| name: "+ super().name);
     }
}
