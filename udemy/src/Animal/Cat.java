package Animal;

public class Cat extends Animal {
   String sound;
   
   Cat(String sound) {
	   this.sound = sound;
   }
   
   public String bark() {
	   return this.sound;
   }
}
