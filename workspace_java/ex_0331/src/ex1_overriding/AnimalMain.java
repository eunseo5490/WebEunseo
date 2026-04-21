package ex1_overriding;

public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		a.sound();
		dog.sound();
		cat.sound();
		
	}
}
