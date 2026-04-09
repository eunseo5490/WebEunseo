package ex1_generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	//List<? super Dog> list에서 허용되는 타입 :
	//List<Dog>, Lisst<Animal>, List<Object>
	public static void addDog(List<? super Dog> list) {
		list.add(new Dog());
		list.add(new Puppy()); //Puppy 객체는 Dog로 취급함
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Puppy> puppyList = new ArrayList<Puppy>();
		
		//둘 다 가능
		addDog(animalList);
		addDog(dogList);
		
		//불가능 (Puppy는 Dog의 자식 클래스이기 때문)
		//addDag(puppyList);
		
	}

}
