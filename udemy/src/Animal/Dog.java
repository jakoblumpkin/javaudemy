package Animal;

public class Dog extends Animal {
    String sound; 
	Dog(String sound) {
		this.sound = sound;
	}

	public String bark() {
		return this.sound;
	};
}
