package inheritance;

public class Person {
    public String name;
    private String phone;
    private String email;
    
    Person(String name, String phone, String email) {
    	this.name = name;
    	this.phone = phone;
    	this.email = email;
    }
    
    public Person() {
    	System.out.println("Hello World");
    }
}
