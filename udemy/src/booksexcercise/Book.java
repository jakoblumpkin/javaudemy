package booksexcercise;
import java.util.ArrayList;

public class Book {
      int id;
      String name;
      String author;
      ArrayList<Reviews> reviews1 = new ArrayList<Reviews>();
      
      
      Book(int id, String name, String author) {
    	  this.id = id;
    	  this.name = name;
    	  this.author = author;
      }
      
      public void addReview(Reviews one) {
    	  reviews1.add(one);
    	  
    	  for (Reviews i: reviews1) {
    	      System.out.println(i.id);
    	      System.out.println(i.description);
    	      System.out.println(i.rating);
    	  }
      }
}
