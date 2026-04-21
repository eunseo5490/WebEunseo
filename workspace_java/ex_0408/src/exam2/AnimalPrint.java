package exam2;

import java.util.List;

public class AnimalPrint {

	public void printAnimals(List<?> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
}
